package AST;

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

    // type
    String test = "0";











    //Code Attributes
    String test1 = "0";















}
