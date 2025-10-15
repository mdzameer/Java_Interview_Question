package asgmnt3.optional;

import java.util.Optional;

public class OptionalIfPresentExample {
    public static void main(String[] args) {
        Optional<String> message = Optional.of("Hello, Zameer!");

        message.ifPresent(System.out::println);
    }
}
