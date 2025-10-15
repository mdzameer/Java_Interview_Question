package asgmnt3.misc;

import java.util.Arrays;

public class CountGreaterThan100 {
    public static void main(String[] args) {
        long count = Arrays.asList(50, 150, 200, 90, 300)
                .stream()
                .filter(n -> n > 100)
                .count();

        System.out.println("Count > 100: " + count);
    }
}
