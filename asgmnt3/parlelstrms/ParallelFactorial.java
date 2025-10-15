package asgmnt3.parlelstrms;

import java.util.stream.IntStream;

public class ParallelFactorial {
    public static void main(String[] args) {
        int number = 10;

        long factorial = IntStream.rangeClosed(1, number)
                .parallel()
                .reduce(1, (a, b) -> a * b);

        System.out.println("Factorial of " + number + " is " + factorial);
    }
}
