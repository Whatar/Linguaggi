// Generated from C:/Users/leona/Documents/GitHub/Linguaggi/HaveFun/src\Imp.g4 by ANTLR 4.12.0
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
	 * Visit a parse tree produced by the {@code newGlobalAssign}
	 * labeled alternative in {@link ImpParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewGlobalAssign(ImpParser.NewGlobalAssignContext ctx);
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
	 * Visit a parse tree produced by {@link ImpParser#arnc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnc(ImpParser.ArncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnc_print}
	 * labeled alternative in {@link ImpParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnc_print(ImpParser.Arnc_printContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnc_declaration}
	 * labeled alternative in {@link ImpParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnc_declaration(ImpParser.Arnc_declarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnc_globalDeclaration}
	 * labeled alternative in {@link ImpParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnc_globalDeclaration(ImpParser.Arnc_globalDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnc_assign}
	 * labeled alternative in {@link ImpParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnc_assign(ImpParser.Arnc_assignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnc_globalAssign}
	 * labeled alternative in {@link ImpParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnc_globalAssign(ImpParser.Arnc_globalAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnc_if}
	 * labeled alternative in {@link ImpParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnc_if(ImpParser.Arnc_ifContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnc_while}
	 * labeled alternative in {@link ImpParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnc_while(ImpParser.Arnc_whileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnc_plusMinus}
	 * labeled alternative in {@link ImpParser#arnc_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnc_plusMinus(ImpParser.Arnc_plusMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnc_nat}
	 * labeled alternative in {@link ImpParser#arnc_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnc_nat(ImpParser.Arnc_natContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnc_logicExp}
	 * labeled alternative in {@link ImpParser#arnc_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnc_logicExp(ImpParser.Arnc_logicExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnc_float}
	 * labeled alternative in {@link ImpParser#arnc_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnc_float(ImpParser.Arnc_floatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnc_parExp}
	 * labeled alternative in {@link ImpParser#arnc_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnc_parExp(ImpParser.Arnc_parExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnc_funCall}
	 * labeled alternative in {@link ImpParser#arnc_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnc_funCall(ImpParser.Arnc_funCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnc_eqExp}
	 * labeled alternative in {@link ImpParser#arnc_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnc_eqExp(ImpParser.Arnc_eqExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnc_divMulMod}
	 * labeled alternative in {@link ImpParser#arnc_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnc_divMulMod(ImpParser.Arnc_divMulModContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnc_pow}
	 * labeled alternative in {@link ImpParser#arnc_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnc_pow(ImpParser.Arnc_powContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnc_valone}
	 * labeled alternative in {@link ImpParser#arnc_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnc_valone(ImpParser.Arnc_valoneContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnc_id}
	 * labeled alternative in {@link ImpParser#arnc_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnc_id(ImpParser.Arnc_idContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnc_string}
	 * labeled alternative in {@link ImpParser#arnc_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnc_string(ImpParser.Arnc_stringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnc_not}
	 * labeled alternative in {@link ImpParser#arnc_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnc_not(ImpParser.Arnc_notContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnc_bool}
	 * labeled alternative in {@link ImpParser#arnc_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnc_bool(ImpParser.Arnc_boolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnc_cmpExp}
	 * labeled alternative in {@link ImpParser#arnc_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnc_cmpExp(ImpParser.Arnc_cmpExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnc_valzero}
	 * labeled alternative in {@link ImpParser#arnc_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnc_valzero(ImpParser.Arnc_valzeroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnc_globalId}
	 * labeled alternative in {@link ImpParser#arnc_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnc_globalId(ImpParser.Arnc_globalIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnc_plus}
	 * labeled alternative in {@link ImpParser#arnc_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnc_plus(ImpParser.Arnc_plusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnc_minus}
	 * labeled alternative in {@link ImpParser#arnc_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnc_minus(ImpParser.Arnc_minusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnc_mul}
	 * labeled alternative in {@link ImpParser#arnc_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnc_mul(ImpParser.Arnc_mulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnc_div}
	 * labeled alternative in {@link ImpParser#arnc_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnc_div(ImpParser.Arnc_divContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnc_equ}
	 * labeled alternative in {@link ImpParser#arnc_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnc_equ(ImpParser.Arnc_equContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnc_gt}
	 * labeled alternative in {@link ImpParser#arnc_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnc_gt(ImpParser.Arnc_gtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnc_or}
	 * labeled alternative in {@link ImpParser#arnc_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnc_or(ImpParser.Arnc_orContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arnc_and}
	 * labeled alternative in {@link ImpParser#arnc_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnc_and(ImpParser.Arnc_andContext ctx);
}