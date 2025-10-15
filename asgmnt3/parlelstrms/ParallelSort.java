package asgmnt3.parlelstrms;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelSort {
    public static void main(String[] args) {
        List<Integer> numbers = IntStream.rangeClosed(1, 100_000)
                .map(i -> 100_000 - i)
                .boxed()
                .collect(Collectors.toList());

        List<Integer> sorted = numbers.parallelStream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("First 10 sorted numbers: " + sorted.subList(0, 10));
    }
}
