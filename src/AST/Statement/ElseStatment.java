package AST.Statement;

public class ElseStatment extends CodeAttributes{
    Block block;

    public ElseStatment(Block block) {
        this.block = block;
    }

    @Override
    public String toString() {
        return "ElseStatment{" +
                "block=" + block +
                '}';
    }
}
