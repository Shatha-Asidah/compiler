
    package AST.Statement;


import AST.Node.Node;
import AST.Node.NodeType;

    public class ForStatementMinus extends Node {

        String Variable1;

        public ForStatementMinus(String variable1 , int lineNumber) {
            this.Variable1 = variable1;
            this.nodeName = "ForStatementMinus Expression";
            this.nodeType = NodeType.Expression;
            this.lineNumber = lineNumber;
        }

        @Override
        public String toString() {
            return "ForStatementMinus{" +
                    "Variable1='" + Variable1 + '\'' +
                    '}';
        }
    }




