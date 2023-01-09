package AST.Statement;

import java.util.ArrayList;
import java.util.List;
///TODO: add attributes
public class Block extends CodeAttributes {
    public List<CodeAttributes> codeAttributes;

    public Block() {
        this.codeAttributes = new ArrayList<>();
    }

    public void addCodeAttribute(CodeAttributes codeAttribute){
        this.codeAttributes.add(codeAttribute);
    }

    @Override
    public String toString() {
        return "Block{" +
                "codeAttributes=" + codeAttributes +
                '}';
    }
}
