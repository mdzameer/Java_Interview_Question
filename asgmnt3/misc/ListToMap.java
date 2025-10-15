package asgmnt3.misc;

import java.util.*;
import java.util.stream.Collectors;

class Person {
    int id;
    String name;
    Person(int id, String name) { this.id = id; this.name = name; }
}

public class ListToMap {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person(1, "Alice"),
                new Person(2, "Bob")
        );

        Map<Integer, String> map = people.stream()
                .collect(Collectors.toMap(p -> p.id, p -> p.name));

        System.out.println(map);
    }
}
