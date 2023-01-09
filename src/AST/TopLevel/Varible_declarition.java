package AST.TopLevel;

import AST.Node.DataType;
import AST.Expression.Expression;
import AST.Node.Node;

public class Varible_declarition extends Node {
    DataType type;
    String id;
    Expression expression;

    public Varible_declarition(DataType type, String id, Expression expression) {
        this.type = type;
        this.id = id;
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "Varible_declarition{" +
                "type=" + type +
                ", id='" + id + '\'' +
                ", expression=" + expression +
                '}';
    }
}
