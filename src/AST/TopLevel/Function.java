package AST.TopLevel;

import AST.Node.DataType;
import AST.Node.Node;
import AST.Node.NodeType;
import AST.Statement.Block;

import java.util.List;

public class Function extends Node {
    public List<FunctionParameter> functionParameterList;
    DataType type;
    Block block;
    String identifier;

    public Function(List<FunctionParameter> functionParameterList, DataType type, Block block, String identifier, int lineNumber) {
        this.functionParameterList = functionParameterList;
        this.type = type;
        this.block = block;
        this.identifier = identifier;
        this.nodeName = "Function Declaration";
        this.nodeType = NodeType.FunctionDeclaration;
        if(this.functionParameterList.isEmpty()){
            this.leftChild = block;
        } else {
            this.leftChild = this.functionParameterList.get(0);
        }
        this.childCount = this.functionParameterList.size() + 1;
    }

    @Override
    public String toString() {
        return "Function{\n" +
                "identifier='" + identifier + '\'' +
                ", type=" + type +
                ", functionParameterList :\n" + functionParameterList +
                ", block: " + block +
                "\n}";
    }
}
