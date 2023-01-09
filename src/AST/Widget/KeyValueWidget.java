package AST.Widget;

import AST.Node.Node;
import AST.Node.NodeType;

///TODO: add attributes
public class KeyValueWidget extends Node {
    String key;
    Node value;

    public KeyValueWidget(String key, Node value, int lineNumber) {
        this.key = key;
        this.value = value;
        this.leftChild = value;
        this.lineNumber = lineNumber;
        this.nodeName = key;
        this.nodeType = NodeType.Widget;
    }

    @Override
    public String toString() {
        return "KeyValueWidget{\n" +
                "key='" + key + '\'' +
                ", value=" + value +
                "\n}";
    }
}
