package asgmnt3.lambdaexpression;

import java.util.Arrays;
import java.util.List;

public class SortingIntegers {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4,7,3,2,4,8);
        list.stream().sorted().toList().forEach(System.out::println);
    }
}
