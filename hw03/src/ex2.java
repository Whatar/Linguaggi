import java.util.HashMap;

public class ex2 extends ex2BaseVisitor<Integer>{
    // memory HashMap
    private HashMap<String, Integer> memory = new HashMap<>();
    private Integer result;

    @Override
    public Integer visitMain(ex2Parser.MainContext ctx) {
        return visit(ctx.start());
    }

    @Override
    public Integer visitLast(ex2Parser.LastContext ctx) {
        System.out.println(visit(ctx.exp()));
        return null;
    }

    @Override
    public Integer visitInitialization(ex2Parser.InitializationContext ctx) {
        visit(ctx.init());
        return visit(ctx.start());
    }

    @Override
    public Integer visitExpression(ex2Parser.ExpressionContext ctx) {
        visit(ctx.exp());
        result = visit(ctx.exp());
        return visit(ctx.start());
    }

    @Override
    public Integer visitInit(ex2Parser.InitContext ctx) {
        // initialize the identifier, assigning the value of the expression to it
        getMemory().put(ctx.ID().getText(), visit(ctx.exp()));
        return null;
    }

    @Override
    public Integer visitInteger(ex2Parser.IntegerContext ctx) {
        return Integer.parseInt(ctx.INTEGER().getText());
    }

    @Override
    public Integer visitIdentifier(ex2Parser.IdentifierContext ctx) {
        // returns the value of the identifier in memory
        // if null, the identifier was not initialized, therefore we initialize it with 0
        getMemory().putIfAbsent(ctx.ID().getText(), 0);
        return getMemory().get(ctx.ID().getText());
    }

    @Override
    public Integer visitPlus(ex2Parser.PlusContext ctx) {
        int left = visit(ctx.exp(0));
        int right = visit(ctx.exp(1));

        return left + right;
    }

    @Override
    public Integer visitMul(ex2Parser.MulContext ctx) {
        int left = visit(ctx.exp(0));
        int right = visit(ctx.exp(1));

        return left * right;
    }

    @Override
    public Integer visitDiv(ex2Parser.DivContext ctx) {
        int left = visit(ctx.exp(0));
        int right = visit(ctx.exp(1));

        return left / right;
    }

    @Override
    public Integer visitMinus(ex2Parser.MinusContext ctx) {
        int left = visit(ctx.exp(0));
        int right = visit(ctx.exp(1));

        return left - right;
    }

    @Override
    public Integer visitMod(ex2Parser.ModContext ctx) {

        int left = visit(ctx.exp(0));
        int right = visit(ctx.exp(1));

        return left % right;
    }

    public HashMap<String, Integer> getMemory() {
        return memory;
    }

    public Integer getResult() {
        return result;
    }
}
