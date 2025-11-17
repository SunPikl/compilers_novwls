// Generated from c:/Users/Morgan/Downloads/fall_25/Compilers/compilers_novwls/NoVwls.g4 by ANTLR 4.13.1
 import java.util.*; import java.io.*;
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
	 * Enter a parse tree produced by {@link NoVwlsParser#arrayDeclWithSize}.
	 * @param ctx the parse tree
	 */
	void enterArrayDeclWithSize(NoVwlsParser.ArrayDeclWithSizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoVwlsParser#arrayDeclWithSize}.
	 * @param ctx the parse tree
	 */
	void exitArrayDeclWithSize(NoVwlsParser.ArrayDeclWithSizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NoVwlsParser#declareStmt}.
	 * @param ctx the parse tree
	 */
	void enterDeclareStmt(NoVwlsParser.DeclareStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoVwlsParser#declareStmt}.
	 * @param ctx the parse tree
	 */
	void exitDeclareStmt(NoVwlsParser.DeclareStmtContext ctx);
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
	 * Enter a parse tree produced by {@link NoVwlsParser#rhs}.
	 * @param ctx the parse tree
	 */
	void enterRhs(NoVwlsParser.RhsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoVwlsParser#rhs}.
	 * @param ctx the parse tree
	 */
	void exitRhs(NoVwlsParser.RhsContext ctx);
	/**
	 * Enter a parse tree produced by {@link NoVwlsParser#arrayAssignStmt}.
	 * @param ctx the parse tree
	 */
	void enterArrayAssignStmt(NoVwlsParser.ArrayAssignStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoVwlsParser#arrayAssignStmt}.
	 * @param ctx the parse tree
	 */
	void exitArrayAssignStmt(NoVwlsParser.ArrayAssignStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link NoVwlsParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteral(NoVwlsParser.ArrayLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoVwlsParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteral(NoVwlsParser.ArrayLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link NoVwlsParser#arrayElement}.
	 * @param ctx the parse tree
	 */
	void enterArrayElement(NoVwlsParser.ArrayElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoVwlsParser#arrayElement}.
	 * @param ctx the parse tree
	 */
	void exitArrayElement(NoVwlsParser.ArrayElementContext ctx);
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
	 * Enter a parse tree produced by {@link NoVwlsParser#printExpr}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpr(NoVwlsParser.PrintExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoVwlsParser#printExpr}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpr(NoVwlsParser.PrintExprContext ctx);
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
	 * Enter a parse tree produced by {@link NoVwlsParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(NoVwlsParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoVwlsParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(NoVwlsParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link NoVwlsParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(NoVwlsParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoVwlsParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(NoVwlsParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link NoVwlsParser#doWhileLoop}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileLoop(NoVwlsParser.DoWhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoVwlsParser#doWhileLoop}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileLoop(NoVwlsParser.DoWhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link NoVwlsParser#breakStmt}.
	 * @param ctx the parse tree
	 */
	void enterBreakStmt(NoVwlsParser.BreakStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoVwlsParser#breakStmt}.
	 * @param ctx the parse tree
	 */
	void exitBreakStmt(NoVwlsParser.BreakStmtContext ctx);
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
	 * Enter a parse tree produced by {@link NoVwlsParser#functCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctCall(NoVwlsParser.FunctCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoVwlsParser#functCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctCall(NoVwlsParser.FunctCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link NoVwlsParser#functDefine}.
	 * @param ctx the parse tree
	 */
	void enterFunctDefine(NoVwlsParser.FunctDefineContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoVwlsParser#functDefine}.
	 * @param ctx the parse tree
	 */
	void exitFunctDefine(NoVwlsParser.FunctDefineContext ctx);
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
	 * Enter a parse tree produced by {@link NoVwlsParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(NoVwlsParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link NoVwlsParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(NoVwlsParser.ArrayAccessContext ctx);
}