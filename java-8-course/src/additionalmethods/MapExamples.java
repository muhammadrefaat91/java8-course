package additionalmethods;

import java.util.HashMap;
import java.util.Map;

public class MapExamples {

    public static void main(String[] args) {
        Map<Integer, String> usersName = new HashMap<>();
        usersName.put(1, "Ahmed");
        usersName.put(3, null);
        usersName.put(2, "Ali");

        String defaultIfKeyMapped = usersName.computeIfAbsent(3,  (s) -> "Mohammed");

        System.out.println("return Default If Key is Mapped " + defaultIfKeyMapped);

        String defaultIfKeyNotMapped = usersName.getOrDefault(4, "Jose");

        System.out.println("return Default If Key not Mapped " + defaultIfKeyNotMapped);

        usersName.entrySet().removeIf(u -> u.getValue().equalsIgnoreCase("ali"));

        System.out.println(usersName);
    }
}
