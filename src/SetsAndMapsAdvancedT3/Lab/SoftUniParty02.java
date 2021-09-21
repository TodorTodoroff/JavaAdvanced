package SetsAndMapsAdvancedT3.Lab;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SoftUniParty02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> guests = new TreeSet<>();
        String input = scanner.nextLine();

        while (!input.equals("PARTY")) {
            guests.add(input);
            input = scanner.nextLine();
        }
        input = scanner.nextLine();

        while (!input.equals("END")){
            guests.remove(input);
            input = scanner.nextLine();
        }
        System.out.println(guests.size());
        System.out.println(String.join(System.lineSeparator(),guests));
    }
}
