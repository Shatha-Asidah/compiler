package AST.Statement;

import AST.Node.Node;

public class Assignment extends CodeAttributes {
    Exception expr;

    public Assignment(Exception expr) {
        this.expr = expr;
    }

    @Override
    public String toString() {
        return "Assignment{" +
                "expr=" + expr +
                '}';
    }
}
