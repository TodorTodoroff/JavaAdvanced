package IteratorsAndComparatorsT8.Exercise.ComparingObjects05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Person> people = new ArrayList<>();
        while (!input.equals("END")) {
            String[] peopleParameters = input.split(" ");
            String name = peopleParameters[0];
            int age = Integer.parseInt(peopleParameters[1]);
            String town = peopleParameters[2];
            Person person = new Person(name, age, town);
            people.add(person);
            input = scanner.nextLine();
        }
        int comparePerson = Integer.parseInt(scanner.nextLine());
        Person personToCompare = people.get(comparePerson - 1);
        people.remove(personToCompare);
        int samePeople = 0;
        int diffPeople = 0;
        for (Person person : people) {
            if (person.compareTo(personToCompare) == 0) {
                samePeople++;
            } else {
                diffPeople++;
            }
        }
        int totalPeople = people.size() + 1;
        if (samePeople == 0) {
            System.out.println("No matches");
        } else {
            System.out.printf("%d %d %d", ++samePeople, diffPeople, totalPeople);
        }
    }
}