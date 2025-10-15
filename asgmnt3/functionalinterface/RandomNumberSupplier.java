package asgmnt3.functionalinterface;

import java.util.function.Supplier;
import java.util.Random;

public class RandomNumberSupplier {
    public static void main(String[] args) {
        int min = 10;
        int max = 50;

        // Supplier to generate a random number in the range [min, max]
        Supplier<Integer> randomInRange = () -> new Random().nextInt(max - min + 1) + min;

        // Example usage
        System.out.println("Random number between " + min + " and " + max + ": " + randomInRange.get());
    }
}
