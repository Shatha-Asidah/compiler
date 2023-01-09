package AST.TopLevel;

import AST.Expression.ListExpression;
import AST.Node.DataType;
import AST.Node.Node;

///TODO: add attributes
public class ListDeclaration extends Node {
    DataType type;
    ListExpression listExpression;

    public ListDeclaration(DataType type, ListExpression listExpression) {
        this.type = type;
        this.listExpression = listExpression;
    }

    @Override
    public String toString() {
        return "ListDeclaration{\n" +
                "type=" + type +
                ", listExpression=" + listExpression +
                "\n}";
    }
}
