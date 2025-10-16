package asgmntpractise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ScndHghstNum {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,6,7,4,3,5,8);
        Optional<Integer> first = list.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

        System.out.println(first.get());
    }
}
