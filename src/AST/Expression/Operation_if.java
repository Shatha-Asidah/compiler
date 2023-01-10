  package AST.Expression;

import AST.Node.NodeType;

    public class Operation_if extends Expression {
        String operation;

        public Operation_if(String operation, int lineNumber) {
            this.operation = operation;
            this.nodeName = "Operation_if Expression";
            this.nodeType = NodeType.Expression;
            this.lineNumber = lineNumber;

        }

        @Override
        public String toString() {
            return "Operation_if{" +
                    "operation='" + operation + '\'' +
                    '}';
        }
    }

