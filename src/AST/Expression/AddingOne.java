package AST.Expression;

import AST.Node.NodeType;

public class AddingOne extends Expression {

    String Variable1;

    public AddingOne(String variable1 , int lineNumber) {
        this.Variable1 = variable1;
        this.nodeName = "AddingOne Expression";
        this.nodeType = NodeType.Expression;
        this.lineNumber = lineNumber;
    }


    @Override

    public String toString() {
        return "AddingOne{" +
                "Variable1='" + Variable1 + '\'' +
                '}';
    }
}
