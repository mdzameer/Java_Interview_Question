package asgmnt3.functionalinterface;

import java.util.function.Predicate;

public class PositiveNumberCheck {
    public static void main(String[] args) {
        // Predicate to check if a number is positive
        Predicate<Integer> isPositive = number -> number > 0;

        // Example usage
        int num = 10;
        System.out.println("Is " + num + " positive? " + isPositive.test(num));

        num = -5;
        System.out.println("Is " + num + " positive? " + isPositive.test(num));
    }
}
