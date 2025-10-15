package asgmnt3.misc;

import java.util.Arrays;

public class StartsWithCheck {
    public static void main(String[] args) {
        boolean startsWithJ = Arrays.asList("Java", "Python", "JavaScript")
                .stream()
                .anyMatch(s -> s.startsWith("J"));

        System.out.println("Any string starts with 'J'? " + startsWithJ);
    }
}
