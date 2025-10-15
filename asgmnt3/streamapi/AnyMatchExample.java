package asgmnt3.streamapi;

import java.util.Arrays;
import java.util.List;

public class AnyMatchExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(45, 60, 99, 101, 88);

        boolean hasLarge = numbers.stream()
                .anyMatch(n -> n > 100);

        System.out.println("Any number > 100? " + hasLarge);
    }
}
