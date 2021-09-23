package SetsAndMapsAdvancedT3.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class FixEmails07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        Map<String, String> allTogether = new LinkedHashMap<>();
        while (!name.equals("stop")) {
            String email = scanner.nextLine();

            if (!email.endsWith("us") && !email.endsWith("uk") && !email.endsWith("com")) {
                allTogether.put(name, email);
            }


            name = scanner.nextLine();
        }
        allTogether.entrySet().stream().forEach(e -> System.out.println(e.getKey() + " -> " + e.getValue()));

    }
}
