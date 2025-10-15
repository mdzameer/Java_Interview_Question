package asgmnt3.functionalinterface;

import java.util.function.Function;

public class StringToUppercase {
    public static void main(String[] args) {
        // Function to convert a string to uppercase
        Function<String, String> toUpperCase = str -> str.toUpperCase();

        // Example usage
        String input = "zameer";
        String result = toUpperCase.apply(input);

        System.out.println("Uppercase: " + result);
    }
}
