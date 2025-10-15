package asgmnt3.methodref;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DoubleValuesMethodRef {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);

        List<Double> doubles = numbers.stream()
                .map(Integer::doubleValue)
                .collect(Collectors.toList());

        doubles.forEach(System.out::println);
    }
}
