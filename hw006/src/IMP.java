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
        conf.updateMem(ctx.ID().getText(), visitExp(ctx.exp()));
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
    public StrValue visitStr(IMPParser.StrContext ctx) {
        if (ctx.STRING() != null){
        return new StrValue(ctx.STRING().getText());} // return the string
        else{
            return new StrValue(visitToString(ctx.exp())); // convert to string and return it
        }
    }

    private String visitToString(IMPParser.ExpContext ctx) {
        try{
            return (visitExp(ctx)).getValue().toString(); // get the value, convert to string, and return it
        } catch (ClassCastException e) {
            return conf.getStringArray(ctx.getText());
        }
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

    public BoolValue visitCmpExp(IMPParser.CmpExpContext ctx) {
        ExpValue<?> left = visitExp(ctx.exp(0));
        ExpValue<?> right = visitExp(ctx.exp(1));

        return switch (ctx.op.getType()) {
            case IMPParser.LT -> new BoolValue(left.op(right, "<") > 0);
            case IMPParser.GT -> new BoolValue(left.op(right, ">") > 0);
            case IMPParser.LEQ -> new BoolValue(left.op(right, "<=") > 0);
            case IMPParser.GEQ -> new BoolValue(left.op(right, ">=") > 0);
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
        else if(conf.getArrays().containsKey(id)){
            return new StrValue(conf.getStringArray(id));
        }
        else{
            System.err.println("Variable not found " + id);
            System.err.println("@ " + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
            System.exit(1);
            return null;
        }
    }



    @Override
    public ExpValue<?> visitArrayElem(IMPParser.ArrayElemContext ctx) {
        String id = ctx.ID().getText();
        int index = ((NatValue) visitExp(ctx.exp())).getValue();

        if(conf.getArrays().containsKey(id)){
            return conf.getArrays().get(id).get(index);
        } else{
            System.err.println("Array not found");
            System.exit(1);
            return null;
        }
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
        for (IMPParser.StrContext str : ctx.str()) {
                System.out.print(visitStr(str).getValue().replace("\"", ""));
        }
        return null;
    }

    @Override
    public Value visitArrayAssign(IMPParser.ArrayAssignContext ctx) {
        String id = ctx.ID().getText();
        int index = ((NatValue) visitExp(ctx.exp(0))).getValue();
        ExpValue<?> value = visitExp(ctx.exp(1));

        conf.updateArray(id, index, value);
        return value;
    }
}
