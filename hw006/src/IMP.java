import value.*;

public class IMP extends IMPBaseVisitor<Value> {
    private final Conf conf;

    public IMP(Conf conf) {
        this.conf = conf;
    }

    private ComValue visitCom(IMPParser.ComContext ctx) {
        return (ComValue) visit(ctx);
    }

    private boolean visitBoolExp(IMPParser.ExpContext ctx) {
        try {
            return ((BoolValue) visitExp(ctx)).getValue();
        } catch (ClassCastException e) {
            System.err.println("Expected boolean expression");
            System.err.println("@ " + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
            System.err.println("Found: " + visitExp(ctx).getClass().getSimpleName());
            System.err.println("Expected: BoolValue");
            System.exit(1);
        }
        return false; // unreachable statement
    }
    @Override
    public Value visitMain(IMPParser.MainContext ctx) {
        return visit(ctx.prog());
    }

    @Override
    public ComValue visitProg(IMPParser.ProgContext ctx) {
        return visitCom(ctx.com());
    }

    public ComValue visitIf(IMPParser.IfContext ctx) {
        return visitBoolExp(ctx.exp()) ? visitCom(ctx.com(0)) : visitCom(ctx.com(1));
    }

    private ExpValue<?> visitExp(IMPParser.ExpContext ctx) {
        return (ExpValue<?>) visit(ctx);
    }

    public ComValue visitAssign(IMPParser.AssignContext ctx) {
        conf.update(ctx.ID().getText(), visitExp(ctx.exp()));
        return ComValue.INSTANCE;
    }

    public ComValue visitWhile(IMPParser.WhileContext ctx) {
        while (visitBoolExp(ctx.exp())) {
            visitCom(ctx.com());
        }
        return ComValue.INSTANCE;
    }

    public ComValue visitSkip(IMPParser.SkipContext ctx) {
        return ComValue.INSTANCE;
    }


    @Override
    public NatValue visitNat(IMPParser.NatContext ctx) {
        return new NatValue(Integer.parseInt(ctx.NAT().getText()));
    }

    public BoolValue visitEqExp(IMPParser.EqExpContext ctx) {
        ExpValue<?> left = visitExp(ctx.exp(0));
        ExpValue<?> right = visitExp(ctx.exp(1));

        return switch (ctx.op.getType()) {
            case IMPParser.EQQ -> new BoolValue(left.equals(right));
            case IMPParser.NEQ -> new BoolValue(!left.equals(right));
            default -> null; // unreachable case
        };
    }

    @Override
    public NatValue visitPlusMinus(IMPParser.PlusMinusContext ctx) {
        return switch (ctx.op.getType()) {
            case IMPParser.PLUS  -> new NatValue(visitExp(ctx.exp(0)).op(visitExp(ctx.exp(1)), "+"));
            case IMPParser.MINUS -> new NatValue(visitExp(ctx.exp(0)).op(visitExp(ctx.exp(1)), "-"));
            default -> null; // unreachable case
        };
    }

    @Override
    public ExpValue<?> visitId(IMPParser.IdContext ctx) {
        String id = ctx.ID().getText();

        if(conf.getMem().containsKey(id)){
            return conf.getMem().get(id);
        }
        else{
            System.err.println("Variable " + id + " not found");
            System.exit(1);
        }
        return null; // unreachable statement
    }

    @Override
    public Value visitMulDivMod(IMPParser.MulDivModContext ctx) {
        return switch (ctx.op.getType()) {
            case IMPParser.TIMES -> new NatValue(visitExp(ctx.exp(0)).op(visitExp(ctx.exp(1)), "*"));
            case IMPParser.DIV   -> new NatValue(visitExp(ctx.exp(0)).op(visitExp(ctx.exp(1)), "/"));
            case IMPParser.MOD   ->new NatValue(visitExp(ctx.exp(0)).op(visitExp(ctx.exp(1)), "%"));
            default -> null; // unreachable case
        };
    }

    @Override
    public Value visitPow(IMPParser.PowContext ctx) {
        return new NatValue(visitExp(ctx.exp(0)).op(visitExp(ctx.exp(1)), "^"));
    }

    @Override
    public Value visitParExp(IMPParser.ParExpContext ctx) {
        return visit(ctx.exp());
    }

    @Override
    public Value visitOut(IMPParser.OutContext ctx) {
        System.out.println(visitExp(ctx.exp()).getValue());
        return null;
    }
}
