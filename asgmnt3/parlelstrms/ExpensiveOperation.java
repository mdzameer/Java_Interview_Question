package asgmnt3.parlelstrms;

import java.util.Arrays;
import java.util.List;

public class ExpensiveOperation {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        numbers.parallelStream()
                .map(n -> {
                    try { Thread.sleep(1000); } catch (InterruptedException e) {}
                    return n * n;
                })
                .forEach(System.out::println);
    }
}