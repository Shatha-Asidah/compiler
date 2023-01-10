package AST.Statement;

import AST.Node.Node;
import AST.Node.NodeType;

public class Assignment extends CodeAttributes {
    String char1;
    Exception expr;

    public Assignment(String char1, Exception expr, int lineNumber) {
        this.char1 = char1;
        this.expr = expr;
        this.nodeName = "Assignment Expression";
        this.nodeType = NodeType.Expression;
        this.lineNumber = lineNumber;
    }

    @Override
    public String toString() {
        return "Assignment{" +
                "char1='" + char1 + '\'' +
                ", expr=" + expr +
                '}';
    }
}

