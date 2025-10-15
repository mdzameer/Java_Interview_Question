package asgmnt3.streamapi;

import java.util.Arrays;
import java.util.List;

public class CountGreaterThanTen {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 12, 18, 7, 3, 25);

        long count = numbers.stream()
                .filter(n -> n > 10)
                .count();

        System.out.println("Count of numbers > 10: " + count);
    }
}
