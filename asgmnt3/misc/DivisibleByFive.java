package asgmnt3.misc;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DivisibleByFive {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 23, 45, 60, 77);

        List<Integer> divisibleBy5 = numbers.stream()
                .filter(n -> n % 5 == 0)
                .collect(Collectors.toList());

        System.out.println(divisibleBy5); // [10, 45, 60]
    }
}
