package asgmnt3.optional;

import java.util.Optional;

public class OptionalAvoidNPE {
    public static void main(String[] args) {
        String value = null;

        Optional<String> optional = Optional.ofNullable(value);

        System.out.println("Value: " + optional.orElse("Default Value"));
    }
}
