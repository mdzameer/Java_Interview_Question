package asgmnt3.streamops;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectToSet {
    public static void main(String[] args) {
        Set<String> set = Arrays.asList("apple", "banana", "apple", "orange")
                .stream()
                .collect(Collectors.toSet());

        System.out.println(set); // [banana, orange, apple]
    }
}
