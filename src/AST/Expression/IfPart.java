package AST.Expression;

import AST.Node.Node;

public class IfPart extends Node {
    String_expr string_expr;
    Expression expression;

    public IfPart(String_expr string_expr, Expression expression) {
        this.string_expr = string_expr;
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "IfPart{" +
                "string_expr=" + string_expr +
                ", expression=" + expression +
                '}';
    }
}
