package asgmnt3.lambdaexpression;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumElements {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Optional<Integer> reduce = list.stream().reduce(Integer::sum);
        System.out.println("sum of all numbers is: "+reduce.get());
    }
}
