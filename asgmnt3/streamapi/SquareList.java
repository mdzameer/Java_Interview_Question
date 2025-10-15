package asgmnt3.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6);

        // Use map() to square each number
        List<Integer> squares = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());

        // Print the result
        System.out.println("Squares: " + squares);
    }
}