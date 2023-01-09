package AST.Expression;

import AST.Node.NodeType;

public class Variable_expr extends Expression {

    String Variable_expr ;
    public Variable_expr(String Variable_expr ,int lineNumber) {

        this.Variable_expr = Variable_expr;
        this.nodeName = "Variable_expr Expression";
        this.nodeType = NodeType.Expression;
        this.lineNumber = lineNumber;
    }

    @Override
    public String toString() {
        return "Variable_expr{" +
                "Variable_expr='" + Variable_expr + '\'' +
                '}';
    }
}
