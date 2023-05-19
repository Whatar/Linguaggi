import java.util.HashMap;
import java.util.Map;

public class IMP extends IMPBaseVisitor<Double> {

    private final Map<String, Double> mem = new HashMap<>();

    @Override
    public Double visitMain(IMPParser.MainContext ctx) {
        return visit(ctx.prog());
    }

    @Override
    public Double visitProg(IMPParser.ProgContext ctx) {
        visit(ctx.com());
        return visit(ctx.com());
    }

    @Override
    public Double visitNat(IMPParser.NatContext ctx) {
        return Double.parseDouble(ctx.NAT().getText());
    }

    @Override
    public Double visitId(IMPParser.IdContext ctx) {
        return mem.getOrDefault(ctx.ID().getText(), 0.0);
    }

    @Override
    public Double visitPlusMinus(IMPParser.PlusMinusContext ctx) {
        return switch (ctx.op.getType()) {
            case IMPParser.PLUS  -> visit(ctx.exp(0)) + visit(ctx.exp(1));
            case IMPParser.MINUS -> visit(ctx.exp(0)) - visit(ctx.exp(1));
            default -> null; // unreachable case
        };
    }

    @Override
    public Double visitMulDivMod(IMPParser.MulDivModContext ctx) {
        return switch (ctx.op.getType()) {
            case IMPParser.TIMES -> visit(ctx.exp(0)) * visit(ctx.exp(1));
            case IMPParser.DIV   -> visit(ctx.exp(0)) / visit(ctx.exp(1));
            case IMPParser.MOD   -> visit(ctx.exp(0)) % visit(ctx.exp(1));
            default -> null; // unreachable case
        };
    }

    @Override
    public Double visitPow(IMPParser.PowContext ctx) {
        return Math.pow(visit(ctx.exp(0)), visit(ctx.exp(1)));
    }

    @Override
    public Double visitParExp(IMPParser.ParExpContext ctx) {
        return visit(ctx.exp());
    }
}
