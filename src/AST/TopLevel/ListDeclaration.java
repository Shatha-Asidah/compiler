package AST.TopLevel;

import AST.DataType;
import AST.Expression.Expression;
import AST.Expression.ListExpression;
import AST.Node.Node;

import java.util.ArrayList;
import java.util.List;

public class ListDeclaration extends Node {
    DataType type;
    ListExpression listExpression;

    public ListDeclaration(DataType type, ListExpression listExpression) {
        this.type = type;
        this.listExpression = listExpression;
    }

    @Override
    public String toString() {
        return "ListDeclaration{" +
                "type=" + type +
                ", listExpression=" + listExpression +
                '}';
    }
}
