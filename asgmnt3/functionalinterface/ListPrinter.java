package asgmnt3.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ListPrinter {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Zameer", "Jasvanthi", "Dinesh");

        // Consumer to print each element
        Consumer<String> printName = name -> System.out.println(name);

        // Apply consumer to each element
        names.forEach(printName);
    }
}

