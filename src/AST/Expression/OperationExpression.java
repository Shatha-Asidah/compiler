package AST.Expression;

public class OperationExpression extends Expression {
    Expression left;
    Expression right;
    String operation;
    ///TODO: add attributes
    public OperationExpression(Expression left, Expression right, String operation) {
        this.left = left;
        this.right = right;
        this.operation = operation;
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
