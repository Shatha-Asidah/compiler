package AST;

import AST.Node.Node;

import java.util.HashMap;
import java.util.Map;

public class SymbolTable {
    public Map<String, Node> mapSymbol;

    public SymbolTable() {
        this.mapSymbol = new HashMap<>();
    }

    public void addKeyValue(String key, Node value) {
        mapSymbol.put(key, value);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SymbolTable{\n");
        for (String key : mapSymbol.keySet()) {
            String value = mapSymbol.get(key).toString();
            stringBuilder.append(key).append(" : ").append(value);
            stringBuilder.append("\n");
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
