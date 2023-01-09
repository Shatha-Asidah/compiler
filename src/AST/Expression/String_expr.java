package AST.Expression;

import AST.Node.Node;

public class String_expr extends Node {
    String string_expr;

    public String_expr(String string_expr) {
        this.string_expr = string_expr;
    }

    @Override
    public String toString() {
        return "String_expr{" +
                "string_expr='" + string_expr + '\'' +
                '}';
    }
}

