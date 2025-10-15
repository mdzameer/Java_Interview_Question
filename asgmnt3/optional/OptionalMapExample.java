package asgmnt3.optional;

import java.util.Optional;

public class OptionalMapExample {
    public static void main(String[] args) {
        Optional<String> name = Optional.of("zameer");

        Optional<String> upperName = name.map(String::toUpperCase);

        upperName.ifPresent(System.out::println);
    }
}
