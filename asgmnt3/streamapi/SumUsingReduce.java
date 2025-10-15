package asgmnt3.streamapi;

import java.util.Arrays;
import java.util.List;

public class SumUsingReduce {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40);

        int sum = numbers.stream()
                .reduce(0, Integer::sum);

        System.out.println("Sum: " + sum);
    }
}
