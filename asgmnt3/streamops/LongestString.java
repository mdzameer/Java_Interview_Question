package asgmnt3.streamops;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestString {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("cat", "elephant", "tiger", "lion");

        String longest = words.stream()
                .max(Comparator.comparingInt(String::length))
                .orElse("");

        System.out.println(longest); // elephant
    }
}
