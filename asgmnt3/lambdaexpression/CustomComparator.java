package asgmnt3.lambdaexpression;

import java.util.Arrays;
import java.util.List;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "name:"+name+", "+"age:"+age;
    }
}

public class CustomComparator {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(new Person("zameer",31),
                new Person("sameer",22),new Person("zaheer", 29));

        personList.sort((p1, p2)-> Integer.compare(p1.age,p2.age));

        personList.forEach(System.out::println);
    }
}
