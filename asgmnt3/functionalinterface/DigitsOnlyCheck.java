package asgmnt3.functionalinterface;

import java.util.function.Predicate;

public class DigitsOnlyCheck {
    public static void main(String[] args) {
        // Predicate to check if a string contains only digits
        Predicate<String> isDigitsOnly = str -> str.matches("\\d+");

        // Example usage
        String input1 = "123456";
        String input2 = "abc123";

        System.out.println("Is '" + input1 + "' digits only? " + isDigitsOnly.test(input1));
        System.out.println("Is '" + input2 + "' digits only? " + isDigitsOnly.test(input2));
    }
}
