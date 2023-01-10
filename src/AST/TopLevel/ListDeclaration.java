package AST.TopLevel;

import AST.Expression.ListExpression;
import AST.Node.DataType;
import AST.Node.Node;
import AST.Node.NodeType;

///TODO: add attributes
public class ListDeclaration extends Node {
    DataType type;
    ListExpression listExpression;

    public ListDeclaration(DataType type, ListExpression listExpression,int lineNumber) {
        this.type = type;
        this.listExpression = listExpression;
        this.nodeName = "ListDeclaration";
        //this.nodeType = NodeType.;
        this.lineNumber = lineNumber;

    }

    @Override
    public String toString() {
        return "ListDeclaration{\n" +
                "type=" + type +
                ", listExpression=" + listExpression +
                "\n}";
    }
}
