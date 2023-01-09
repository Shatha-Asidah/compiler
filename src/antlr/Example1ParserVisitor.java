// Generated from java-escape by ANTLR 4.11.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Example1Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Example1ParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Example1Parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(Example1Parser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableDeclarationTopLevel}
	 * labeled alternative in {@link Example1Parser#topLevel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationTopLevel(Example1Parser.VariableDeclarationTopLevelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassDeclarationTopLevel}
	 * labeled alternative in {@link Example1Parser#topLevel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclarationTopLevel(Example1Parser.ClassDeclarationTopLevelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionDeclarationTopLevel}
	 * labeled alternative in {@link Example1Parser#topLevel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclarationTopLevel(Example1Parser.FunctionDeclarationTopLevelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WidgetDeclarationTopLevel}
	 * labeled alternative in {@link Example1Parser#topLevel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidgetDeclarationTopLevel(Example1Parser.WidgetDeclarationTopLevelContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#class_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_decl(Example1Parser.Class_declContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableDeclarationClass}
	 * labeled alternative in {@link Example1Parser#class_member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationClass(Example1Parser.VariableDeclarationClassContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionDeclarationClass}
	 * labeled alternative in {@link Example1Parser#class_member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclarationClass(Example1Parser.FunctionDeclarationClassContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableDeclarationType}
	 * labeled alternative in {@link Example1Parser#variables_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationType(Example1Parser.VariableDeclarationTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VaraibleListDeclaration}
	 * labeled alternative in {@link Example1Parser#variables_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVaraibleListDeclaration(Example1Parser.VaraibleListDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(Example1Parser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#list_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_exp(Example1Parser.List_expContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(Example1Parser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#function_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_parameters(Example1Parser.Function_parametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statement(Example1Parser.For_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#for_first_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_first_part(Example1Parser.For_first_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#for_secomd_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_secomd_part(Example1Parser.For_secomd_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(Example1Parser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForStatementNumber}
	 * labeled alternative in {@link Example1Parser#for_statement_variable_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatementNumber(Example1Parser.ForStatementNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForStatementPlus}
	 * labeled alternative in {@link Example1Parser#for_statement_variable_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatementPlus(Example1Parser.ForStatementPlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForStatementMinus}
	 * labeled alternative in {@link Example1Parser#for_statement_variable_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatementMinus(Example1Parser.ForStatementMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForStatementFastMatch}
	 * labeled alternative in {@link Example1Parser#for_statement_variable_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatementFastMatch(Example1Parser.ForStatementFastMatchContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(Example1Parser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolExp}
	 * labeled alternative in {@link Example1Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExp(Example1Parser.BoolExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MinusOne}
	 * labeled alternative in {@link Example1Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusOne(Example1Parser.MinusOneContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link Example1Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(Example1Parser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link Example1Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(Example1Parser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringExp}
	 * labeled alternative in {@link Example1Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExp(Example1Parser.StringExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperationExpression}
	 * labeled alternative in {@link Example1Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationExpression(Example1Parser.OperationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddingOne}
	 * labeled alternative in {@link Example1Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddingOne(Example1Parser.AddingOneContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FastMatch}
	 * labeled alternative in {@link Example1Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFastMatch(Example1Parser.FastMatchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link Example1Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(Example1Parser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#call_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_function(Example1Parser.Call_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#adding_one}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdding_one(Example1Parser.Adding_oneContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#minus_one}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus_one(Example1Parser.Minus_oneContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#fast_math}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFast_math(Example1Parser.Fast_mathContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#for_statement_adding_one}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statement_adding_one(Example1Parser.For_statement_adding_oneContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#for_statement_minuss_one}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statement_minuss_one(Example1Parser.For_statement_minuss_oneContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#number_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber_attribute(Example1Parser.Number_attributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableDeclaration}
	 * labeled alternative in {@link Example1Parser#code_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(Example1Parser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintCodeAttributes}
	 * labeled alternative in {@link Example1Parser#code_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintCodeAttributes(Example1Parser.PrintCodeAttributesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfCodeAttributes}
	 * labeled alternative in {@link Example1Parser#code_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfCodeAttributes(Example1Parser.IfCodeAttributesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ElseCodeAttributes}
	 * labeled alternative in {@link Example1Parser#code_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseCodeAttributes(Example1Parser.ElseCodeAttributesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForCodeAttributes}
	 * labeled alternative in {@link Example1Parser#code_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForCodeAttributes(Example1Parser.ForCodeAttributesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileStatements}
	 * labeled alternative in {@link Example1Parser#code_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatements(Example1Parser.WhileStatementsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentCodeAttributes}
	 * labeled alternative in {@link Example1Parser#code_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentCodeAttributes(Example1Parser.AssignmentCodeAttributesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CallCodeAttributes}
	 * labeled alternative in {@link Example1Parser#code_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallCodeAttributes(Example1Parser.CallCodeAttributesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BreakCodeAttributes}
	 * labeled alternative in {@link Example1Parser#code_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakCodeAttributes(Example1Parser.BreakCodeAttributesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnCodeAttributes}
	 * labeled alternative in {@link Example1Parser#code_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnCodeAttributes(Example1Parser.ReturnCodeAttributesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CodeAttributes}
	 * labeled alternative in {@link Example1Parser#code_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeAttributes(Example1Parser.CodeAttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#else_statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_statment(Example1Parser.Else_statmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#operation_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation_if(Example1Parser.Operation_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#while_statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statment(Example1Parser.While_statmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#if_statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statment(Example1Parser.If_statmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#else_if_statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_if_statements(Example1Parser.Else_if_statementsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfPartOperation}
	 * labeled alternative in {@link Example1Parser#if_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfPartOperation(Example1Parser.IfPartOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CharsExpression}
	 * labeled alternative in {@link Example1Parser#if_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharsExpression(Example1Parser.CharsExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SingleExpression}
	 * labeled alternative in {@link Example1Parser#if_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleExpression(Example1Parser.SingleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(Example1Parser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#print_statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_statements(Example1Parser.Print_statementsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ScaffoldWidget}
	 * labeled alternative in {@link Example1Parser#widget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScaffoldWidget(Example1Parser.ScaffoldWidgetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImageWidget}
	 * labeled alternative in {@link Example1Parser#widget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImageWidget(Example1Parser.ImageWidgetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TextWidget}
	 * labeled alternative in {@link Example1Parser#widget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextWidget(Example1Parser.TextWidgetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ContainerWidget}
	 * labeled alternative in {@link Example1Parser#widget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainerWidget(Example1Parser.ContainerWidgetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColumnWidget}
	 * labeled alternative in {@link Example1Parser#widget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnWidget(Example1Parser.ColumnWidgetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RowWidget}
	 * labeled alternative in {@link Example1Parser#widget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowWidget(Example1Parser.RowWidgetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CenterWidget}
	 * labeled alternative in {@link Example1Parser#widget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCenterWidget(Example1Parser.CenterWidgetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ElevatedButtonWidget}
	 * labeled alternative in {@link Example1Parser#widget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElevatedButtonWidget(Example1Parser.ElevatedButtonWidgetContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#image}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImage(Example1Parser.ImageContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#image_assets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImage_assets(Example1Parser.Image_assetsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(Example1Parser.TextContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn(Example1Parser.ColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow(Example1Parser.RowContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#container}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainer(Example1Parser.ContainerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#container_att}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainer_att(Example1Parser.Container_attContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#scaffold}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScaffold(Example1Parser.ScaffoldContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(Example1Parser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#color}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColor(Example1Parser.ColorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#width}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidth(Example1Parser.WidthContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#height}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeight(Example1Parser.HeightContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#e_button}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitE_button(Example1Parser.E_buttonContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#elevatedButtonWidgetArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElevatedButtonWidgetArgs(Example1Parser.ElevatedButtonWidgetArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#elevatedButtonWidgetArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElevatedButtonWidgetArg(Example1Parser.ElevatedButtonWidgetArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#voidFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidFunction(Example1Parser.VoidFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#center}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCenter(Example1Parser.CenterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#centerWidgetArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCenterWidgetArgs(Example1Parser.CenterWidgetArgsContext ctx);
}