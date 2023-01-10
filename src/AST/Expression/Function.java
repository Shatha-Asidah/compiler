package AST.Expression;

import AST.Node.NodeType;
import AST.Statement.Block;

public class Function extends Expression {
    String namefun;
    FunctionParameters param;
    Block block;

    public Function(String namefun, FunctionParameters param, Block block,int lineNumber) {

        this.namefun = namefun;
        this.param = param;
        this.block = block;
        this.nodeName = "Function Expression";
        this.nodeType = NodeType.Expression;
        this.lineNumber = lineNumber;
    }

    @Override
    public String toString() {
        return "Function{" +
                "namefun='" + namefun + '\'' +
                ", param=" + param +
                ", block=" + block +
                '}';
    }
}
