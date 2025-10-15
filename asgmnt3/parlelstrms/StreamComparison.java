package asgmnt3.parlelstrms;

import java.util.Arrays;
import java.util.List;

public class StreamComparison {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        System.out.println("Sequential Stream:");
        names.stream().forEach(System.out::println);

        System.out.println("\nParallel Stream:");
        names.parallelStream().forEach(System.out::println);
    }
}
