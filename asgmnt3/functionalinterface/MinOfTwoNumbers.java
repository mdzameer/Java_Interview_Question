package asgmnt3.functionalinterface;

import java.util.function.BiFunction;

public class MinOfTwoNumbers {
    public static void main(String[] args) {
        // BiFunction to find the minimum of two integers
        BiFunction<Integer, Integer, Integer> findMin = (a, b) -> a < b ? a : b;

        // Example usage
        int num1 = 42;
        int num2 = 27;

        int min = findMin.apply(num1, num2);
        System.out.println("Minimum: " + min);
    }
}
