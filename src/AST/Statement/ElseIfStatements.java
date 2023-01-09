package AST.Statement;

import AST.Expression.IfPart;
import AST.Node.Node;

public class ElseIfStatements extends CodeAttributes {
    IfPart ifPart;
    Block block;

    public ElseIfStatements(IfPart ifPart, Block block) {
        this.ifPart = ifPart;
        this.block = block;
    }

    @Override
    public String toString() {
        return "ElseIfStatements{" +
                "ifPart=" + ifPart +
                ", block=" + block +
                '}';
    }
}
