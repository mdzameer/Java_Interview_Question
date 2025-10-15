package asgmnt3.optional;

import java.util.Optional;

public class OptionalIsPresentExample {
    public static void main(String[] args) {
        Optional<String> name = Optional.of("Zameer");

        if (name.isPresent()) {
            System.out.println("Name is: " + name.get());
        } else {
            System.out.println("Name is not present.");
        }
    }
}
