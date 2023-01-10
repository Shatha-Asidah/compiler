
package AST.Statement;

        import AST.Node.NodeType;

public class ElseStatment extends CodeAttributes{
    Block block;

    public ElseStatment(Block block,int lineNumber )
    {
        this.block = block;
        this.nodeName = "ElseStatment Expression";
        this.nodeType = NodeType.Expression;
        this.lineNumber = lineNumber;
    }



    @Override
    public String toString() {
        return "ElseStatment{" +
                "block=" + block +
                '}';
    }
}