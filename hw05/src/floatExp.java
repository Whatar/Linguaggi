import java.util.HashMap;
import java.util.Map;

public class floatExp extends floatExpBaseVisitor<Float>{
    private final Map<String, Float> mem = new HashMap<>();

    @Override
    public Float visitMain(floatExpParser.MainContext ctx) {
        return visit(ctx.prog());
    }

    @Override
    public Float visitProg(floatExpParser.ProgContext ctx) {
        visit(ctx.init());
        return visit(ctx.exp());
    }

    @Override
    public Float visitIdinit(floatExpParser.IdinitContext ctx) {
        String id = ctx.ID().getText();
        Float val = visit(ctx.exp());

        mem.put(id, val);

        return visit(ctx.init());
    }

    @Override
    public Float visitNilinit(floatExpParser.NilinitContext ctx) {
        return null;
    }

    @Override
    public Float visitNum(floatExpParser.NumContext ctx) {
        return Float.parseFloat(ctx.NUM().getText());
    }

    @Override
    public Float visitId(floatExpParser.IdContext ctx) {
        return mem.getOrDefault(ctx.ID().getText(), 0f);
    }

    @Override
    public Float visitPlus(floatExpParser.PlusContext ctx) {
        return visit(ctx.exp(0)) + visit(ctx.exp(1));
    }

    @Override
    public Float visitBplus(floatExpParser.BplusContext ctx) {
        return visit(ctx.exp(0)) + visit(ctx.exp(1));
    }

    @Override
    public Float visitBminus(floatExpParser.BminusContext ctx) {
        return visit(ctx.exp(0)) - visit(ctx.exp(1));
    }

    @Override
    public Float visitBmul(floatExpParser.BmulContext ctx) {
        return visit(ctx.exp(0)) * visit(ctx.exp(1));
    }

    @Override
    public Float visitBdiv(floatExpParser.BdivContext ctx) {
        return visit(ctx.exp(0)) / visit(ctx.exp(1));
    }

    @Override
    public Float visitBmod(floatExpParser.BmodContext ctx) {
        return visit(ctx.exp(0)) % visit(ctx.exp(1));
    }

    @Override
    public Float visitBexponent(floatExpParser.BexponentContext ctx) {
        return (float) Math.pow(visit(ctx.exp(0)), visit(ctx.exp(1)));
    }

    @Override
    public Float visitMinus(floatExpParser.MinusContext ctx) {
        return visit(ctx.exp(0)) - visit(ctx.exp(1));
    }

    @Override
    public Float visitMul(floatExpParser.MulContext ctx) {
        return visit(ctx.exp(0)) * visit(ctx.exp(1));
    }

    @Override
    public Float visitDiv(floatExpParser.DivContext ctx) {
        return visit(ctx.exp(0)) / visit(ctx.exp(1));
    }

    @Override
    public Float visitMod(floatExpParser.ModContext ctx) {
        return visit(ctx.exp(0)) % visit(ctx.exp(1));
    }

    @Override
    public Float visitExponent(floatExpParser.ExponentContext ctx) {
        return (float) Math.pow(visit(ctx.exp(0)), visit(ctx.exp(1)));
    }
}
