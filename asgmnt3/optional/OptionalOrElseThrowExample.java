package asgmnt3.optional;

import java.util.Optional;

public class OptionalOrElseThrowExample {
    public static void main(String[] args) {
        Optional<String> value = Optional.empty();

        String result = value.orElseThrow(() -> new IllegalArgumentException("Value is missing"));

        System.out.println(result);
    }
}
