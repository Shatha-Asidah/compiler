package AST;

import antlr.Example1Parser;
import antlr.Example1ParserBaseVisitor;

public class MyVisitor extends Example1ParserBaseVisitor {

    //Program

    @Override
    public Object visitProgram(Example1Parser.ProgramContext ctx) {
        return super.visitProgram(ctx);
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
