package AST.TopLevel;

import AST.Node.DataType;
import AST.Expression.Expression;
import AST.Node.Node;
import AST.Node.NodeType;

///TODO: add attributes
public class VariableDeclaration extends Node {
    DataType type;
    String id;
    Expression expression;

    public VariableDeclaration(DataType type, String id, Expression expression, int lineNumber) {
        this.type = type;
        this.id = id;
        this.expression = expression;
        this.nodeName = "Variable Declaration";
        this.nodeType = NodeType.VariableDeclaration;
        this.leftChild = expression;
        this.lineNumber = lineNumber;
    }

    @Override
    public String toString() {
        return "VariableDeclaration{\n" +
                "type=" + type +
                ", id='" + id + '\'' +
                ", expression=" + expression +
                "\n}";
    }
}
