// Generated from /home/leonardo/Documents/GitHub/Linguaggi/hw05/src/floatExp.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link floatExpParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface floatExpVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link floatExpParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(floatExpParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link floatExpParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(floatExpParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idinit}
	 * labeled alternative in {@link floatExpParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdinit(floatExpParser.IdinitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nilinit}
	 * labeled alternative in {@link floatExpParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNilinit(floatExpParser.NilinitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bdiv}
	 * labeled alternative in {@link floatExpParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBdiv(floatExpParser.BdivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code minus}
	 * labeled alternative in {@link floatExpParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus(floatExpParser.MinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bminus}
	 * labeled alternative in {@link floatExpParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBminus(floatExpParser.BminusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mod}
	 * labeled alternative in {@link floatExpParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMod(floatExpParser.ModContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bplus}
	 * labeled alternative in {@link floatExpParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBplus(floatExpParser.BplusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mul}
	 * labeled alternative in {@link floatExpParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(floatExpParser.MulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code num}
	 * labeled alternative in {@link floatExpParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(floatExpParser.NumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bmul}
	 * labeled alternative in {@link floatExpParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBmul(floatExpParser.BmulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bmod}
	 * labeled alternative in {@link floatExpParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBmod(floatExpParser.BmodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plus}
	 * labeled alternative in {@link floatExpParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus(floatExpParser.PlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code div}
	 * labeled alternative in {@link floatExpParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(floatExpParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bexponent}
	 * labeled alternative in {@link floatExpParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBexponent(floatExpParser.BexponentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link floatExpParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(floatExpParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exponent}
	 * labeled alternative in {@link floatExpParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExponent(floatExpParser.ExponentContext ctx);
}