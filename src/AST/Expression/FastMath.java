package AST.Expression;

import AST.Node.NodeType;

public class FastMath extends Expression {
    String name, operation;
    int number;

    public FastMath(String name, String operation, int number,int lineNumber) {
        this.name = name;
        this.operation = operation;
        this.number = number;
        this.nodeName = "FastMath Expression";
        this.nodeType = NodeType.Expression;
        this.lineNumber = lineNumber;

    }

    @Override
    public String toString() {
        return "FastMath{" +
                "name='" + name + '\'' +
                ", operation='" + operation + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
