package asgmnt3.streamops;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoiningExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Stream", "API");

        String result = words.stream()
                .collect(Collectors.joining(", "));

        System.out.println(result); // Java, Stream, API
    }
}
