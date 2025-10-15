package asgmnt3.misc;

import java.util.Arrays;

public class NonEmptyCount {
    public static void main(String[] args) {
        long count = Arrays.asList("Java", "", "Streams", "", "API")
                .stream()
                .filter(s -> !s.isEmpty())
                .count();

        System.out.println("Non-empty strings: " + count);
    }
}
