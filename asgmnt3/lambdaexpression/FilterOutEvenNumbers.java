package asgmnt3.lambdaexpression;

import java.util.Arrays;
import java.util.List;

public class FilterOutEvenNumbers {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4,5,7,8,9,3,2,1);

        //getting odd numbers
        list.stream().filter(num -> num%2!=0).toList().forEach(System.out::println);
    }
}
