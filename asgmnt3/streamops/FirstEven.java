package asgmnt3.streamops;

import java.util.Arrays;
import java.util.Optional;

public class FirstEven {
    public static void main(String[] args) {
        Optional<Integer> firstEven = Arrays.asList(1, 3, 5, 6, 8)
                .stream()
                .filter(n -> n % 2 == 0)
                .findFirst();

        firstEven.ifPresent(System.out::println); // 6
    }
}
