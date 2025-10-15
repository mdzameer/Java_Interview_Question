package asgmnt3.misc;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);

        List<Integer> unique = numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(unique); // [1, 2, 3, 4, 5]
    }
}
