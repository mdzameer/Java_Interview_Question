package asgmnt3.parlelstrms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeFilter {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> primes = numbers.parallelStream()
                .filter(PrimeFilter::isPrime)
                .collect(Collectors.toList());

        System.out.println("Primes: " + primes);
    }

    static boolean isPrime(int n) {
        if (n <= 1) return false;
        return IntStream.rangeClosed(2, (int)Math.sqrt(n))
                .noneMatch(i -> n % i == 0);
    }
}
