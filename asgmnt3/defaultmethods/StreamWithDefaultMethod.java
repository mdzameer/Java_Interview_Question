package asgmnt3.defaultmethods;

import java.util.Arrays;
import java.util.List;

interface Processor {
    default String process(String input) {
        return input.toUpperCase();
    }
}

public class StreamWithDefaultMethod {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("zameer", "jasvanthi", "dinesh");

        Processor processor = new Processor() {}; // anonymous class

        names.stream()
                .map(processor::process)
                .forEach(System.out::println);
    }
}
