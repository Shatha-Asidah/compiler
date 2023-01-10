// Generated from java-escape by ANTLR 4.11.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Example1Parser}.
 */
public interface Example1ParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Example1Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(Example1Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(Example1Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableDeclarationTopLevel}
	 * labeled alternative in {@link Example1Parser#topLevel}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationTopLevel(Example1Parser.VariableDeclarationTopLevelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableDeclarationTopLevel}
	 * labeled alternative in {@link Example1Parser#topLevel}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationTopLevel(Example1Parser.VariableDeclarationTopLevelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassDeclarationTopLevel}
	 * labeled alternative in {@link Example1Parser#topLevel}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclarationTopLevel(Example1Parser.ClassDeclarationTopLevelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassDeclarationTopLevel}
	 * labeled alternative in {@link Example1Parser#topLevel}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclarationTopLevel(Example1Parser.ClassDeclarationTopLevelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionDeclarationTopLevel}
	 * labeled alternative in {@link Example1Parser#topLevel}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclarationTopLevel(Example1Parser.FunctionDeclarationTopLevelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionDeclarationTopLevel}
	 * labeled alternative in {@link Example1Parser#topLevel}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclarationTopLevel(Example1Parser.FunctionDeclarationTopLevelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WidgetDeclarationTopLevel}
	 * labeled alternative in {@link Example1Parser#topLevel}.
	 * @param ctx the parse tree
	 */
	void enterWidgetDeclarationTopLevel(Example1Parser.WidgetDeclarationTopLevelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WidgetDeclarationTopLevel}
	 * labeled alternative in {@link Example1Parser#topLevel}.
	 * @param ctx the parse tree
	 */
	void exitWidgetDeclarationTopLevel(Example1Parser.WidgetDeclarationTopLevelContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#class_decl}.
	 * @param ctx the parse tree
	 */
	void enterClass_decl(Example1Parser.Class_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#class_decl}.
	 * @param ctx the parse tree
	 */
	void exitClass_decl(Example1Parser.Class_declContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableDeclarationClass}
	 * labeled alternative in {@link Example1Parser#class_member}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationClass(Example1Parser.VariableDeclarationClassContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableDeclarationClass}
	 * labeled alternative in {@link Example1Parser#class_member}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationClass(Example1Parser.VariableDeclarationClassContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionDeclarationClass}
	 * labeled alternative in {@link Example1Parser#class_member}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclarationClass(Example1Parser.FunctionDeclarationClassContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionDeclarationClass}
	 * labeled alternative in {@link Example1Parser#class_member}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclarationClass(Example1Parser.FunctionDeclarationClassContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableDeclarationType}
	 * labeled alternative in {@link Example1Parser#variables_decl}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationType(Example1Parser.VariableDeclarationTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableDeclarationType}
	 * labeled alternative in {@link Example1Parser#variables_decl}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationType(Example1Parser.VariableDeclarationTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VaraibleListDeclaration}
	 * labeled alternative in {@link Example1Parser#variables_decl}.
	 * @param ctx the parse tree
	 */
	void enterVaraibleListDeclaration(Example1Parser.VaraibleListDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VaraibleListDeclaration}
	 * labeled alternative in {@link Example1Parser#variables_decl}.
	 * @param ctx the parse tree
	 */
	void exitVaraibleListDeclaration(Example1Parser.VaraibleListDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(Example1Parser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(Example1Parser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#list_exp}.
	 * @param ctx the parse tree
	 */
	void enterList_exp(Example1Parser.List_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#list_exp}.
	 * @param ctx the parse tree
	 */
	void exitList_exp(Example1Parser.List_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(Example1Parser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(Example1Parser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#function_parameters}.
	 * @param ctx the parse tree
	 */
	void enterFunction_parameters(Example1Parser.Function_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#function_parameters}.
	 * @param ctx the parse tree
	 */
	void exitFunction_parameters(Example1Parser.Function_parametersContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VoidTypeFunction}
	 * labeled alternative in {@link Example1Parser#function_type}.
	 * @param ctx the parse tree
	 */
	void enterVoidTypeFunction(Example1Parser.VoidTypeFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VoidTypeFunction}
	 * labeled alternative in {@link Example1Parser#function_type}.
	 * @param ctx the parse tree
	 */
	void exitVoidTypeFunction(Example1Parser.VoidTypeFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeFunction}
	 * labeled alternative in {@link Example1Parser#function_type}.
	 * @param ctx the parse tree
	 */
	void enterTypeFunction(Example1Parser.TypeFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeFunction}
	 * labeled alternative in {@link Example1Parser#function_type}.
	 * @param ctx the parse tree
	 */
	void exitTypeFunction(Example1Parser.TypeFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(Example1Parser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(Example1Parser.For_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#for_first_part}.
	 * @param ctx the parse tree
	 */
	void enterFor_first_part(Example1Parser.For_first_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#for_first_part}.
	 * @param ctx the parse tree
	 */
	void exitFor_first_part(Example1Parser.For_first_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#for_secomd_part}.
	 * @param ctx the parse tree
	 */
	void enterFor_secomd_part(Example1Parser.For_secomd_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#for_secomd_part}.
	 * @param ctx the parse tree
	 */
	void exitFor_secomd_part(Example1Parser.For_secomd_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(Example1Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(Example1Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForStatementNumber}
	 * labeled alternative in {@link Example1Parser#for_statement_variable_number}.
	 * @param ctx the parse tree
	 */
	void enterForStatementNumber(Example1Parser.ForStatementNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForStatementNumber}
	 * labeled alternative in {@link Example1Parser#for_statement_variable_number}.
	 * @param ctx the parse tree
	 */
	void exitForStatementNumber(Example1Parser.ForStatementNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForStatementPlus}
	 * labeled alternative in {@link Example1Parser#for_statement_variable_number}.
	 * @param ctx the parse tree
	 */
	void enterForStatementPlus(Example1Parser.ForStatementPlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForStatementPlus}
	 * labeled alternative in {@link Example1Parser#for_statement_variable_number}.
	 * @param ctx the parse tree
	 */
	void exitForStatementPlus(Example1Parser.ForStatementPlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForStatementMinus}
	 * labeled alternative in {@link Example1Parser#for_statement_variable_number}.
	 * @param ctx the parse tree
	 */
	void enterForStatementMinus(Example1Parser.ForStatementMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForStatementMinus}
	 * labeled alternative in {@link Example1Parser#for_statement_variable_number}.
	 * @param ctx the parse tree
	 */
	void exitForStatementMinus(Example1Parser.ForStatementMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForStatementFastMatch}
	 * labeled alternative in {@link Example1Parser#for_statement_variable_number}.
	 * @param ctx the parse tree
	 */
	void enterForStatementFastMatch(Example1Parser.ForStatementFastMatchContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForStatementFastMatch}
	 * labeled alternative in {@link Example1Parser#for_statement_variable_number}.
	 * @param ctx the parse tree
	 */
	void exitForStatementFastMatch(Example1Parser.ForStatementFastMatchContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(Example1Parser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(Example1Parser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolExp}
	 * labeled alternative in {@link Example1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolExp(Example1Parser.BoolExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolExp}
	 * labeled alternative in {@link Example1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolExp(Example1Parser.BoolExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MinusOne}
	 * labeled alternative in {@link Example1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMinusOne(Example1Parser.MinusOneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MinusOne}
	 * labeled alternative in {@link Example1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMinusOne(Example1Parser.MinusOneContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link Example1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVariable(Example1Parser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link Example1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVariable(Example1Parser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Number}
	 * labeled alternative in {@link Example1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumber(Example1Parser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link Example1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumber(Example1Parser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringExp}
	 * labeled alternative in {@link Example1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterStringExp(Example1Parser.StringExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringExp}
	 * labeled alternative in {@link Example1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitStringExp(Example1Parser.StringExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperationExpression}
	 * labeled alternative in {@link Example1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOperationExpression(Example1Parser.OperationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperationExpression}
	 * labeled alternative in {@link Example1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOperationExpression(Example1Parser.OperationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddingOne}
	 * labeled alternative in {@link Example1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddingOne(Example1Parser.AddingOneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddingOne}
	 * labeled alternative in {@link Example1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddingOne(Example1Parser.AddingOneContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FastMatch}
	 * labeled alternative in {@link Example1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFastMatch(Example1Parser.FastMatchContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FastMatch}
	 * labeled alternative in {@link Example1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFastMatch(Example1Parser.FastMatchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link Example1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(Example1Parser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link Example1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(Example1Parser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#call_function}.
	 * @param ctx the parse tree
	 */
	void enterCall_function(Example1Parser.Call_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#call_function}.
	 * @param ctx the parse tree
	 */
	void exitCall_function(Example1Parser.Call_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#adding_one}.
	 * @param ctx the parse tree
	 */
	void enterAdding_one(Example1Parser.Adding_oneContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#adding_one}.
	 * @param ctx the parse tree
	 */
	void exitAdding_one(Example1Parser.Adding_oneContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#minus_one}.
	 * @param ctx the parse tree
	 */
	void enterMinus_one(Example1Parser.Minus_oneContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#minus_one}.
	 * @param ctx the parse tree
	 */
	void exitMinus_one(Example1Parser.Minus_oneContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#fast_math}.
	 * @param ctx the parse tree
	 */
	void enterFast_math(Example1Parser.Fast_mathContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#fast_math}.
	 * @param ctx the parse tree
	 */
	void exitFast_math(Example1Parser.Fast_mathContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#for_statement_adding_one}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement_adding_one(Example1Parser.For_statement_adding_oneContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#for_statement_adding_one}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement_adding_one(Example1Parser.For_statement_adding_oneContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#for_statement_minuss_one}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement_minuss_one(Example1Parser.For_statement_minuss_oneContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#for_statement_minuss_one}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement_minuss_one(Example1Parser.For_statement_minuss_oneContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#number_attribute}.
	 * @param ctx the parse tree
	 */
	void enterNumber_attribute(Example1Parser.Number_attributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#number_attribute}.
	 * @param ctx the parse tree
	 */
	void exitNumber_attribute(Example1Parser.Number_attributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableDeclaration}
	 * labeled alternative in {@link Example1Parser#code_attribute}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(Example1Parser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableDeclaration}
	 * labeled alternative in {@link Example1Parser#code_attribute}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(Example1Parser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintCodeAttributes}
	 * labeled alternative in {@link Example1Parser#code_attribute}.
	 * @param ctx the parse tree
	 */
	void enterPrintCodeAttributes(Example1Parser.PrintCodeAttributesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintCodeAttributes}
	 * labeled alternative in {@link Example1Parser#code_attribute}.
	 * @param ctx the parse tree
	 */
	void exitPrintCodeAttributes(Example1Parser.PrintCodeAttributesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfCodeAttributes}
	 * labeled alternative in {@link Example1Parser#code_attribute}.
	 * @param ctx the parse tree
	 */
	void enterIfCodeAttributes(Example1Parser.IfCodeAttributesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfCodeAttributes}
	 * labeled alternative in {@link Example1Parser#code_attribute}.
	 * @param ctx the parse tree
	 */
	void exitIfCodeAttributes(Example1Parser.IfCodeAttributesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ElseCodeAttributes}
	 * labeled alternative in {@link Example1Parser#code_attribute}.
	 * @param ctx the parse tree
	 */
	void enterElseCodeAttributes(Example1Parser.ElseCodeAttributesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ElseCodeAttributes}
	 * labeled alternative in {@link Example1Parser#code_attribute}.
	 * @param ctx the parse tree
	 */
	void exitElseCodeAttributes(Example1Parser.ElseCodeAttributesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForCodeAttributes}
	 * labeled alternative in {@link Example1Parser#code_attribute}.
	 * @param ctx the parse tree
	 */
	void enterForCodeAttributes(Example1Parser.ForCodeAttributesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForCodeAttributes}
	 * labeled alternative in {@link Example1Parser#code_attribute}.
	 * @param ctx the parse tree
	 */
	void exitForCodeAttributes(Example1Parser.ForCodeAttributesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStatements}
	 * labeled alternative in {@link Example1Parser#code_attribute}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatements(Example1Parser.WhileStatementsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStatements}
	 * labeled alternative in {@link Example1Parser#code_attribute}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatements(Example1Parser.WhileStatementsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentCodeAttributes}
	 * labeled alternative in {@link Example1Parser#code_attribute}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentCodeAttributes(Example1Parser.AssignmentCodeAttributesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentCodeAttributes}
	 * labeled alternative in {@link Example1Parser#code_attribute}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentCodeAttributes(Example1Parser.AssignmentCodeAttributesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallCodeAttributes}
	 * labeled alternative in {@link Example1Parser#code_attribute}.
	 * @param ctx the parse tree
	 */
	void enterCallCodeAttributes(Example1Parser.CallCodeAttributesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallCodeAttributes}
	 * labeled alternative in {@link Example1Parser#code_attribute}.
	 * @param ctx the parse tree
	 */
	void exitCallCodeAttributes(Example1Parser.CallCodeAttributesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BreakCodeAttributes}
	 * labeled alternative in {@link Example1Parser#code_attribute}.
	 * @param ctx the parse tree
	 */
	void enterBreakCodeAttributes(Example1Parser.BreakCodeAttributesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BreakCodeAttributes}
	 * labeled alternative in {@link Example1Parser#code_attribute}.
	 * @param ctx the parse tree
	 */
	void exitBreakCodeAttributes(Example1Parser.BreakCodeAttributesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnCodeAttributes}
	 * labeled alternative in {@link Example1Parser#code_attribute}.
	 * @param ctx the parse tree
	 */
	void enterReturnCodeAttributes(Example1Parser.ReturnCodeAttributesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnCodeAttributes}
	 * labeled alternative in {@link Example1Parser#code_attribute}.
	 * @param ctx the parse tree
	 */
	void exitReturnCodeAttributes(Example1Parser.ReturnCodeAttributesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CodeAttributes}
	 * labeled alternative in {@link Example1Parser#code_attribute}.
	 * @param ctx the parse tree
	 */
	void enterCodeAttributes(Example1Parser.CodeAttributesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CodeAttributes}
	 * labeled alternative in {@link Example1Parser#code_attribute}.
	 * @param ctx the parse tree
	 */
	void exitCodeAttributes(Example1Parser.CodeAttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#else_statment}.
	 * @param ctx the parse tree
	 */
	void enterElse_statment(Example1Parser.Else_statmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#else_statment}.
	 * @param ctx the parse tree
	 */
	void exitElse_statment(Example1Parser.Else_statmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#operation_if}.
	 * @param ctx the parse tree
	 */
	void enterOperation_if(Example1Parser.Operation_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#operation_if}.
	 * @param ctx the parse tree
	 */
	void exitOperation_if(Example1Parser.Operation_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#while_statment}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statment(Example1Parser.While_statmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#while_statment}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statment(Example1Parser.While_statmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#if_statment}.
	 * @param ctx the parse tree
	 */
	void enterIf_statment(Example1Parser.If_statmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#if_statment}.
	 * @param ctx the parse tree
	 */
	void exitIf_statment(Example1Parser.If_statmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#else_if_statements}.
	 * @param ctx the parse tree
	 */
	void enterElse_if_statements(Example1Parser.Else_if_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#else_if_statements}.
	 * @param ctx the parse tree
	 */
	void exitElse_if_statements(Example1Parser.Else_if_statementsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfPartOperation}
	 * labeled alternative in {@link Example1Parser#if_part}.
	 * @param ctx the parse tree
	 */
	void enterIfPartOperation(Example1Parser.IfPartOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfPartOperation}
	 * labeled alternative in {@link Example1Parser#if_part}.
	 * @param ctx the parse tree
	 */
	void exitIfPartOperation(Example1Parser.IfPartOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CharsExpression}
	 * labeled alternative in {@link Example1Parser#if_part}.
	 * @param ctx the parse tree
	 */
	void enterCharsExpression(Example1Parser.CharsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CharsExpression}
	 * labeled alternative in {@link Example1Parser#if_part}.
	 * @param ctx the parse tree
	 */
	void exitCharsExpression(Example1Parser.CharsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SingleExpression}
	 * labeled alternative in {@link Example1Parser#if_part}.
	 * @param ctx the parse tree
	 */
	void enterSingleExpression(Example1Parser.SingleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SingleExpression}
	 * labeled alternative in {@link Example1Parser#if_part}.
	 * @param ctx the parse tree
	 */
	void exitSingleExpression(Example1Parser.SingleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(Example1Parser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(Example1Parser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#print_statements}.
	 * @param ctx the parse tree
	 */
	void enterPrint_statements(Example1Parser.Print_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#print_statements}.
	 * @param ctx the parse tree
	 */
	void exitPrint_statements(Example1Parser.Print_statementsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ScaffoldWidget}
	 * labeled alternative in {@link Example1Parser#widget}.
	 * @param ctx the parse tree
	 */
	void enterScaffoldWidget(Example1Parser.ScaffoldWidgetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ScaffoldWidget}
	 * labeled alternative in {@link Example1Parser#widget}.
	 * @param ctx the parse tree
	 */
	void exitScaffoldWidget(Example1Parser.ScaffoldWidgetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImageWidget}
	 * labeled alternative in {@link Example1Parser#widget}.
	 * @param ctx the parse tree
	 */
	void enterImageWidget(Example1Parser.ImageWidgetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImageWidget}
	 * labeled alternative in {@link Example1Parser#widget}.
	 * @param ctx the parse tree
	 */
	void exitImageWidget(Example1Parser.ImageWidgetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TextWidget}
	 * labeled alternative in {@link Example1Parser#widget}.
	 * @param ctx the parse tree
	 */
	void enterTextWidget(Example1Parser.TextWidgetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TextWidget}
	 * labeled alternative in {@link Example1Parser#widget}.
	 * @param ctx the parse tree
	 */
	void exitTextWidget(Example1Parser.TextWidgetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ContainerWidget}
	 * labeled alternative in {@link Example1Parser#widget}.
	 * @param ctx the parse tree
	 */
	void enterContainerWidget(Example1Parser.ContainerWidgetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ContainerWidget}
	 * labeled alternative in {@link Example1Parser#widget}.
	 * @param ctx the parse tree
	 */
	void exitContainerWidget(Example1Parser.ContainerWidgetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnWidget}
	 * labeled alternative in {@link Example1Parser#widget}.
	 * @param ctx the parse tree
	 */
	void enterColumnWidget(Example1Parser.ColumnWidgetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnWidget}
	 * labeled alternative in {@link Example1Parser#widget}.
	 * @param ctx the parse tree
	 */
	void exitColumnWidget(Example1Parser.ColumnWidgetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RowWidget}
	 * labeled alternative in {@link Example1Parser#widget}.
	 * @param ctx the parse tree
	 */
	void enterRowWidget(Example1Parser.RowWidgetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RowWidget}
	 * labeled alternative in {@link Example1Parser#widget}.
	 * @param ctx the parse tree
	 */
	void exitRowWidget(Example1Parser.RowWidgetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CenterWidget}
	 * labeled alternative in {@link Example1Parser#widget}.
	 * @param ctx the parse tree
	 */
	void enterCenterWidget(Example1Parser.CenterWidgetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CenterWidget}
	 * labeled alternative in {@link Example1Parser#widget}.
	 * @param ctx the parse tree
	 */
	void exitCenterWidget(Example1Parser.CenterWidgetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ElevatedButtonWidget}
	 * labeled alternative in {@link Example1Parser#widget}.
	 * @param ctx the parse tree
	 */
	void enterElevatedButtonWidget(Example1Parser.ElevatedButtonWidgetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ElevatedButtonWidget}
	 * labeled alternative in {@link Example1Parser#widget}.
	 * @param ctx the parse tree
	 */
	void exitElevatedButtonWidget(Example1Parser.ElevatedButtonWidgetContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#scaffold}.
	 * @param ctx the parse tree
	 */
	void enterScaffold(Example1Parser.ScaffoldContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#scaffold}.
	 * @param ctx the parse tree
	 */
	void exitScaffold(Example1Parser.ScaffoldContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#scaffoldArgs}.
	 * @param ctx the parse tree
	 */
	void enterScaffoldArgs(Example1Parser.ScaffoldArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#scaffoldArgs}.
	 * @param ctx the parse tree
	 */
	void exitScaffoldArgs(Example1Parser.ScaffoldArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#scaffoldProperty}.
	 * @param ctx the parse tree
	 */
	void enterScaffoldProperty(Example1Parser.ScaffoldPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#scaffoldProperty}.
	 * @param ctx the parse tree
	 */
	void exitScaffoldProperty(Example1Parser.ScaffoldPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#image}.
	 * @param ctx the parse tree
	 */
	void enterImage(Example1Parser.ImageContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#image}.
	 * @param ctx the parse tree
	 */
	void exitImage(Example1Parser.ImageContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#imageProperties}.
	 * @param ctx the parse tree
	 */
	void enterImageProperties(Example1Parser.ImagePropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#imageProperties}.
	 * @param ctx the parse tree
	 */
	void exitImageProperties(Example1Parser.ImagePropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImageWidthHeight}
	 * labeled alternative in {@link Example1Parser#imageProperty}.
	 * @param ctx the parse tree
	 */
	void enterImageWidthHeight(Example1Parser.ImageWidthHeightContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImageWidthHeight}
	 * labeled alternative in {@link Example1Parser#imageProperty}.
	 * @param ctx the parse tree
	 */
	void exitImageWidthHeight(Example1Parser.ImageWidthHeightContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImageColor}
	 * labeled alternative in {@link Example1Parser#imageProperty}.
	 * @param ctx the parse tree
	 */
	void enterImageColor(Example1Parser.ImageColorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImageColor}
	 * labeled alternative in {@link Example1Parser#imageProperty}.
	 * @param ctx the parse tree
	 */
	void exitImageColor(Example1Parser.ImageColorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(Example1Parser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(Example1Parser.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#textProperties}.
	 * @param ctx the parse tree
	 */
	void enterTextProperties(Example1Parser.TextPropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#textProperties}.
	 * @param ctx the parse tree
	 */
	void exitTextProperties(Example1Parser.TextPropertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#textProperty}.
	 * @param ctx the parse tree
	 */
	void enterTextProperty(Example1Parser.TextPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#textProperty}.
	 * @param ctx the parse tree
	 */
	void exitTextProperty(Example1Parser.TextPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#style}.
	 * @param ctx the parse tree
	 */
	void enterStyle(Example1Parser.StyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#style}.
	 * @param ctx the parse tree
	 */
	void exitStyle(Example1Parser.StyleContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#textStyleProprties}.
	 * @param ctx the parse tree
	 */
	void enterTextStyleProprties(Example1Parser.TextStyleProprtiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#textStyleProprties}.
	 * @param ctx the parse tree
	 */
	void exitTextStyleProprties(Example1Parser.TextStyleProprtiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColorKeyValue}
	 * labeled alternative in {@link Example1Parser#textStyleProprty}.
	 * @param ctx the parse tree
	 */
	void enterColorKeyValue(Example1Parser.ColorKeyValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColorKeyValue}
	 * labeled alternative in {@link Example1Parser#textStyleProprty}.
	 * @param ctx the parse tree
	 */
	void exitColorKeyValue(Example1Parser.ColorKeyValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FontSizeKeyValue}
	 * labeled alternative in {@link Example1Parser#textStyleProprty}.
	 * @param ctx the parse tree
	 */
	void enterFontSizeKeyValue(Example1Parser.FontSizeKeyValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FontSizeKeyValue}
	 * labeled alternative in {@link Example1Parser#textStyleProprty}.
	 * @param ctx the parse tree
	 */
	void exitFontSizeKeyValue(Example1Parser.FontSizeKeyValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#column}.
	 * @param ctx the parse tree
	 */
	void enterColumn(Example1Parser.ColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#column}.
	 * @param ctx the parse tree
	 */
	void exitColumn(Example1Parser.ColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(Example1Parser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(Example1Parser.RowContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#rowColumnArgs}.
	 * @param ctx the parse tree
	 */
	void enterRowColumnArgs(Example1Parser.RowColumnArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#rowColumnArgs}.
	 * @param ctx the parse tree
	 */
	void exitRowColumnArgs(Example1Parser.RowColumnArgsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnKeyValue}
	 * labeled alternative in {@link Example1Parser#rowColumnArg}.
	 * @param ctx the parse tree
	 */
	void enterColumnKeyValue(Example1Parser.ColumnKeyValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnKeyValue}
	 * labeled alternative in {@link Example1Parser#rowColumnArg}.
	 * @param ctx the parse tree
	 */
	void exitColumnKeyValue(Example1Parser.ColumnKeyValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnWidgetList}
	 * labeled alternative in {@link Example1Parser#rowColumnArg}.
	 * @param ctx the parse tree
	 */
	void enterColumnWidgetList(Example1Parser.ColumnWidgetListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnWidgetList}
	 * labeled alternative in {@link Example1Parser#rowColumnArg}.
	 * @param ctx the parse tree
	 */
	void exitColumnWidgetList(Example1Parser.ColumnWidgetListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#mainAxisAlignment}.
	 * @param ctx the parse tree
	 */
	void enterMainAxisAlignment(Example1Parser.MainAxisAlignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#mainAxisAlignment}.
	 * @param ctx the parse tree
	 */
	void exitMainAxisAlignment(Example1Parser.MainAxisAlignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#mainAxisSize}.
	 * @param ctx the parse tree
	 */
	void enterMainAxisSize(Example1Parser.MainAxisSizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#mainAxisSize}.
	 * @param ctx the parse tree
	 */
	void exitMainAxisSize(Example1Parser.MainAxisSizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#widgetList}.
	 * @param ctx the parse tree
	 */
	void enterWidgetList(Example1Parser.WidgetListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#widgetList}.
	 * @param ctx the parse tree
	 */
	void exitWidgetList(Example1Parser.WidgetListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#container}.
	 * @param ctx the parse tree
	 */
	void enterContainer(Example1Parser.ContainerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#container}.
	 * @param ctx the parse tree
	 */
	void exitContainer(Example1Parser.ContainerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#containerProperties}.
	 * @param ctx the parse tree
	 */
	void enterContainerProperties(Example1Parser.ContainerPropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#containerProperties}.
	 * @param ctx the parse tree
	 */
	void exitContainerProperties(Example1Parser.ContainerPropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ContainerKeyValue}
	 * labeled alternative in {@link Example1Parser#containerProperty}.
	 * @param ctx the parse tree
	 */
	void enterContainerKeyValue(Example1Parser.ContainerKeyValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ContainerKeyValue}
	 * labeled alternative in {@link Example1Parser#containerProperty}.
	 * @param ctx the parse tree
	 */
	void exitContainerKeyValue(Example1Parser.ContainerKeyValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ContainerWidthHeight}
	 * labeled alternative in {@link Example1Parser#containerProperty}.
	 * @param ctx the parse tree
	 */
	void enterContainerWidthHeight(Example1Parser.ContainerWidthHeightContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ContainerWidthHeight}
	 * labeled alternative in {@link Example1Parser#containerProperty}.
	 * @param ctx the parse tree
	 */
	void exitContainerWidthHeight(Example1Parser.ContainerWidthHeightContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#color}.
	 * @param ctx the parse tree
	 */
	void enterColor(Example1Parser.ColorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#color}.
	 * @param ctx the parse tree
	 */
	void exitColor(Example1Parser.ColorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#e_button}.
	 * @param ctx the parse tree
	 */
	void enterE_button(Example1Parser.E_buttonContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#e_button}.
	 * @param ctx the parse tree
	 */
	void exitE_button(Example1Parser.E_buttonContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#e_buttonProperties}.
	 * @param ctx the parse tree
	 */
	void enterE_buttonProperties(Example1Parser.E_buttonPropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#e_buttonProperties}.
	 * @param ctx the parse tree
	 */
	void exitE_buttonProperties(Example1Parser.E_buttonPropertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#e_ButtonProperty}.
	 * @param ctx the parse tree
	 */
	void enterE_ButtonProperty(Example1Parser.E_ButtonPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#e_ButtonProperty}.
	 * @param ctx the parse tree
	 */
	void exitE_ButtonProperty(Example1Parser.E_ButtonPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallFunction}
	 * labeled alternative in {@link Example1Parser#voidFunction}.
	 * @param ctx the parse tree
	 */
	void enterCallFunction(Example1Parser.CallFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallFunction}
	 * labeled alternative in {@link Example1Parser#voidFunction}.
	 * @param ctx the parse tree
	 */
	void exitCallFunction(Example1Parser.CallFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionBlock}
	 * labeled alternative in {@link Example1Parser#voidFunction}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBlock(Example1Parser.FunctionBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionBlock}
	 * labeled alternative in {@link Example1Parser#voidFunction}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBlock(Example1Parser.FunctionBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#center}.
	 * @param ctx the parse tree
	 */
	void enterCenter(Example1Parser.CenterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#center}.
	 * @param ctx the parse tree
	 */
	void exitCenter(Example1Parser.CenterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#centerWidgetArgs}.
	 * @param ctx the parse tree
	 */
	void enterCenterWidgetArgs(Example1Parser.CenterWidgetArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#centerWidgetArgs}.
	 * @param ctx the parse tree
	 */
	void exitCenterWidgetArgs(Example1Parser.CenterWidgetArgsContext ctx);
}