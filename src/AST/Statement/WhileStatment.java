package AST.Statement;

import AST.Expression.IfPart;

public class WhileStatment extends CodeAttributes{
    IfPart ifpart;
    Block block;
    public WhileStatment(IfPart ifpart, Block block) {
        this.ifpart = ifpart;
        this.block = block;
    }

    @Override
    public String toString() {
        return "WhileStatment{" +
                "ifpart=" + ifpart +
                ", block=" + block +
                '}';
    }
}
