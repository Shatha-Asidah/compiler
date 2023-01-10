package AST.Statement;

import AST.Expression.Expression;
import AST.Node.NodeType;

public class ReturnOrBreak extends CodeAttributes{
    Expression expression;
    String keyWord;

    public ReturnOrBreak(Expression expression, String keyWord, int lineNumber) {
        this.nodeName = "ReturnOrBreak";
        this.nodeType = NodeType.Statements;
        this.lineNumber = lineNumber;
        if(expression != null){
            this.expression = expression;
            this.leftChild = expression;
        }
        this.keyWord = keyWord;
    }

    @Override
    public String toString() {
        return "ReturnOrBreak{" +
                "expression=" + expression +
                ", keyWord='" + keyWord + '\'' +
                '}';
    }
}
