package asgmnt3.methodref;

import java.util.function.Supplier;

class Person {
    String name;

    Person() {
        this.name = "Default Name";
    }

    @Override
    public String toString() {
        return name;
    }
}

public class ConstructorReference {
    public static void main(String[] args) {
        Supplier<Person> personSupplier = Person::new;

        Person person = personSupplier.get();
        System.out.println("Created: " + person);
    }
}
