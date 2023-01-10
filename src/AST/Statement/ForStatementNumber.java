package AST.Statement;

import AST.Expression.number_attribute;
import AST.Node.Node;
import AST.Node.NodeType;

public class ForStatementNumber extends Node {
    String char1;
    number_attribute num_att;
    String char2;

    public ForStatementNumber(String char1, number_attribute num_att, String char2,int lineNumber) {
        this.char1 = char1;
        this.num_att = num_att;
        this.char2 = char2;
        this.nodeName = "ForStatementNumber Expression";
        this.nodeType = NodeType.Expression;
        this.lineNumber = lineNumber;
    }

    @Override
    public String toString() {
        return "ForStatementNumber{" +
                "char1='" + char1 + '\'' +
                ", num_att=" + num_att +
                ", char2='" + char2 + '\'' +
                '}';
    }
}
