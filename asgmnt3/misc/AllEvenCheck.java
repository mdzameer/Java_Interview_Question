package asgmnt3.misc;

import java.util.Arrays;

public class AllEvenCheck {
    public static void main(String[] args) {
        boolean allEven = Arrays.asList(2, 4, 6, 8)
                .stream()
                .allMatch(n -> n % 2 == 0);

        System.out.println("All even? " + allEven);
    }
}
