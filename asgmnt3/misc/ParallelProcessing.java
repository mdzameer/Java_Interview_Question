package asgmnt3.misc;

import java.util.stream.IntStream;

public class ParallelProcessing {
    public static void main(String[] args) {
        long count = IntStream.rangeClosed(1, 1_000_000)
                .parallel()
                .filter(n -> n % 2 == 0)
                .count();

        System.out.println("Count of even numbers: " + count);
    }
}
