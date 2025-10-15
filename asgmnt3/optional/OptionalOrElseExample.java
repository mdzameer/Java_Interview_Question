package asgmnt3.optional;

import java.util.Optional;

public class OptionalOrElseExample {
    public static void main(String[] args) {
        String name = null;

        Optional<String> optionalName = Optional.ofNullable(name);

        String result = optionalName.orElse("Guest");

        System.out.println("Hello, " + result);
    }
}
