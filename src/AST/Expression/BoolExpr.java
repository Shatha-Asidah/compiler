package AST.Expression;

import AST.Node.NodeType;

public class BoolExpr extends Expression{
    boolean value;

    public BoolExpr(boolean value, int lineNumber) {
        this.value = value;
        this.nodeName = "Bool Expression";
        this.nodeType = NodeType.Expression;
        this.lineNumber = lineNumber;
    }

    @Override
    public String toString() {
        return "BoolExpr{\n" +
                "value=" + value +
                "\n}";
    }
}
