package AST.Expression;

import AST.Node.NodeType;

public class OperationExpression extends Expression {
    Expression left;
    Expression right;
    String operation;

    public OperationExpression(Expression left, Expression right, String operation,int lineNumber) {
        this.left = left;
        this.right = right;
        this.operation = operation;
        this.nodeName = "OperationExpression Expression";
        this.nodeType = NodeType.Expression;
        this.lineNumber = lineNumber;

    }

    @Override
    public String toString() {
        return "OperationExpression{" +
                "left=" + left +
                ", right=" + right +
                ", operation='" + operation + '\'' +
                '}';
    }
}
