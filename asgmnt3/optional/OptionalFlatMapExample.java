package asgmnt3.optional;

import java.util.Optional;

public class OptionalFlatMapExample {
    public static void main(String[] args) {
        Optional<String> firstName = Optional.of("Zameer");
        Optional<String> lastName = Optional.of("Mohammed");

        Optional<String> fullName = firstName.flatMap(fn ->
                lastName.map(ln -> fn + " " + ln)
        );

        fullName.ifPresent(name -> System.out.println("Full Name: " + name));
    }
}
