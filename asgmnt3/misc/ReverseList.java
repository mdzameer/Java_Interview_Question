package asgmnt3.misc;

import java.util.*;
import java.util.stream.*;

public class ReverseList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C", "D");

        List<String> reversed = IntStream.range(0, list.size())
                .mapToObj(i -> list.get(list.size() - 1 - i))
                .collect(Collectors.toList());

        System.out.println(reversed); // [D, C, B, A]
    }
}
