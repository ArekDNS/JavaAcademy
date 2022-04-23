import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class main {

    public static void main(String[] args) {
        countChar("MyApp JavaAcademy");
    }

    public static void countChar(String arg) {
        Map<Character, Integer> characters = new HashMap<>();

        for (char c : arg.toLowerCase().replaceAll("\\s+", "").toCharArray()) {
            characters.merge(c, 1, Integer::sum);
        }
        characters.entrySet().stream().sorted(Entry.comparingByKey()).forEach(entry -> {
            System.out.println(entry.getKey() + " " + entry.getValue());
    });
    }
}
