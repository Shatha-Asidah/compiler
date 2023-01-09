package AST;

import AST.Expression.BoolExpr;
import AST.Node.Node;
import AST.TopLevel.ClassDeclaration;
import antlr.Example1Parser;
import antlr.Example1ParserBaseVisitor;

import java.util.ArrayList;

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















}
