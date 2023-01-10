package AST.Statement;

import AST.Node.Node;
import AST.Node.NodeType;

public class PrintStatements extends CodeAttributes {
    Exception expr;

    public PrintStatements(Exception expr,int lineNumber) {
        this.expr = expr;
        this.nodeName = "PrintStatements Expression";
        this.nodeType = NodeType.Expression;
        this.lineNumber = lineNumber;
    }

    @Override
    public String toString() {
        return "PrintStatements{" +
                "expr=" + expr +
                '}';
    }
}