// Generated from C:/Users/leona/IdeaProjects/Linguaggi/hw04/src\bf.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link bfParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface bfVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link bfParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(bfParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lt}
	 * labeled alternative in {@link bfParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLt(bfParser.LtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code gt}
	 * labeled alternative in {@link bfParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGt(bfParser.GtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plus}
	 * labeled alternative in {@link bfParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus(bfParser.PlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code minus}
	 * labeled alternative in {@link bfParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus(bfParser.MinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dot}
	 * labeled alternative in {@link bfParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDot(bfParser.DotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comma}
	 * labeled alternative in {@link bfParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma(bfParser.CommaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code loop}
	 * labeled alternative in {@link bfParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(bfParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nil}
	 * labeled alternative in {@link bfParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNil(bfParser.NilContext ctx);
}