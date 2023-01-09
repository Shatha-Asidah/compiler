package AST.Widget;

import AST.Node.Node;
import AST.Node.NodeType;

import java.util.List;

public class Widget extends Node {
    String widget;
    public List<KeyValueWidget> widgetProperties;

    public Widget(String widget, List<KeyValueWidget> widgetProperties, int lineNumber) {
        this.widget = widget;
        this.widgetProperties = widgetProperties;
        this.nodeName = widget;
        this.nodeType = NodeType.Widget;
        if(!widgetProperties.isEmpty()){
            this.leftChild = this.widgetProperties.get(0);
        }
        this.lineNumber = lineNumber;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (KeyValueWidget child : this.widgetProperties){
            stringBuilder.append(child);
            stringBuilder.append("\n");
        }
        if(widgetProperties.isEmpty()){
            stringBuilder.append("[]");
        }
        return "Widget{\n" +
                "widget='" + widget + '\'' +
                ", widgetProperties=\n" + stringBuilder +
                "\n}";
    }
}
