package FunctionalProgrammingT5.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheSmallestElement07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(e -> Integer.parseInt(e))
                .collect(Collectors.toList());

        Function<List<Integer>, Integer> index = e -> e.stream().mapToInt(Integer::intValue).min().getAsInt();

        int indexOf = index.apply(numbers);
            System.out.println(numbers.lastIndexOf(indexOf));;


    }
}
