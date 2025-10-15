package asgmnt3.misc;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNamesByLength {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Sam", "Jonathan", "Amy", "Robert");

        List<String> filtered = names.stream()
                .filter(name -> name.length() > 4)
                .collect(Collectors.toList());

        System.out.println(filtered); // [Jonathan, Robert]
    }
}
