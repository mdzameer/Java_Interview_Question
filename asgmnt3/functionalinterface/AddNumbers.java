package asgmnt3.functionalinterface;

import java.util.function.BinaryOperator;

public class AddNumbers {
    public static void main(String[] args) {
        // BinaryOperator to add two integers
        BinaryOperator<Integer> add = (a, b) -> a + b;

        // Example usage
        int num1 = 15;
        int num2 = 25;
        int result = add.apply(num1, num2);

        System.out.println("Sum: " + result);
    }
}
