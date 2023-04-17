// Generated from C:/Users/leona/Documents/Github/Linguaggi/hw03/src\ex2.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ex2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ex2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ex2Parser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(ex2Parser.MainContext ctx);
	/**
	 * Visit a parse tree produced by the {@code end}
	 * labeled alternative in {@link ex2Parser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd(ex2Parser.EndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code initialization}
	 * labeled alternative in {@link ex2Parser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialization(ex2Parser.InitializationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expression}
	 * labeled alternative in {@link ex2Parser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ex2Parser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ex2Parser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(ex2Parser.InitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integer}
	 * labeled alternative in {@link ex2Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(ex2Parser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link ex2Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(ex2Parser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plus}
	 * labeled alternative in {@link ex2Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus(ex2Parser.PlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mul}
	 * labeled alternative in {@link ex2Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(ex2Parser.MulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code minus}
	 * labeled alternative in {@link ex2Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus(ex2Parser.MinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code div}
	 * labeled alternative in {@link ex2Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(ex2Parser.DivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mod}
	 * labeled alternative in {@link ex2Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMod(ex2Parser.ModContext ctx);
}