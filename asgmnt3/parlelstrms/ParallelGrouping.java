package asgmnt3.parlelstrms;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ParallelGrouping {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("one", "two", "three", "four", "five");

        Map<Integer, List<String>> grouped = words.parallelStream()
                .collect(Collectors.groupingByConcurrent(String::length));

        System.out.println(grouped);
    }
}
