package asgmnt3.optional;

import java.util.Optional;

public class OptionalEmptyExample {
    public static void main(String[] args) {
        Optional<String> empty = Optional.empty();

        System.out.println("Is value present? " + empty.isPresent());
    }
}
