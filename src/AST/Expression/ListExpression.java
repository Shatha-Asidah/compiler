package AST.Expression;

import AST.Node.Node;
import AST.Node.NodeType;
//import jdk.nashorn.internal.runtime.regexp.joni.constants.NodeType;
import java.util.ArrayList;
import java.util.List;

public class ListExpression extends Node {
    public List<Expression> expressions;

    public ListExpression(int lineNumber) {
        this.expressions =  new ArrayList<>();;
        this.lineNumber = lineNumber;
        this.nodeName = "ListExpression";
        this.nodeType = NodeType.Expression;
    }

    public void addExpression(Expression expression){
        this.expressions.add(expression);
    }

    @Override
    public String toString() {
        return "ListExpression{" +
                "expressions=" + expressions +
                '}';
    }
}
