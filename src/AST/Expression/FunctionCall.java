package AST.Expression;

import AST.Node.NodeType;

public class FunctionCall extends Expression {
    String call_name;

    public FunctionCall(String call_name, int lineNumber) {
        this.call_name = call_name;
        this.nodeName = "call_function Expression";
        this.nodeType = NodeType.Expression;
        this.lineNumber = lineNumber;
    }

    @Override
    public String toString() {
        return "FunctionCall{" +
                "call_name='" + call_name + '\'' +
                '}';
    }
}
<<<<<<< HEAD
=======

>>>>>>> f26f6eff6f7efc9b5df5d5c5319c1ede1d793e20
