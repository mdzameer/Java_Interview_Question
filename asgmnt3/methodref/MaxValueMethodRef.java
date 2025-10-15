package asgmnt3.methodref;

import java.util.Arrays;
import java.util.List;

public class MaxValueMethodRef {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 25, 5, 40);

        int max = numbers.stream()
                .max(Integer::compareTo)
                .orElseThrow();

        System.out.println("Max value: " + max);
    }
}
