package AST.Statement;


import AST.Node.Node;
import AST.Node.NodeType;

public class ForStatementPlus extends Node {

        String Variable1;

        public ForStatementPlus(String variable1 , int lineNumber) {
            this.Variable1 = variable1;
            this.nodeName = "ForStatementPlus Expression";
            this.nodeType = NodeType.Expression;
            this.lineNumber = lineNumber;
        }

    @Override
    public String toString() {
        return "ForStatementPlus{" +
                "Variable1='" + Variable1 + '\'' +
                '}';
    }
}


