package AST;

import AST.Expression.BoolExpr;
import AST.Node.Node;
import AST.TopLevel.ClassDeclaration;
import AST.Widget.KeyValueWidget;
import AST.Widget.Widget;
import antlr.Example1Parser;
import antlr.Example1ParserBaseVisitor;

import javax.xml.crypto.dsig.keyinfo.KeyValue;
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
    // esmael aya
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
    public Object visitVariableDeclarationClass(Example1Parser.VariableDeclarationClassContext ctx) {
        return super.visitVariableDeclarationClass(ctx);
    }

    @Override
    public Object visitFunctionDeclarationClass(Example1Parser.FunctionDeclarationClassContext ctx) {
        return super.visitFunctionDeclarationClass(ctx);
    }

    @Override
    public Object visitVariableDeclarationType(Example1Parser.VariableDeclarationTypeContext ctx) {
        return super.visitVariableDeclarationType(ctx);
    }

    @Override
    public Object visitVaraibleListDeclaration(Example1Parser.VaraibleListDeclarationContext ctx) {
        return super.visitVaraibleListDeclaration(ctx);
    }

    @Override
    public Object visitList(Example1Parser.ListContext ctx) {
        return super.visitList(ctx);
    }

    @Override
    public Object visitList_exp(Example1Parser.List_expContext ctx) {
        return super.visitList_exp(ctx);
    }

    //Class Declaration

    @Override
    public Node visitClass_decl(Example1Parser.Class_declContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        boolean abs = ctx.ABSTRACT() != null;
        String id = ctx.CHARS().getText();
        ArrayList<Node> classMember = new ArrayList<>();
        if(ctx.class_member() != null){
            for(int i = 0; i < ctx.class_member().size(); i++){
                Node node = (Node) visit(ctx.class_member().get(i));
                classMember.add(node);
            }
        }
        return new ClassDeclaration(classMember, abs, id, lineNumber);
    }


    //Expression
    //Abeer & Shaza
    @Override
    public Node visitBoolExp(Example1Parser.BoolExpContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        String value = ctx.getChild(0).getText();
        boolean boolValue = Boolean.parseBoolean(value);
        return new BoolExpr(boolValue, lineNumber);
    }

    @Override
    public Object visitMinusOne(Example1Parser.MinusOneContext ctx) {
        return super.visitMinusOne(ctx);
    }

    @Override
    public Object visitVariable(Example1Parser.VariableContext ctx) {
        return super.visitVariable(ctx);
    }

    @Override
    public Object visitNumber(Example1Parser.NumberContext ctx) {
        return super.visitNumber(ctx);
    }

    @Override
    public Object visitStringExp(Example1Parser.StringExpContext ctx) {
        return super.visitStringExp(ctx);
    }

    @Override
    public Object visitOperationExpression(Example1Parser.OperationExpressionContext ctx) {
        return super.visitOperationExpression(ctx);
    }

    @Override
    public Object visitAddingOne(Example1Parser.AddingOneContext ctx) {
        return super.visitAddingOne(ctx);
    }

    @Override
    public Object visitFastMatch(Example1Parser.FastMatchContext ctx) {
        return super.visitFastMatch(ctx);
    }

    @Override
    public Object visitFunctionCall(Example1Parser.FunctionCallContext ctx) {
        return super.visitFunctionCall(ctx);
    }

    @Override
    public Object visitCall_function(Example1Parser.Call_functionContext ctx) {
        return super.visitCall_function(ctx);
    }

    @Override
    public Object visitAdding_one(Example1Parser.Adding_oneContext ctx) {
        return super.visitAdding_one(ctx);
    }

    @Override
    public Object visitMinus_one(Example1Parser.Minus_oneContext ctx) {
        return super.visitMinus_one(ctx);
    }

    @Override
    public Object visitFast_math(Example1Parser.Fast_mathContext ctx) {
        return super.visitFast_math(ctx);
    }



    // type
    String test = "0";











    //Code Attributes
    String test1 = "0";





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
        if(ctx.scaffoldArgs() != null){
            scaffoldArgs = visitScaffoldArgs(ctx.scaffoldArgs());
        }
        Widget scaffoldWidget = new Widget(widgetName, scaffoldArgs, lineNumber);
        for(int i = 0; i < scaffoldWidget.widgetProperties.size(); i++){
            if(i != scaffoldWidget.widgetProperties.size() - 1){
                scaffoldWidget.widgetProperties.get(i).sibling = scaffoldWidget.widgetProperties.get(i + 1);
            }
            scaffoldWidget.widgetProperties.get(i).parent = scaffoldWidget;
        }
        return scaffoldWidget;
    }

    @Override
    public List<KeyValueWidget> visitScaffoldArgs(Example1Parser.ScaffoldArgsContext ctx) {
        List<KeyValueWidget> scaffoldArgs = new ArrayList<>();
        for(int i = 0; i < ctx.scaffoldProperty().size(); i++){
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
        KeyValueWidget keyValueWidget = new KeyValueWidget(key, value);
        value.parent = keyValueWidget;
        return keyValueWidget;
    }

    //Image

    @Override
    public Object visitImage(Example1Parser.ImageContext ctx) {
        return super.visitImage(ctx);
    }

    @Override
    public Object visitImageProperties(Example1Parser.ImagePropertiesContext ctx) {
        return super.visitImageProperties(ctx);
    }

    @Override
    public Object visitImageWidthHeight(Example1Parser.ImageWidthHeightContext ctx) {
        return super.visitImageWidthHeight(ctx);
    }

    @Override
    public Object visitImageColor(Example1Parser.ImageColorContext ctx) {
        return super.visitImageColor(ctx);
    }



    //Text


    @Override
    public Object visitText(Example1Parser.TextContext ctx) {
        return super.visitText(ctx);
    }

    @Override
    public Object visitTextProperties(Example1Parser.TextPropertiesContext ctx) {
        return super.visitTextProperties(ctx);
    }

    @Override
    public Object visitTextProperty(Example1Parser.TextPropertyContext ctx) {
        return super.visitTextProperty(ctx);
    }

    @Override
    public Object visitStyle(Example1Parser.StyleContext ctx) {
        return super.visitStyle(ctx);
    }

    @Override
    public Object visitTextStyleProprties(Example1Parser.TextStyleProprtiesContext ctx) {
        return super.visitTextStyleProprties(ctx);
    }

    @Override
    public Object visitColorKeyValue(Example1Parser.ColorKeyValueContext ctx) {
        return super.visitColorKeyValue(ctx);
    }

    @Override
    public Object visitFontSizeKeyValue(Example1Parser.FontSizeKeyValueContext ctx) {
        return super.visitFontSizeKeyValue(ctx);
    }
}
