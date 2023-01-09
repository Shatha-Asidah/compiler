package AST.Widget;

import AST.Node.Node;
///TODO: add attributes
public class KeyValueWidget extends Node {
    String key;
    Node value;

    public KeyValueWidget(String key, Node value) {
        this.key = key;
        this.value = value;
        this.leftChild = value;
    }

    @Override
    public String toString() {
        return "KeyValueWidget{\n" +
                "key='" + key + '\'' +
                ", value=" + value +
                "\n}";
    }
}
