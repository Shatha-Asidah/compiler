package AST.Expression;

import AST.Node.Node;
import AST.Node.NodeType;

public class IfPart extends Expression {
    String_expr string_expr;
    Expression expression;

    public IfPart(String_expr string_expr, Expression expression,int lineNumber) {
        this.string_expr = string_expr;
        this.expression = expression;
        this.nodeName = "IfPart Expression";
        this.nodeType = NodeType.Expression;
        this.lineNumber = lineNumber;

    }

    @Override
    public String toString() {
        return "IfPart{" +
                "string_expr=" + string_expr +
                ", expression=" + expression +
                '}';
    }
}
