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
	 * Enter a parse tree produced by {@link Example1Parser#topLevel}.
	 * @param ctx the parse tree
	 */
	void enterTopLevel(Example1Parser.TopLevelContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#topLevel}.
	 * @param ctx the parse tree
	 */
	void exitTopLevel(Example1Parser.TopLevelContext ctx);
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
	 * Enter a parse tree produced by {@link Example1Parser#class_member}.
	 * @param ctx the parse tree
	 */
	void enterClass_member(Example1Parser.Class_memberContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#class_member}.
	 * @param ctx the parse tree
	 */
	void exitClass_member(Example1Parser.Class_memberContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#variables_decl}.
	 * @param ctx the parse tree
	 */
	void enterVariables_decl(Example1Parser.Variables_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#variables_decl}.
	 * @param ctx the parse tree
	 */
	void exitVariables_decl(Example1Parser.Variables_declContext ctx);
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
	 * Enter a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link Example1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication(Example1Parser.MultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link Example1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication(Example1Parser.MultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link Example1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddition(Example1Parser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link Example1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddition(Example1Parser.AdditionContext ctx);
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
	 * Enter a parse tree produced by the {@code Division}
	 * labeled alternative in {@link Example1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDivision(Example1Parser.DivisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Division}
	 * labeled alternative in {@link Example1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDivision(Example1Parser.DivisionContext ctx);
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
	 * Enter a parse tree produced by the {@code Minus}
	 * labeled alternative in {@link Example1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMinus(Example1Parser.MinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Minus}
	 * labeled alternative in {@link Example1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMinus(Example1Parser.MinusContext ctx);
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
	 * Enter a parse tree produced by {@link Example1Parser#if_part}.
	 * @param ctx the parse tree
	 */
	void enterIf_part(Example1Parser.If_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#if_part}.
	 * @param ctx the parse tree
	 */
	void exitIf_part(Example1Parser.If_partContext ctx);
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
	 * Enter a parse tree produced by {@link Example1Parser#widget}.
	 * @param ctx the parse tree
	 */
	void enterWidget(Example1Parser.WidgetContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#widget}.
	 * @param ctx the parse tree
	 */
	void exitWidget(Example1Parser.WidgetContext ctx);
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
	 * Enter a parse tree produced by {@link Example1Parser#image_assets}.
	 * @param ctx the parse tree
	 */
	void enterImage_assets(Example1Parser.Image_assetsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#image_assets}.
	 * @param ctx the parse tree
	 */
	void exitImage_assets(Example1Parser.Image_assetsContext ctx);
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
	 * Enter a parse tree produced by {@link Example1Parser#container_att}.
	 * @param ctx the parse tree
	 */
	void enterContainer_att(Example1Parser.Container_attContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#container_att}.
	 * @param ctx the parse tree
	 */
	void exitContainer_att(Example1Parser.Container_attContext ctx);
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
	 * Enter a parse tree produced by {@link Example1Parser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(Example1Parser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(Example1Parser.BodyContext ctx);
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
	 * Enter a parse tree produced by {@link Example1Parser#width}.
	 * @param ctx the parse tree
	 */
	void enterWidth(Example1Parser.WidthContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#width}.
	 * @param ctx the parse tree
	 */
	void exitWidth(Example1Parser.WidthContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#height}.
	 * @param ctx the parse tree
	 */
	void enterHeight(Example1Parser.HeightContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#height}.
	 * @param ctx the parse tree
	 */
	void exitHeight(Example1Parser.HeightContext ctx);
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
	 * Enter a parse tree produced by {@link Example1Parser#elevatedButtonWidgetArgs}.
	 * @param ctx the parse tree
	 */
	void enterElevatedButtonWidgetArgs(Example1Parser.ElevatedButtonWidgetArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#elevatedButtonWidgetArgs}.
	 * @param ctx the parse tree
	 */
	void exitElevatedButtonWidgetArgs(Example1Parser.ElevatedButtonWidgetArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#elevatedButtonWidgetArg}.
	 * @param ctx the parse tree
	 */
	void enterElevatedButtonWidgetArg(Example1Parser.ElevatedButtonWidgetArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#elevatedButtonWidgetArg}.
	 * @param ctx the parse tree
	 */
	void exitElevatedButtonWidgetArg(Example1Parser.ElevatedButtonWidgetArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#voidFunction}.
	 * @param ctx the parse tree
	 */
	void enterVoidFunction(Example1Parser.VoidFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#voidFunction}.
	 * @param ctx the parse tree
	 */
	void exitVoidFunction(Example1Parser.VoidFunctionContext ctx);
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