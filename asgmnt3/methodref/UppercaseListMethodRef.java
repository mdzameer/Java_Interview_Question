package asgmnt3.methodref;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UppercaseListMethodRef {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("zameer", "jasvanthi", "dinesh");

        List<String> upperNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        upperNames.forEach(System.out::println);
    }
}
