package AST.Statement;

import java.util.ArrayList;
import java.util.List;

public class Block extends CodeAttributes {
    public List<CodeAttributes> codeAttributes;

    public Block()
    {
        this.codeAttributes = new ArrayList<>();
    }
    public void AddCodeAttribute(CodeAttributes codeAttribute){
        this.codeAttributes.add(codeAttribute);
    }

    @Override
    public String toString() {
        return "Block{" +
                "codeAttributes=" + codeAttributes +
                '}';
    }
}
