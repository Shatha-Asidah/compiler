package AST.Expression;

import AST.Node.DataType;
import AST.Node.Node;
import AST.Node.NodeType;

public class FunctionParameters extends Node {
    DataType type;
    String char1;

    public FunctionParameters(DataType type, String char1,int lineNumber) {
        this.type = type;
        this.char1 = char1;
        this.nodeName = "FunctionParameters Expression";
        this.nodeType = NodeType.Expression;
        this.lineNumber = lineNumber;
    }

    @Override
    public String toString() {
        return "FunctionParameters{" +
                "type=" + type +
                ", char1='" + char1 + '\'' +
                '}';
    }
}
