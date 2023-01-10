package AST.Statement;

import AST.Expression.IfPart;
import AST.Node.Node;
import AST.Node.NodeType;

import java.util.ArrayList;
import java.util.List;

public class IfStatment extends Node {
    IfPart ifpart;
    Block block;
    public List<ElseIfStatements> elseIfStatements;
    ElseStatment elseStatment;

    public IfStatment(IfPart ifpart, Block block, List<ElseIfStatements> elseIfStatements, ElseStatment elseStatment,int lineNumber) {
        this.ifpart = ifpart;
        this.block = block;
        this.elseIfStatements = elseIfStatements;
        this.elseStatment = elseStatment;
        this.nodeName = " IfStatment Expression";
        this.nodeType = NodeType.Expression;
        this.lineNumber = lineNumber;
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