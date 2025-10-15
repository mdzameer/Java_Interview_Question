package asgmnt3.methodref;

import java.util.Arrays;
import java.util.List;

public class ForEachMethodRef {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        numbers.forEach(System.out::println);
    }
}
