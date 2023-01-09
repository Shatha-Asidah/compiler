package AST;

import AST.Node.Node;

import java.util.ArrayList;
import java.util.List;

public class Program extends Node {
    public List<Node> programNodes;

    public Program() {
        this.programNodes = new ArrayList<>();
    }

    public void addProgramNode(Node node){
        this.programNodes.add(node);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Node child : this.programNodes){
            stringBuilder.append(child);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
