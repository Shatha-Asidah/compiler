package AST.TopLevel;

import AST.Node.Node;
import AST.Node.NodeType;

import java.util.ArrayList;
import java.util.List;

public class ClassDeclaration extends Node {
    boolean abstractClass;
    String identifier;
    List<Node> classMember;

    public ClassDeclaration(List<Node> classMember ,boolean abstractClass, String identifier, int lineNumber) {
        this.classMember = classMember;
        this.abstractClass = abstractClass;
        this.identifier = identifier;
        this.nodeName = "ClassDeclaration";
        this.nodeType = NodeType.ClassDeclaration;
        if(!classMember.isEmpty()){
            this.leftChild = this.classMember.get(0);
        }
        this.lineNumber = lineNumber;
        this.childCount = classMember.size();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Node child : this.classMember){
            stringBuilder.append(child);
            stringBuilder.append("\n");
        }
        if(this.classMember.isEmpty()){
            stringBuilder.append("[]");
        }
        return "ClassDeclaration{\n" +
                "abstractClass=" + abstractClass +
                ", identifier='" + identifier + '\'' +
                ", classMember=" + stringBuilder +
                "\n}";
    }
}
