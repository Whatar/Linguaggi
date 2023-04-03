import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class ex2 extends ex2Visitor{


    @Override
    public Integer visitMain(ex2Parser.MainContext ctx) {
        return visit(ctx.exp());
    }

    @Override
    public Integer visitEnd(ex2Parser.EndContext ctx) {
        return null;
    }

    @Override
    public Integer visitInitialization(ex2Parser.InitializationContext ctx) {
        return null;
    }

    @Override
    public Integer visitExpression(ex2Parser.ExpressionContext ctx) {
        return null;
    }

    @Override
    public Integer visitInit(ex2Parser.InitContext ctx) {
        return null;
    }

    @Override
    public Integer visitInteger(ex2Parser.IntegerContext ctx) {
        return null;
    }

    @Override
    public Integer visitIdentifier(ex2Parser.IdentifierContext ctx) {
        return null;
    }

    @Override
    public Integer visitPlus(ex2Parser.PlusContext ctx) {
        return null;
    }

    @Override
    public Integer visitMul(ex2Parser.MulContext ctx) {
        return null;
    }

    @Override
    public Integer visitMinus(ex2Parser.MinusContext ctx) {
        return null;
    }

    @Override
    public Integer visitMod(ex2Parser.ModContext ctx) {
        return null;
    }

    @Override
    public Integer visit(ParseTree parseTree) {
        return null;
    }

    @Override
    public Integer visitChildren(RuleNode ruleNode) {
        return null;
    }

    @Override
    public Integer visitTerminal(TerminalNode terminalNode) {
        return null;
    }

    @Override
    public Integer visitErrorNode(ErrorNode errorNode) {
        return null;
    }
}
