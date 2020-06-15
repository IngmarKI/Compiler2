// Generated from C:/Users/limon/IdeaProjects/Compiler2\Demo.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DemoParser}.
 */
public interface DemoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DemoParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(DemoParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(DemoParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(DemoParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(DemoParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Div}
	 * labeled alternative in {@link DemoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDiv(DemoParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Div}
	 * labeled alternative in {@link DemoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDiv(DemoParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link DemoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVariable(DemoParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link DemoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVariable(DemoParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Number}
	 * labeled alternative in {@link DemoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumber(DemoParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link DemoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumber(DemoParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link DemoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMult(DemoParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link DemoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMult(DemoParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Plus}
	 * labeled alternative in {@link DemoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPlus(DemoParser.PlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Plus}
	 * labeled alternative in {@link DemoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPlus(DemoParser.PlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Minus}
	 * labeled alternative in {@link DemoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMinus(DemoParser.MinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Minus}
	 * labeled alternative in {@link DemoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMinus(DemoParser.MinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(DemoParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(DemoParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(DemoParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(DemoParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#println}.
	 * @param ctx the parse tree
	 */
	void enterPrintln(DemoParser.PrintlnContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#println}.
	 * @param ctx the parse tree
	 */
	void exitPrintln(DemoParser.PrintlnContext ctx);
}