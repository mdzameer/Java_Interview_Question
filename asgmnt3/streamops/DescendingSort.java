package asgmnt3.streamops;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DescendingSort {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 9, 1, 7);

        List<Integer> sorted = numbers.stream()
                .sorted((a, b) -> b - a)
                .collect(Collectors.toList());

        System.out.println(sorted); // [9, 7, 5, 2, 1]
    }
}
