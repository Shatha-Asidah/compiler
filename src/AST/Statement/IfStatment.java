package AST.Statement;

import AST.Expression.IfPart;
import AST.Node.Node;

public class IfStatment extends Node {
    IfPart ifpart;
    Block block;
    ElseIfStatements elseIfStatements;
    ElseStatment elseStatment;

    public IfStatment(IfPart ifpart, Block block, ElseIfStatements elseIfStatements, ElseStatment elseStatment) {
        this.ifpart = ifpart;
        this.block = block;
        this.elseIfStatements = elseIfStatements;
        this.elseStatment = elseStatment;
    }

    @Override
    public String toString() {
        return "IfStatment{" +
                "ifpart=" + ifpart +
                ", block=" + block +
                ", elseIfStatements=" + elseIfStatements +
                ", elseStatment=" + elseStatment +
                '}';
    }
}
