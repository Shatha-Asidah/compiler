package AST.Expression;

import AST.Node.NodeType;

public class MinusOne extends Expression {

    String Variable1;

    public MinusOne(String variable1 , int lineNumber) {
        this.Variable1 = variable1;
        this.nodeName = "MinusOne Expression";
        this.nodeType = NodeType.Expression;
        this.lineNumber = lineNumber;
    }

    @Override
    public String toString() {
        return "MinusOne{" +
                "Variable1='" + Variable1 + '\'' +
                '}';
    }
}
