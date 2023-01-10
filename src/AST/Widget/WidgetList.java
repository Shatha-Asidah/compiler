package AST.Widget;

import AST.Node.Node;
import AST.Node.NodeType;

import java.util.List;

public class WidgetList extends Node {
    public List<Node> widgets;

    public WidgetList(List<Node> widgets, int lineNumber) {
        this.widgets = widgets;
        this.nodeName = "widget List";
        this.nodeType = NodeType.Widget;
        this.lineNumber = lineNumber;
        if(!this.widgets.isEmpty()){
            this.leftChild = this.widgets.get(0);
        }
        this.childCount = this.widgets.size();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Node child : this.widgets){
            stringBuilder.append(child);
            stringBuilder.append("\n");
        }
        if(this.widgets.isEmpty()){
            stringBuilder.append("[]");
        }
        return "WidgetList{\n" +
                "widgets=" + stringBuilder +
                "\n}";
    }
}
