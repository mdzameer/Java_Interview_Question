package asgmnt3.parlelstrms;

import java.util.Arrays;
import java.util.OptionalDouble;

public class ParallelAverage {
    public static void main(String[] args) {
        OptionalDouble average = Arrays.asList(10, 20, 30, 40, 50)
                .parallelStream()
                .mapToInt(Integer::intValue)
                .average();

        average.ifPresent(avg -> System.out.println("Average: " + avg));
    }
}

