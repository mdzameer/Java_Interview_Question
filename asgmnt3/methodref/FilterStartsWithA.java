package asgmnt3.methodref;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStartsWithA {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Anita", "Zameer");

        List<String> filtered = names.stream()
                .filter("A"::equalsIgnoreCase)
                .collect(Collectors.toList());

        System.out.println("Names starting with A: " + filtered);
    }
}
