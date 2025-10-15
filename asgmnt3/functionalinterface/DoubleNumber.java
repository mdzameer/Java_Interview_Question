package asgmnt3.functionalinterface;

import java.util.function.UnaryOperator;

public class DoubleNumber {
    public static void main(String[] args) {
        // UnaryOperator to double a number
        UnaryOperator<Integer> doubler = num -> num * 2;

        // Example usage
        int input = 10;
        int result = doubler.apply(input);

        System.out.println("Double of " + input + " is: " + result);
    }
}
