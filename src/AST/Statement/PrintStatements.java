package AST.Statement;

import AST.Node.Node;

public class PrintStatements extends CodeAttributes {
    Exception expr;

    public PrintStatements(Exception expr) {
        this.expr = expr;
    }

    @Override
    public String toString() {
        return "PrintStatements{" +
                "expr=" + expr +
                '}';
    }
}
