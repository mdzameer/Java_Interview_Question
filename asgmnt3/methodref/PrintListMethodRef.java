package asgmnt3.methodref;

import java.util.Arrays;
import java.util.List;

public class PrintListMethodRef {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("Apple", "Banana", "Cherry");

        items.forEach(System.out::println);
    }
}
