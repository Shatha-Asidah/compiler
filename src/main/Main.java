package main;

import AST.MyVisitor;
import AST.Program;
import AST.SymbolTable;
import antlr.Example1Lexer;
import antlr.Example1Parser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
    public static void main(String[] args) {
        try {
            String path = "Test/text2.txt";
            CharStream input = fromFileName(path);
            Example1Lexer lexer = new Example1Lexer(input);
            CommonTokenStream token = new CommonTokenStream(lexer);
            Example1Parser parser = new Example1Parser(token);
            ParseTree tree = parser.program();
            SymbolTable symbolTable = new SymbolTable();
            MyVisitor ProgramVisitor = new MyVisitor(symbolTable);
            Program program = (Program) ProgramVisitor.visit(tree);
            System.out.println(program);
            System.out.println("\n");
            System.out.println(symbolTable);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
//git add .
//git commit -m "name"
//git push origin main