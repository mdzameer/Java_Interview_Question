package asgmnt3.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxElementUsingStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 45, 32, 67, 89, 23);

        // Use stream to find the maximum element
        Optional<Integer> max = numbers.stream()
                .max(Integer::compareTo);

        // Print the result
        max.ifPresent(m -> System.out.println("Maximum element: " + m));
    }
}
