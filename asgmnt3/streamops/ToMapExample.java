package asgmnt3.streamops;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ToMapExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry");

        Map<String, Integer> wordLengthMap = words.stream()
                .collect(Collectors.toMap(word -> word, word -> word.length()));

        System.out.println(wordLengthMap);
    }
}
