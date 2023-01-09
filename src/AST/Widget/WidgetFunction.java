package AST.Widget;

import AST.Node.Node;
import AST.Node.NodeType;
import AST.Statement.Block;

public class WidgetFunction extends Node {
    Block block;

    public WidgetFunction(Block block,int lineNumber) {
        this.childCount = 1;
        this.leftChild = block;
        this.lineNumber = lineNumber;
        this.block = block;
        this.nodeName = "Widget Function";
        this.nodeType = NodeType.FunctionDecleration;
    }


    @Override
    public String toString() {
        return "WidgetFunction{\n" +
                "block=" + block +
                "\n}";
    }
}
