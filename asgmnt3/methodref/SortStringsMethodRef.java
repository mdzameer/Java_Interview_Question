package asgmnt3.methodref;

import java.util.Arrays;
import java.util.List;

public class SortStringsMethodRef {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Zameer", "Jasvanthi", "Dinesh");

        names.sort(String::compareToIgnoreCase);

        names.forEach(System.out::println);
    }
}
