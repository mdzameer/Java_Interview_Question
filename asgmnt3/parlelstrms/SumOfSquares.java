package asgmnt3.parlelstrms;

import java.util.Arrays;

public class SumOfSquares {
    public static void main(String[] args) {
        int sum = Arrays.asList(1, 2, 3, 4, 5)
                .parallelStream()
                .mapToInt(n -> n * n)
                .sum();

        System.out.println("Sum of squares: " + sum);
    }
}
