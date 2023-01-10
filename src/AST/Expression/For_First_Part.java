
    package AST.Expression;

import AST.Node.NodeType;

    public class For_First_Part extends Expression {
        String stringid;
        int idvalue;

        public For_First_Part(String stringid, int idvalue,int lineNumber) {
            this.stringid = stringid;
            this.idvalue = idvalue;
            this.nodeName = "For_First_Part Expression";
            this.nodeType = NodeType.Expression;
            this.lineNumber = lineNumber;

        }

        @Override
        public String toString() {
            return "For_First_Part{" +
                    "stringid='" + stringid + '\'' +
                    ", idvalue=" + idvalue +
                    '}';
        }
    }

