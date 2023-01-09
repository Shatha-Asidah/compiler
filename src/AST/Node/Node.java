package AST.Node;

abstract public class Node {
    public String nodeName;
    public NodeType nodeType;
    public int lineNumber;
    public int childCount;
    public Node leftChild;
    public Node parent;
    public Node sibling;
}
