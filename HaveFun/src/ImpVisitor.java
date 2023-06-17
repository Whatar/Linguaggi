// Generated from C:/Users/leona/Documents/Github/Linguaggi/HaveFun/src\Imp.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ImpParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ImpVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ImpParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(ImpParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImpParser#fun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFun(ImpParser.FunContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImpParser#vars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVars(ImpParser.VarsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImpParser#newGlobalAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewGlobalAssign(ImpParser.NewGlobalAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nonDet}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonDet(ImpParser.NonDetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code globalAssign}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalAssign(ImpParser.GlobalAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code skip}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkip(ImpParser.SkipContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(ImpParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(ImpParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnoldC}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnoldC(ImpParser.ArnoldCContext ctx);
	/**
	 * Visit a parse tree produced by the {@code seq}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeq(ImpParser.SeqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(ImpParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code out}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOut(ImpParser.OutContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nat}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNat(ImpParser.NatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plusMinus}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusMinus(ImpParser.PlusMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(ImpParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code globalId}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalId(ImpParser.GlobalIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funCall}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunCall(ImpParser.FunCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code divMulMod}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivMulMod(ImpParser.DivMulModContext ctx);
	/**
	 * Visit a parse tree produced by the {@code not}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(ImpParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqExp}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqExp(ImpParser.EqExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cmpExp}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmpExp(ImpParser.CmpExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicExp}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicExp(ImpParser.LogicExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parExp}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExp(ImpParser.ParExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pow}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPow(ImpParser.PowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link ImpParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(ImpParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arncMetCall}
	 * labeled alternative in {@link ImpParser#arncCom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArncMetCall(ImpParser.ArncMetCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arncIf}
	 * labeled alternative in {@link ImpParser#arncCom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArncIf(ImpParser.ArncIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arncOpResAssign}
	 * labeled alternative in {@link ImpParser#arncCom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArncOpResAssign(ImpParser.ArncOpResAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arncWhile}
	 * labeled alternative in {@link ImpParser#arncCom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArncWhile(ImpParser.ArncWhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arncSeq}
	 * labeled alternative in {@link ImpParser#arncCom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArncSeq(ImpParser.ArncSeqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arncPrint}
	 * labeled alternative in {@link ImpParser#arncCom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArncPrint(ImpParser.ArncPrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arncAssign}
	 * labeled alternative in {@link ImpParser#arncCom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArncAssign(ImpParser.ArncAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arncGlobalAssign}
	 * labeled alternative in {@link ImpParser#arncCom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArncGlobalAssign(ImpParser.ArncGlobalAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link ImpParser#arncMet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArncMet(ImpParser.ArncMetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arncMetNonVoid}
	 * labeled alternative in {@link ImpParser#arncMetBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArncMetNonVoid(ImpParser.ArncMetNonVoidContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arncMetVoid}
	 * labeled alternative in {@link ImpParser#arncMetBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArncMetVoid(ImpParser.ArncMetVoidContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arncNat}
	 * labeled alternative in {@link ImpParser#arncExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArncNat(ImpParser.ArncNatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arncFloat}
	 * labeled alternative in {@link ImpParser#arncExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArncFloat(ImpParser.ArncFloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arncBool}
	 * labeled alternative in {@link ImpParser#arncExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArncBool(ImpParser.ArncBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arncString}
	 * labeled alternative in {@link ImpParser#arncExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArncString(ImpParser.ArncStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arncParExp}
	 * labeled alternative in {@link ImpParser#arncExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArncParExp(ImpParser.ArncParExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arncValzero}
	 * labeled alternative in {@link ImpParser#arncExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArncValzero(ImpParser.ArncValzeroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arncValone}
	 * labeled alternative in {@link ImpParser#arncExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArncValone(ImpParser.ArncValoneContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arncId}
	 * labeled alternative in {@link ImpParser#arncExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArncId(ImpParser.ArncIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arncFunCall}
	 * labeled alternative in {@link ImpParser#arncExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArncFunCall(ImpParser.ArncFunCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arncDivMul}
	 * labeled alternative in {@link ImpParser#arncOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArncDivMul(ImpParser.ArncDivMulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arncPlusMinus}
	 * labeled alternative in {@link ImpParser#arncOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArncPlusMinus(ImpParser.ArncPlusMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arncCmpOp}
	 * labeled alternative in {@link ImpParser#arncOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArncCmpOp(ImpParser.ArncCmpOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arncLogOp}
	 * labeled alternative in {@link ImpParser#arncOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArncLogOp(ImpParser.ArncLogOpContext ctx);
}