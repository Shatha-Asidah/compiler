package AST;

import AST.Node.Node;
import antlr.Example1Parser;
import antlr.Example1ParserBaseVisitor;

public class MyVisitor extends Example1ParserBaseVisitor {
    SymbolTable symbolTable;

    public MyVisitor(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    //Program
    @Override
    public Program visitProgram(Example1Parser.ProgramContext ctx) {
        Program program = new Program();
        for (int i = 1; i < ctx.topLevel().size(); i++) {
            Node children = (Node) visit(ctx.getChild(i));
            program.addProgramNode(children);
        }
        return program;
    }


    // TopLevel
    @Override
    public Object visitVariables_decl(Example1Parser.Variables_declContext ctx) {
        return super.visitVariables_decl(ctx);
    }

    // type
    String test = "0";











    //Code Attributes
    String test1 = "0";















}
