// Generated from ex1.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link testParser}.
 */
public interface testListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link testParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(testParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(testParser.MainContext ctx);
}