package asgmnt3.optional;

import java.util.Optional;

public class OptionalFilterExample {
    public static void main(String[] args) {
        Optional<String> name = Optional.of("Zameer");

        name.filter(n -> n.startsWith("Z"))
                .ifPresent(n -> System.out.println("Filtered name: " + n));
    }
}
