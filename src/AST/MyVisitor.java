package AST;

import AST.Expression.*;
import AST.Node.DataType;
import AST.Node.Node;
import AST.Statement.*;
import AST.TopLevel.ClassDeclaration;
import AST.TopLevel.Function;
import AST.TopLevel.FunctionParameter;
import AST.TopLevel.VariableDeclaration;
import AST.Widget.KeyValueWidget;
import AST.Widget.Widget;
import AST.Widget.WidgetFunction;
import AST.Widget.WidgetList;
import antlr.Example1Parser;
import antlr.Example1ParserBaseVisitor;

import java.util.ArrayList;
import java.util.List;

public class MyVisitor extends Example1ParserBaseVisitor {
    SymbolTable symbolTable;

    public MyVisitor(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    //Program
    @Override
    public Program visitProgram(Example1Parser.ProgramContext ctx) {
        Program program = new Program();
        for (int i = 0; i < ctx.topLevel().size(); i++) {
            Node children = (Node) visit(ctx.getChild(i));
            program.addProgramNode(children);
        }
        return program;
    }


    // TopLevel
    @Override
    public Node visitVariableDeclarationTopLevel(Example1Parser.VariableDeclarationTopLevelContext ctx) {
        return (Node) visit(ctx.variables_decl());
    }

    @Override
    public Node visitClassDeclarationTopLevel(Example1Parser.ClassDeclarationTopLevelContext ctx) {
        return (Node) visit(ctx.class_decl());
    }

    @Override
    public Node visitFunctionDeclarationTopLevel(Example1Parser.FunctionDeclarationTopLevelContext ctx) {
        return (Node) visit(ctx.function());
    }

    @Override
    public Node visitWidgetDeclarationTopLevel(Example1Parser.WidgetDeclarationTopLevelContext ctx) {
        return (Node) visit(ctx.widget());
    }

    @Override
    public Node visitVariableDeclarationClass(Example1Parser.VariableDeclarationClassContext ctx) {
        return (Node) super.visitVariableDeclarationClass(ctx);
    }

    @Override
    public Node visitFunctionDeclarationClass(Example1Parser.FunctionDeclarationClassContext ctx) {
        return (Node) super.visitFunctionDeclarationClass(ctx);
    }

    @Override
    public Node visitVariableDeclarationType(Example1Parser.VariableDeclarationTypeContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        DataType type = (DataType) visit(ctx.type());
        String id = ctx.CHARS().getText();
        Expression expression = (Expression) visit(ctx.expr());
        symbolTable.addKeyValue(id, expression);
        return new VariableDeclaration(type, id, expression, lineNumber);
    }

    @Override
    public Node visitVaraibleListDeclaration(Example1Parser.VaraibleListDeclarationContext ctx) {
        return (Node) super.visitVaraibleListDeclaration(ctx);
    }

    @Override
    public Node visitList(Example1Parser.ListContext ctx) {
        return (Node) super.visitList(ctx);
    }

    @Override
    public Node visitList_exp(Example1Parser.List_expContext ctx) {
        return (Node) super.visitList_exp(ctx);
    }

    //Function Declaration

    @Override
    public Node visitFunction(Example1Parser.FunctionContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        DataType type = (DataType) visit(ctx.function_type());
        String id = ctx.CHARS().getText();
        List<FunctionParameter> functionParameters = new ArrayList<>();
        if(ctx.function_parameters() != null){
            functionParameters = visitFunction_parameters(ctx.function_parameters());
        }
        Block block = (Block) visit(ctx.block());
        Function function = new Function(functionParameters, type, block, id,lineNumber);
        block.parent = function;
        if(ctx.function_parameters() != null){
            for(int i = 0; i < function.functionParameterList.size(); i++){
                function.functionParameterList.get(i).parent = function;
                if(i != function.functionParameterList.size() - 1){
                    function.functionParameterList.get(i).sibling = function.functionParameterList.get(i + 1);
                }
            }
        }
        return function;
    }

    @Override
    public List<FunctionParameter> visitFunction_parameters(Example1Parser.Function_parametersContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        List<FunctionParameter> functionParameters = new ArrayList<>();
        for(int i = 0; i < ctx.type().size(); i++){
            DataType type = (DataType) visit(ctx.type().get(i));
            String chars = ctx.CHARS(i).getText();
            FunctionParameter functionParameter = new FunctionParameter(type, chars, lineNumber);
            functionParameters.add(functionParameter);
        }
        return functionParameters;
    }

    @Override
    public DataType visitVoidTypeFunction(Example1Parser.VoidTypeFunctionContext ctx) {
        return DataType.Void;
    }

    @Override
    public DataType visitTypeFunction(Example1Parser.TypeFunctionContext ctx) {
        return (DataType) visit(ctx.type());
    }

    //Class Declaration

    @Override
    public Node visitClass_decl(Example1Parser.Class_declContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        boolean abs = ctx.ABSTRACT() != null;
        String id = ctx.CHARS().getText();
        ArrayList<Node> classMember = new ArrayList<>();
        if (ctx.class_member() != null) {
            for (int i = 0; i < ctx.class_member().size(); i++) {
                Node node = (Node) visit(ctx.class_member().get(i));
                classMember.add(node);
            }
        }
        return new ClassDeclaration(classMember, abs, id, lineNumber);
    }


    //Expression

    ///TODO : 113 -> 184 esmaeel
    @Override
    public Node visitBoolExp(Example1Parser.BoolExpContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        String value = ctx.getChild(0).getText();
        boolean boolValue = Boolean.parseBoolean(value);
        return new BoolExpr(boolValue, lineNumber);
    }

    @Override
    public Node visitMinusOne(Example1Parser.MinusOneContext ctx) {
        return visitMinus_one(ctx.minus_one());
    }

    @Override
    public Node visitVariable(Example1Parser.VariableContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        String variable = ctx.CHARS().getText();
        return  new Variable_expr(variable,lineNumber);
    }

    @Override
    public Node visitNumber(Example1Parser.NumberContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        String value = ctx.NUMBER().getText();
        int number = Integer.parseInt(value);
        return new Number_expr(number,lineNumber);
    }

    @Override
    public Node visitStringExp(Example1Parser.StringExpContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        String value = ctx.STRING_EXP().getText();
        return new String_expr(value,lineNumber);
    }

    @Override
    public Node visitOperationExpression(Example1Parser.OperationExpressionContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        Expression left = (Expression) visit(ctx.expr(0));
        Expression right = (Expression) visit(ctx.expr(1));
        String val = ctx.getChild(1).getText();
        return new OperationExpression(left,right,val,lineNumber);
    }

    @Override
    public Node visitAddingOne(Example1Parser.AddingOneContext ctx) {
        return visitAdding_one(ctx.adding_one());
    }

    @Override
    public Node visitFastMatch(Example1Parser.FastMatchContext ctx) {
        return visitFast_math(ctx.fast_math());
    }

    @Override
    public Node visitFunctionCall(Example1Parser.FunctionCallContext ctx) {
        return (Node)super.visitFunctionCall(ctx);
    }

    //ToDo callfunction1
    @Override
    public Node visitCall_function(Example1Parser.Call_functionContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        String call_name = ctx.CHARS().getText();
        return new FunctionCall(call_name, lineNumber);
    }

    @Override
    public Node visitAdding_one(Example1Parser.Adding_oneContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(ctx.getChild(0).getText());
        stringBuilder.append(ctx.getChild(1).getText());
        return new AddingOne(stringBuilder.toString(),lineNumber);
    }

    @Override
    public Node visitMinus_one(Example1Parser.Minus_oneContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(ctx.getChild(0).getText());
        stringBuilder.append(ctx.getChild(1).getText());
        return new MinusOne(stringBuilder.toString(),lineNumber);
    }

    @Override
    public Node visitFast_math(Example1Parser.Fast_mathContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        String name = ctx.CHARS().getText();
        String operation = ctx.getChild(1).getText()   ;
        String val = ctx.NUMBER().getText();
        int number = Integer.parseInt(val);
        return new FastMath(name,operation,number,lineNumber);
    }


    // type

    @Override
    public DataType visitType(Example1Parser.TypeContext ctx) {
        String type = ctx.getChild(0).getText();
        DataType type1 = null;
        switch (type) {
            case "int":
                type1 = DataType.Integer;
                break;
            case "string":
                type1 = DataType.String;
                break;
            case "Boolean":
                type1 = DataType.Boolean;
                break;
            case "var":
                type1 = DataType.Var;
                break;
            default:
                break;
        }
        return type1;
    }


    //Code Attributes

    ///TODO: belkees 215 -> 324
    @Override
    public Object visitFor_statement(Example1Parser.For_statementContext ctx) {

        return super.visitFor_statement(ctx);
    }

    @Override
    public Expression visitFor_first_part(Example1Parser.For_first_partContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        String id = ctx.CHARS().getText();
        int number = Integer.parseInt(ctx.NUMBER().getText());
        return new For_First_Part(id,number,lineNumber);
    }

    @Override
    public Expression visitFor_secomd_part(Example1Parser.For_secomd_partContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        String value1 = ctx.CHARS(0).getText();
        Operation_if operation_if = (Operation_if) visit(ctx.operation_if());
        String value2 = ctx.getChild(2).getText();
        return new For_Second_Part(value1,operation_if,value2,lineNumber);
    }

//    @Override
//    public Object visitBlock(Example1Parser.BlockContext ctx) {
//        return super.visitBlock(ctx);
//    }

    @Override
    public Node visitForStatementNumber(Example1Parser.ForStatementNumberContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        String char1 = ctx.getChild(1).getText();
        number_attribute number_attribute = (number_attribute) visit(ctx.number_attribute());
        String char2 = ctx.getChild(2).getText();
        return new ForStatementNumber(char1,number_attribute,char2,lineNumber);
    }

    @Override
    public Node visitForStatementPlus(Example1Parser.ForStatementPlusContext ctx) {
        return (ForStatementPlus) visit(ctx.for_statement_adding_one());
    }

    @Override
    public Node visitForStatementMinus(Example1Parser.ForStatementMinusContext ctx) {
        return (ForStatementMinus) visit(ctx.for_statement_minuss_one());
    }

    @Override
    public Expression visitForStatementFastMatch(Example1Parser.ForStatementFastMatchContext ctx) {
        return (FastMath) visit(ctx.fast_math());
    }

    @Override
    public Expression visitFor_statement_adding_one(Example1Parser.For_statement_adding_oneContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(ctx.getChild(0).getText());
        stringBuilder.append(ctx.getChild(1).getText());
        return new AddingOne(stringBuilder.toString(),lineNumber);
    }

    @Override
    public Expression visitFor_statement_minuss_one(Example1Parser.For_statement_minuss_oneContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(ctx.getChild(0).getText());
        stringBuilder.append(ctx.getChild(1).getText());
        return new MinusOne(stringBuilder.toString(),lineNumber);
    }

    @Override
    public Expression visitNumber_attribute(Example1Parser.Number_attributeContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        String att = ctx.getChild(0).getText();
        return new number_attribute(att,lineNumber);
    }

    @Override
    public Node visitVariableDeclaration(Example1Parser.VariableDeclarationContext ctx) {
        return (Node) visit(ctx.variables_decl());
    }

    @Override
    public Node visitPrintCodeAttributes(Example1Parser.PrintCodeAttributesContext ctx) {
        return (Node) visit(ctx.print_statements());
    }

    @Override
    public Node visitIfCodeAttributes(Example1Parser.IfCodeAttributesContext ctx) {
        return (Node) visit(ctx.if_statment());
    }

    @Override
    public Node visitElseCodeAttributes(Example1Parser.ElseCodeAttributesContext ctx) {
        return (Node) visit(ctx.else_statment());
    }

    @Override
    public Node visitForCodeAttributes(Example1Parser.ForCodeAttributesContext ctx) {
        return (Node) visit(ctx.for_statement());
    }

    @Override
    public Node visitWhileStatements(Example1Parser.WhileStatementsContext ctx) {
        return (Node) visit(ctx.while_statment());
    }

    @Override
    public Node visitAssignmentCodeAttributes(Example1Parser.AssignmentCodeAttributesContext ctx) {
        return (Node) visit(ctx.assignment());
    }

    @Override
    public Node visitCallCodeAttributes(Example1Parser.CallCodeAttributesContext ctx) {
        return (Node) visit(ctx.call_function());
    }

    @Override
    public Node visitBreakCodeAttributes(Example1Parser.BreakCodeAttributesContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        String expression = ctx.BREAK().getText();
        return new ReturnOrBreak(null, expression, lineNumber);
    }

    @Override
    public Node visitReturnCodeAttributes(Example1Parser.ReturnCodeAttributesContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        String expression = ctx.RETURN().getText();
        Expression expression1 = null;
        if(ctx.expr() != null){
            expression1 = (Expression) visit(ctx.expr());
        }
        return new ReturnOrBreak(expression1, expression, lineNumber);
    }

    @Override
    public Object visitCodeAttributes(Example1Parser.CodeAttributesContext ctx) {
        return super.visitCodeAttributes(ctx);
    }

    ///TODO: abeer & shaza  326 -> 376
    @Override
    public Node visitElse_statment(Example1Parser.Else_statmentContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        Block block = (Block) visitBlock(ctx.block());
        return (Node) new ElseStatment(block,lineNumber);
    }
    @Override
    public Node visitOperation_if(Example1Parser.Operation_ifContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        String operation = ctx.getChild(0).getText();
        return new Operation_if(operation,lineNumber);
    }

    @Override
    public Node visitWhile_statment(Example1Parser.While_statmentContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        IfPart ifPart =(IfPart) visit(ctx.if_part());
        Block block = (Block) visitBlock(ctx.block());
        return new While_Statment(ifPart,block,lineNumber);
    }

    @Override
    public Node visitIf_statment(Example1Parser.If_statmentContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        IfPart ifPart =(IfPart) visit(ctx.if_part());
        Block block = (Block) visitBlock(ctx.block());
        List<ElseIfStatements> elseIfStatements = new ArrayList<>();
        if(!ctx.else_if_statements().isEmpty()){
            for(int i =0 ; i< ctx.else_if_statements().size();i++)
            {
                ElseIfStatements elseIfStatements1= (ElseIfStatements) visit(ctx.else_if_statements(i));
                elseIfStatements.add(elseIfStatements1);
            }
        }
        ElseStatment elseStatment = (ElseStatment) visit(ctx.else_statment());
        return new IfStatment(ifPart,block,elseIfStatements,elseStatment,lineNumber);

    }

    @Override
    public Object visitElse_if_statements(Example1Parser.Else_if_statementsContext ctx) {
        return super.visitElse_if_statements(ctx);
    }

    @Override
    public Object visitIfPartOperation(Example1Parser.IfPartOperationContext ctx) {
        return super.visitIfPartOperation(ctx);
    }

    @Override
    public Object visitCharsExpression(Example1Parser.CharsExpressionContext ctx) {
        return super.visitCharsExpression(ctx);
    }

    @Override
    public Object visitSingleExpression(Example1Parser.SingleExpressionContext ctx) {
        return super.visitSingleExpression(ctx);
    }

    @Override
    public Object visitAssignment(Example1Parser.AssignmentContext ctx) {
        return super.visitAssignment(ctx);
    }

    @Override
    public Object visitPrint_statements(Example1Parser.Print_statementsContext ctx) {
        return super.visitPrint_statements(ctx);
    }

    @Override
    public Object visitBlock(Example1Parser.BlockContext ctx) {
        return super.visitBlock(ctx);
    }

//Widgets


    @Override
    public Node visitScaffoldWidget(Example1Parser.ScaffoldWidgetContext ctx) {
        return (Node) visit(ctx.scaffold());
    }

    @Override
    public Node visitImageWidget(Example1Parser.ImageWidgetContext ctx) {
        return (Node) visit(ctx.image());
    }

    @Override
    public Node visitTextWidget(Example1Parser.TextWidgetContext ctx) {
        return (Node) visit(ctx.text());
    }

    @Override
    public Node visitContainerWidget(Example1Parser.ContainerWidgetContext ctx) {
        return (Node) visit(ctx.container());
    }

    @Override
    public Node visitColumnWidget(Example1Parser.ColumnWidgetContext ctx) {
        return (Node) visit(ctx.column());
    }

    @Override
    public Node visitRowWidget(Example1Parser.RowWidgetContext ctx) {
        return (Node) visit(ctx.row());
    }

    @Override
    public Node visitCenterWidget(Example1Parser.CenterWidgetContext ctx) {
        return (Node) visit(ctx.center());
    }

    @Override
    public Node visitElevatedButtonWidget(Example1Parser.ElevatedButtonWidgetContext ctx) {
        return (Node) visit(ctx.e_button());
    }

    //Scaffold
    @Override
    public Node visitScaffold(Example1Parser.ScaffoldContext ctx) {
        String widgetName = ctx.SCAFFOLD().getText();
        int lineNumber = ctx.getStart().getLine();
        List<KeyValueWidget> scaffoldArgs = new ArrayList<>();
        if (ctx.scaffoldArgs() != null) {
            scaffoldArgs = visitScaffoldArgs(ctx.scaffoldArgs());
        }
        Widget scaffoldWidget = new Widget(widgetName, scaffoldArgs, lineNumber);
        for (int i = 0; i < scaffoldWidget.widgetProperties.size(); i++) {
            if (i != scaffoldWidget.widgetProperties.size() - 1) {
                scaffoldWidget.widgetProperties.get(i).sibling = scaffoldWidget.widgetProperties.get(i + 1);
            }
            scaffoldWidget.widgetProperties.get(i).parent = scaffoldWidget;
        }
        return scaffoldWidget;
    }

    @Override
    public List<KeyValueWidget> visitScaffoldArgs(Example1Parser.ScaffoldArgsContext ctx) {
        List<KeyValueWidget> scaffoldArgs = new ArrayList<>();
        for (int i = 0; i < ctx.scaffoldProperty().size(); i++) {
            KeyValueWidget keyValueWidget = visitScaffoldProperty(ctx.scaffoldProperty().get(i));
            scaffoldArgs.add(keyValueWidget);
        }
        return scaffoldArgs;
    }

    @Override
    public KeyValueWidget visitScaffoldProperty(Example1Parser.ScaffoldPropertyContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        String key = ctx.getChild(0).getText();
        Node value = (Node) visit(ctx.getChild(2));
        KeyValueWidget keyValueWidget = new KeyValueWidget(key, value, lineNumber);
        value.parent = keyValueWidget;
        return keyValueWidget;
    }

    //Image
    @Override
    public Node visitImage(Example1Parser.ImageContext ctx) {
        String widgetName = ctx.IMAGEASSETS().getText();
        int lineNumber = ctx.getStart().getLine();
        List<KeyValueWidget> image = visitImageProperties(ctx.imageProperties());
        Widget imageWidget = new Widget(widgetName, image, lineNumber);
        for (int i = 0; i < imageWidget.widgetProperties.size(); i++) {
            if (i != imageWidget.widgetProperties.size() - 1) {
                imageWidget.widgetProperties.get(i).sibling = imageWidget.widgetProperties.get(i + 1);
            }
            imageWidget.widgetProperties.get(i).parent = imageWidget;
        }
        return imageWidget;
    }

    @Override
    public List<KeyValueWidget> visitImageProperties(Example1Parser.ImagePropertiesContext ctx) {
        String string_exp = ctx.STRING_EXP().getText();
        int lineNumber = ctx.getStart().getLine();
        Node string_expr = new String_expr(string_exp, lineNumber);
        KeyValueWidget key = new KeyValueWidget("data", string_expr, lineNumber);
        List<KeyValueWidget> image = new ArrayList<>();
        image.add(key);
        if (ctx.imageProperty() != null) {
            for (int i = 0; i < ctx.imageProperty().size(); i++) {
                KeyValueWidget keyValueWidget = (KeyValueWidget) visit(ctx.imageProperty().get(i));
                image.add(keyValueWidget);
            }
        }
        return image;
    }

    @Override
    public KeyValueWidget visitImageWidthHeight(Example1Parser.ImageWidthHeightContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        String key = ctx.getChild(0).getText();
        String value = ctx.NUMBER().getText();
        int intValue = Integer.parseInt(value);
        Node valueNode = new Number_expr(intValue, lineNumber) ;
        KeyValueWidget keyValueWidget = new KeyValueWidget(key, valueNode, lineNumber);
        valueNode.parent = keyValueWidget;
        return keyValueWidget;

    }

    @Override
    public KeyValueWidget visitImageColor(Example1Parser.ImageColorContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        String key = ctx.getChild(0).getText();
        Node value = (Node) visit(ctx.getChild(2));
        KeyValueWidget keyValueWidget = new KeyValueWidget(key, value, lineNumber);
        value.parent = keyValueWidget;
        return keyValueWidget;
    }



    //Text
    @Override
    public Node visitText(Example1Parser.TextContext ctx) {
        String widgetName = ctx.TEXT().getText();
        int lineNumber = ctx.getStart().getLine();
        List<KeyValueWidget> textArgs = new ArrayList<>();
        if (ctx.textProperties() != null) {
            textArgs = visitTextProperties(ctx.textProperties());
        }
        Widget textWidget = new Widget(widgetName, textArgs, lineNumber);
        for (int i = 0; i < textWidget.widgetProperties.size(); i++) {
            if (i != textWidget.widgetProperties.size() - 1) {
                textWidget.widgetProperties.get(i).sibling = textWidget.widgetProperties.get(i + 1);
            }
            textWidget.widgetProperties.get(i).parent = textWidget;
        }
        return textWidget;
    }

    @Override
    public List<KeyValueWidget> visitTextProperties(Example1Parser.TextPropertiesContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        List<KeyValueWidget> textArgs = new ArrayList<>();
        String value = ctx.STRING_EXP().getText();
        Node stringValue = new String_expr(value, lineNumber);
        KeyValueWidget keyValueWidget = new KeyValueWidget("data",stringValue,lineNumber);
        textArgs.add(keyValueWidget);
        if(ctx.textProperty() != null){
            KeyValueWidget textKeyValue = visitTextProperty(ctx.textProperty());
            textArgs.add(keyValueWidget);
        }
        return textArgs;
    }

    @Override
    public KeyValueWidget visitTextProperty(Example1Parser.TextPropertyContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        String key = ctx.STYLE().getText();
        Node value = (Node) visit(ctx.style());
        KeyValueWidget keyValueWidget = new KeyValueWidget(key, value, lineNumber);
        value.parent = keyValueWidget;
        return keyValueWidget;
    }

    @Override
    public Node visitStyle(Example1Parser.StyleContext ctx) {
        String widgetName = ctx.TEXTSTYLE().getText();
        int lineNumber = ctx.getStart().getLine();
        List<KeyValueWidget> styleArgs = new ArrayList<>();
        if (ctx.textStyleProprties() != null) {
            styleArgs = visitTextStyleProprties(ctx.textStyleProprties());
        }
        Widget textStyleWidget = new Widget(widgetName, styleArgs, lineNumber);
        for (int i = 0; i < textStyleWidget.widgetProperties.size(); i++) {
            if (i != textStyleWidget.widgetProperties.size() - 1) {
                textStyleWidget.widgetProperties.get(i).sibling = textStyleWidget.widgetProperties.get(i + 1);
            }
            textStyleWidget.widgetProperties.get(i).parent = textStyleWidget;
        }
        return textStyleWidget;
    }

    @Override
    public List<KeyValueWidget> visitTextStyleProprties(Example1Parser.TextStyleProprtiesContext ctx) {
        List<KeyValueWidget> textStyleArgs = new ArrayList<>();
        for (int i = 0; i < ctx.textStyleProprty().size(); i++) {
            KeyValueWidget keyValueWidget = (KeyValueWidget) visit(ctx.textStyleProprty().get(i));
            textStyleArgs.add(keyValueWidget);
        }
        return textStyleArgs;
    }

    @Override
    public KeyValueWidget visitColorKeyValue(Example1Parser.ColorKeyValueContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        String key = ctx.COLOR().getText();
        Node value = (Node) visit(ctx.color());
        KeyValueWidget keyValueWidget = new KeyValueWidget(key, value, lineNumber);
        value.parent = keyValueWidget;
        return keyValueWidget;
    }

    @Override
    public KeyValueWidget visitFontSizeKeyValue(Example1Parser.FontSizeKeyValueContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        String key = ctx.FONTSIZE().getText();
        int number = Integer.parseInt(ctx.NUMBER().getText());
        Node value = new Number_expr(number,lineNumber);
        KeyValueWidget keyValueWidget = new KeyValueWidget(key, value, lineNumber);
        value.parent = keyValueWidget;
        return keyValueWidget;
    }



    //Container
    @Override
    public Node visitContainer(Example1Parser.ContainerContext ctx) {
        String widgetName = ctx.CONTAINER().getText();
        int lineNumber = ctx.getStart().getLine();
        List<KeyValueWidget> containerProperties = new ArrayList<>();
        if (ctx.containerProperties() != null) {
            containerProperties = visitContainerProperties(ctx.containerProperties());
        }
        Widget containerWidget = new Widget(widgetName, containerProperties, lineNumber);
        for (int i = 0; i < containerWidget.widgetProperties.size(); i++) {
            if (i != containerWidget.widgetProperties.size() - 1) {
                containerWidget.widgetProperties.get(i).sibling = containerWidget.widgetProperties.get(i + 1);
            }
            containerWidget.widgetProperties.get(i).parent = containerWidget;
        }
        return containerWidget;
    }

    @Override
    public List<KeyValueWidget> visitContainerProperties(Example1Parser.ContainerPropertiesContext ctx) {
        List<KeyValueWidget> containerProp = new ArrayList<>();
        for (int i = 0; i < ctx.containerProperty().size(); i++) {
            KeyValueWidget keyValueWidget = (KeyValueWidget) visit(ctx.containerProperty().get(i));
            containerProp.add(keyValueWidget);
        }
        return containerProp;
    }

    @Override
    public KeyValueWidget visitContainerKeyValue(Example1Parser.ContainerKeyValueContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        String key = ctx.getChild(0).getText();
        Node value = (Node) visit(ctx.getChild(2));
        KeyValueWidget keyValueWidget = new KeyValueWidget(key, value, lineNumber);
        value.parent = keyValueWidget;
        return keyValueWidget;

    }

    @Override
    public KeyValueWidget visitContainerWidthHeight(Example1Parser.ContainerWidthHeightContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        String key = ctx.getChild(0).getText();
        String value = ctx.NUMBER().getText();
        int number = Integer.parseInt(value);
        Node valueNode = new Number_expr(number,lineNumber);
        KeyValueWidget keyValueWidget = new KeyValueWidget(key, valueNode, lineNumber);
        valueNode.parent = keyValueWidget;
        return keyValueWidget;
    }


    //ELEVATED
    @Override
    public Node visitE_button(Example1Parser.E_buttonContext ctx) {
        String widgetName = ctx.E_BUTTON().getText();
        int lineNumber = ctx.getStart().getLine();
        List<KeyValueWidget> e_buttonProperties = new ArrayList<>();
        if (ctx.e_buttonProperties() != null) {
            e_buttonProperties = visitE_buttonProperties(ctx.e_buttonProperties());
        }
        Widget E_ButtonWidget = new Widget(widgetName, e_buttonProperties, lineNumber);
        for (int i = 0; i < E_ButtonWidget.widgetProperties.size(); i++) {
            if (i != E_ButtonWidget.widgetProperties.size() - 1) {
                E_ButtonWidget.widgetProperties.get(i).sibling = E_ButtonWidget.widgetProperties.get(i + 1);
            }
            E_ButtonWidget.widgetProperties.get(i).parent = E_ButtonWidget;
        }
        return E_ButtonWidget;
    }

    @Override
    public List<KeyValueWidget> visitE_buttonProperties(Example1Parser.E_buttonPropertiesContext ctx) {
        List<KeyValueWidget> elevatedArgs = new ArrayList<>();
        for (int i = 0; i < ctx.e_ButtonProperty().size(); i++) {
            KeyValueWidget keyValueWidget = visitE_ButtonProperty(ctx.e_ButtonProperty().get(i));
            elevatedArgs.add(keyValueWidget);
        }
        return elevatedArgs;
    }

    @Override
    public KeyValueWidget visitE_ButtonProperty(Example1Parser.E_ButtonPropertyContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        String key = ctx.getChild(0).getText();
        Node value = (Node) visit(ctx.getChild(2));
        KeyValueWidget keyValueWidget = new KeyValueWidget(key, value, lineNumber);
        value.parent = keyValueWidget;
        return keyValueWidget;
    }


    @Override
    public Node visitCallFunction(Example1Parser.CallFunctionContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        String id = ctx.CHARS().getText();
        return new FunctionCall(id,lineNumber);
    }

    @Override
    public Node visitFunctionBlock(Example1Parser.FunctionBlockContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        Block block = new Block();
        WidgetFunction widgetFunction =  new WidgetFunction(block,lineNumber);
        block.parent = widgetFunction;
        return widgetFunction;
    }

    @Override
    public Node visitCenter(Example1Parser.CenterContext ctx) {
        String widgetName = ctx.CENTER().getText();
        int lineNumber = ctx.getStart().getLine();
        KeyValueWidget center = visitCenterWidgetArgs(ctx.centerWidgetArgs());
        List<KeyValueWidget> keyValueWidgets = new ArrayList<>();
        keyValueWidgets.add(center);
        Widget CenterWidget = new Widget(widgetName, keyValueWidgets, lineNumber);
        for (int i = 0; i < CenterWidget.widgetProperties.size(); i++) {
            if (i != CenterWidget.widgetProperties.size() - 1) {
                CenterWidget.widgetProperties.get(i).sibling = CenterWidget.widgetProperties.get(i + 1);
            }
            CenterWidget.widgetProperties.get(i).parent = CenterWidget;
        }
        return CenterWidget;
    }

    @Override
    public KeyValueWidget visitCenterWidgetArgs(Example1Parser.CenterWidgetArgsContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        String key = ctx.CHILD().getText();
        Node value = (Node) visit(ctx.widget());
        KeyValueWidget keyValueWidget = new KeyValueWidget(key, value, lineNumber);
        value.parent = keyValueWidget;
        return keyValueWidget;
    }


    @Override
    public Node visitColor(Example1Parser.ColorContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        String color = ctx.CHARS().getText();
        return new String_expr(color, lineNumber);
    }


    //Column and Row
    @Override
    public Node visitRow(Example1Parser.RowContext ctx) {

        String widgetName = ctx.ROW().getText();
        int lineNumber = ctx.getStart().getLine();
        List<KeyValueWidget> rowargs = new ArrayList<>();
        if (ctx.rowColumnArgs() != null) {
            rowargs = visitRowColumnArgs(ctx.rowColumnArgs());
        }
        Widget row_widget = new Widget(widgetName, rowargs, lineNumber);
        for (int i = 0; i < row_widget.widgetProperties.size(); i++) {
            if (i != row_widget.widgetProperties.size() - 1) {
                row_widget.widgetProperties.get(i).sibling = row_widget.widgetProperties.get(i + 1);
            }
            row_widget.widgetProperties.get(i).parent = row_widget;
        }
        return row_widget;

    }


    @Override
    public List<KeyValueWidget> visitRowColumnArgs(Example1Parser.RowColumnArgsContext ctx) {
        List<KeyValueWidget> rowcolumnarg = new ArrayList<>();
        for (int i = 0; i < ctx.rowColumnArg().size(); i++) {
            KeyValueWidget keyValueWidget = (KeyValueWidget) visit(ctx.rowColumnArg().get(i));
            rowcolumnarg.add(keyValueWidget);
        }
        return rowcolumnarg;
    }

    @Override
    public Node visitColumn(Example1Parser.ColumnContext ctx) {
        String widgetName = ctx.COLUMN().getText();
        int lineNumber = ctx.getStart().getLine();
        List<KeyValueWidget> coulmnarg = new ArrayList<>();
        if (ctx.rowColumnArgs() != null) {
            coulmnarg = visitRowColumnArgs(ctx.rowColumnArgs());
        }
        Widget row_widget = new Widget(widgetName, coulmnarg, lineNumber);
        for (int i = 0; i < row_widget.widgetProperties.size(); i++) {
            if (i != row_widget.widgetProperties.size() - 1) {
                row_widget.widgetProperties.get(i).sibling = row_widget.widgetProperties.get(i + 1);
            }
            row_widget.widgetProperties.get(i).parent = row_widget;
        }
        return row_widget;

    }

    @Override
    public KeyValueWidget visitColumnKeyValue(Example1Parser.ColumnKeyValueContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        String key = ctx.getChild(0).getText();
        Node value = (Node) visit(ctx.getChild(2));
        KeyValueWidget keyValueWidget = new KeyValueWidget(key, value, lineNumber);
        value.parent = keyValueWidget;
        return keyValueWidget;
    }

    @Override
    public KeyValueWidget visitColumnWidgetList(Example1Parser.ColumnWidgetListContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        String key = ctx.getChild(0).getText();
        Node value = (Node) visit(ctx.getChild(2));
        KeyValueWidget keyValueWidget = new KeyValueWidget(key, value, lineNumber);
        value.parent = keyValueWidget;
        return keyValueWidget;
    }

    @Override
    public Node visitMainAxisAlignment(Example1Parser.MainAxisAlignmentContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        StringBuilder stringBuilder = new StringBuilder();
        String key = ctx.MAINAXISALIGNMENT_VALUE().getText();
        stringBuilder.append(key);
        String dot = ctx.DOT().getText();
        String value = ctx.MAINAXISALIGNMENT_VALUES().getText();
        stringBuilder.append(dot).append(value);
        return new String_expr(stringBuilder.toString(), lineNumber);

    }

    @Override
    public Node visitMainAxisSize(Example1Parser.MainAxisSizeContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        StringBuilder stringBuilder = new StringBuilder();
        String key = ctx.MAINAXISSIZE_VALUE().getText();
        stringBuilder.append(key);
        String dot = ctx.DOT().getText();
        String value = ctx.MAINAXISSIZE_VALUES().getText();
        stringBuilder.append(dot).append(value);
        return new String_expr(stringBuilder.toString(), lineNumber);
    }

    @Override
    public Node visitWidgetList(Example1Parser.WidgetListContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        List<Node> widgetListLocal = new ArrayList<>();
        if(ctx.widget() != null){
            for (int i = 0; i < ctx.widget().size(); i++) {
                Node widget = (Node) visit(ctx.widget().get(i));
                widgetListLocal.add(widget);
            }
            WidgetList widgetList = new WidgetList(widgetListLocal, lineNumber);
            for (int i = 0; i < widgetList.widgets.size(); i++) {
                if (i != widgetList.widgets.size() - 1) {
                    widgetList.widgets.get(i).sibling = widgetList.widgets.get(i + 1);
                }
                widgetList.widgets.get(i).parent = widgetList;
            }
            return widgetList;
        }
        return new WidgetList(widgetListLocal, lineNumber);
    }
}


///yu



