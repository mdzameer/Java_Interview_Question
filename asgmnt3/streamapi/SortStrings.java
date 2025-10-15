package asgmnt3.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortStrings {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Zameer", "Jasvanthi", "Dinesh");

        List<String> sorted = names.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Sorted names: " + sorted);
    }
}

