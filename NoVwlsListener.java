// Generated from ./NoVwls.g4 by ANTLR 4.13.2
 import java.util.*; 
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NoVwlsParser}.
 */
public interface NoVwlsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NoVwlsParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(NoVwlsParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoVwlsParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(NoVwlsParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link NoVwlsParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(NoVwlsParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoVwlsParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(NoVwlsParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link NoVwlsParser#blockStmt}.
	 * @param ctx the parse tree
	 */
	void enterBlockStmt(NoVwlsParser.BlockStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoVwlsParser#blockStmt}.
	 * @param ctx the parse tree
	 */
	void exitBlockStmt(NoVwlsParser.BlockStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link NoVwlsParser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignStmt(NoVwlsParser.AssignStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoVwlsParser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignStmt(NoVwlsParser.AssignStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link NoVwlsParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintStmt(NoVwlsParser.PrintStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoVwlsParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintStmt(NoVwlsParser.PrintStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link NoVwlsParser#varC}.
	 * @param ctx the parse tree
	 */
	void enterVarC(NoVwlsParser.VarCContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoVwlsParser#varC}.
	 * @param ctx the parse tree
	 */
	void exitVarC(NoVwlsParser.VarCContext ctx);
	/**
	 * Enter a parse tree produced by {@link NoVwlsParser#compareStmt}.
	 * @param ctx the parse tree
	 */
	void enterCompareStmt(NoVwlsParser.CompareStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoVwlsParser#compareStmt}.
	 * @param ctx the parse tree
	 */
	void exitCompareStmt(NoVwlsParser.CompareStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link NoVwlsParser#functStmt}.
	 * @param ctx the parse tree
	 */
	void enterFunctStmt(NoVwlsParser.FunctStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoVwlsParser#functStmt}.
	 * @param ctx the parse tree
	 */
	void exitFunctStmt(NoVwlsParser.FunctStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link NoVwlsParser#loopStmt}.
	 * @param ctx the parse tree
	 */
	void enterLoopStmt(NoVwlsParser.LoopStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoVwlsParser#loopStmt}.
	 * @param ctx the parse tree
	 */
	void exitLoopStmt(NoVwlsParser.LoopStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link NoVwlsParser#while}.
	 * @param ctx the parse tree
	 */
	void enterWhile(NoVwlsParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoVwlsParser#while}.
	 * @param ctx the parse tree
	 */
	void exitWhile(NoVwlsParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link NoVwlsParser#for}.
	 * @param ctx the parse tree
	 */
	void enterFor(NoVwlsParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoVwlsParser#for}.
	 * @param ctx the parse tree
	 */
	void exitFor(NoVwlsParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by {@link NoVwlsParser#doWhile}.
	 * @param ctx the parse tree
	 */
	void enterDoWhile(NoVwlsParser.DoWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoVwlsParser#doWhile}.
	 * @param ctx the parse tree
	 */
	void exitDoWhile(NoVwlsParser.DoWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link NoVwlsParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(NoVwlsParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoVwlsParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(NoVwlsParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link NoVwlsParser#elseC}.
	 * @param ctx the parse tree
	 */
	void enterElseC(NoVwlsParser.ElseCContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoVwlsParser#elseC}.
	 * @param ctx the parse tree
	 */
	void exitElseC(NoVwlsParser.ElseCContext ctx);
	/**
	 * Enter a parse tree produced by {@link NoVwlsParser#argC}.
	 * @param ctx the parse tree
	 */
	void enterArgC(NoVwlsParser.ArgCContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoVwlsParser#argC}.
	 * @param ctx the parse tree
	 */
	void exitArgC(NoVwlsParser.ArgCContext ctx);
	/**
	 * Enter a parse tree produced by {@link NoVwlsParser#forLoopInc}.
	 * @param ctx the parse tree
	 */
	void enterForLoopInc(NoVwlsParser.ForLoopIncContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoVwlsParser#forLoopInc}.
	 * @param ctx the parse tree
	 */
	void exitForLoopInc(NoVwlsParser.ForLoopIncContext ctx);
	/**
	 * Enter a parse tree produced by {@link NoVwlsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(NoVwlsParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoVwlsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(NoVwlsParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link NoVwlsParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(NoVwlsParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoVwlsParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(NoVwlsParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link NoVwlsParser#comparisonExpr}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpr(NoVwlsParser.ComparisonExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoVwlsParser#comparisonExpr}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpr(NoVwlsParser.ComparisonExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link NoVwlsParser#additiveExpr}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpr(NoVwlsParser.AdditiveExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoVwlsParser#additiveExpr}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpr(NoVwlsParser.AdditiveExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link NoVwlsParser#multiplicativeExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpr(NoVwlsParser.MultiplicativeExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoVwlsParser#multiplicativeExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpr(NoVwlsParser.MultiplicativeExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link NoVwlsParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(NoVwlsParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoVwlsParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(NoVwlsParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link NoVwlsParser#comparer}.
	 * @param ctx the parse tree
	 */
	void enterComparer(NoVwlsParser.ComparerContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoVwlsParser#comparer}.
	 * @param ctx the parse tree
	 */
	void exitComparer(NoVwlsParser.ComparerContext ctx);
	/**
	 * Enter a parse tree produced by {@link NoVwlsParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(NoVwlsParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoVwlsParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(NoVwlsParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link NoVwlsParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(NoVwlsParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoVwlsParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(NoVwlsParser.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NoVwlsParser#primitiveDT}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveDT(NoVwlsParser.PrimitiveDTContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoVwlsParser#primitiveDT}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveDT(NoVwlsParser.PrimitiveDTContext ctx);
	/**
	 * Enter a parse tree produced by {@link NoVwlsParser#arrayDT}.
	 * @param ctx the parse tree
	 */
	void enterArrayDT(NoVwlsParser.ArrayDTContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoVwlsParser#arrayDT}.
	 * @param ctx the parse tree
	 */
	void exitArrayDT(NoVwlsParser.ArrayDTContext ctx);
	/**
	 * Enter a parse tree produced by {@link NoVwlsParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(NoVwlsParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoVwlsParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(NoVwlsParser.ArrayContext ctx);
}