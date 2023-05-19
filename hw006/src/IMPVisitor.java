// Generated from C:/Users/leona/IdeaProjects/Linguaggi/hw006/src\IMP.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link IMPParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface IMPVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link IMPParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(IMPParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link IMPParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(IMPParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code skip}
	 * labeled alternative in {@link IMPParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkip(IMPParser.SkipContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while}
	 * labeled alternative in {@link IMPParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(IMPParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if}
	 * labeled alternative in {@link IMPParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(IMPParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code seq}
	 * labeled alternative in {@link IMPParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeq(IMPParser.SeqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link IMPParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(IMPParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code out}
	 * labeled alternative in {@link IMPParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOut(IMPParser.OutContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nat}
	 * labeled alternative in {@link IMPParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNat(IMPParser.NatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulDivMod}
	 * labeled alternative in {@link IMPParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivMod(IMPParser.MulDivModContext ctx);
	/**
	 * Visit a parse tree produced by the {@code not}
	 * labeled alternative in {@link IMPParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(IMPParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plusMinus}
	 * labeled alternative in {@link IMPParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusMinus(IMPParser.PlusMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqExp}
	 * labeled alternative in {@link IMPParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqExp(IMPParser.EqExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link IMPParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(IMPParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cmpExp}
	 * labeled alternative in {@link IMPParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmpExp(IMPParser.CmpExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicExp}
	 * labeled alternative in {@link IMPParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicExp(IMPParser.LogicExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parExp}
	 * labeled alternative in {@link IMPParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExp(IMPParser.ParExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pow}
	 * labeled alternative in {@link IMPParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPow(IMPParser.PowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link IMPParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(IMPParser.IdContext ctx);
}