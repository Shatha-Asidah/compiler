package AST.Expression;

import AST.Node.NodeType;

public class For_Second_Part extends Expression {
    String stringid;
    Operation_if op;
    String value2;

    public For_Second_Part(String stringid, Operation_if op, String value2, int lineNumber) {
        this.stringid = stringid;
        this.op = op;
        this.value2 = value2;
        this.nodeName = "For_Second_Part Expression";
        this.nodeType = NodeType.Expression;
        this.lineNumber = lineNumber;


    }

    @Override
    public String toString() {
        return "For_Second_Part{" +
                "stringid='" + stringid + '\'' +
                ", op=" + op +
                ", value2='" + value2 + '\'' +
                '}';
    }
}

