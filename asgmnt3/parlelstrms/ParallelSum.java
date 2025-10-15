package asgmnt3.parlelstrms;

import java.util.List;
import java.util.stream.IntStream;

public class ParallelSum {
    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(1, 1_000_000)
                .parallel()
                .sum();

        System.out.println("Sum: " + sum);
    }
}
