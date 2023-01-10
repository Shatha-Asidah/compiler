package AST.Expression;

import AST.Node.NodeType;

public class number_attribute extends Expression {
    String att;

    public number_attribute(String att, int lineNumber) {
        this.att = att;
        this.nodeName = "number_attribute Expression";
        this.nodeType = NodeType.Expression;
        this.lineNumber = lineNumber;
    }

    @Override
    public String toString() {
        return "number_attribute{" +
                "att='" + att + '\'' +
                '}';
    }
}
