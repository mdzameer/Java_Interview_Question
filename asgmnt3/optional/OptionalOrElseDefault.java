package asgmnt3.optional;

import java.util.Optional;

public class OptionalOrElseDefault {
    public static void main(String[] args) {
        Optional<String> value = Optional.empty();

        String result = value.orElse("Default Value");

        System.out.println("Result: " + result);
    }
}
