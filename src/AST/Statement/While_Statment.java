package AST.Statement;

import AST.Expression.IfPart;
import AST.Node.Node;
import AST.Node.NodeType;

public class While_Statment extends Node {
    IfPart ifPart;
    Block block;

    public While_Statment(IfPart ifPart, Block block,int lineNumber) {
        this.ifPart = ifPart;
        this.block = block;
        this.nodeName = "While_Statment Expression";
        this.nodeType = NodeType.Expression;
        this.lineNumber = lineNumber;
    }

    @Override
    public String toString() {
        return "While_Statment{" +
                "ifPart=" + ifPart +
                ", block=" + block +
                '}';
    }
}
