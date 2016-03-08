import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Etl {
    public Map<String, Integer> transform(Map<Integer, List<String>> old) {
        Map<String, Integer> etl = new HashMap<String, Integer>();

        for (Map.Entry<Integer, List<String>> entry : old.entrySet()) {
            List<String> list = entry.getValue();
            int value = entry.getKey();
            for (String key : list) etl.put(key.toLowerCase(), value);
        }
        return etl;
    }
}
