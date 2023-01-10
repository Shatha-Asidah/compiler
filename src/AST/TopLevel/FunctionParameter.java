package AST.TopLevel;

import AST.Node.DataType;
import AST.Node.Node;
import AST.Node.NodeType;

public class FunctionParameter extends Node {
    DataType type;
    String id;

    public FunctionParameter(DataType type, String id, int lineNumber) {
        this.type = type;
        this.id = id;
        this.nodeName = "Function Parameter";
        this.nodeType = NodeType.FunctionParameter;
        this.lineNumber = lineNumber;
    }

    @Override
    public String toString() {
        return "FunctionParameter{" +
                "type=" + type +
                ", id='" + id + '\'' +
                '}';
    }
}
