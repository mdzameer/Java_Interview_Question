package asgmnt3.lambdaexpression;

import java.util.Arrays;
import java.util.List;

public class MultiplyElements {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4);

        Integer product = list.stream().reduce(1, (a, b) -> a * b);
        System.out.println("product of all eletments is: "+product);
    }
}
