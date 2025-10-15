package asgmnt3.functionalinterface;

import java.util.function.Function;

public class StringEmptyCheck {
    public static void main(String[] args) {
        // Function to check if a string is empty
        Function<String, Boolean> isEmpty = str -> str.isEmpty();

        // Example usage
        String input1 = "";
        String input2 = "Zameer";

        System.out.println("Is input1 empty? " + isEmpty.apply(input1));
        System.out.println("Is input2 empty? " + isEmpty.apply(input2));
    }
}
