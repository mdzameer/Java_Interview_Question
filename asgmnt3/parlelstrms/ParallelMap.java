package asgmnt3.parlelstrms;

import java.util.Arrays;
import java.util.List;

public class ParallelMap {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        names.parallelStream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
