package asgmnt3.defaultmethods;

interface Interface1 {
    default void display() {
        System.out.println("Display from Interface1");
    }
}

interface Interface2 {
    default void display() {
        System.out.println("Display from Interface2");
    }
}

class ConflictClass implements Interface1, Interface2 {
    @Override
    public void display() {
        Interface1.super.display(); // Resolving conflict
    }
}

public class DefaultMethodConflict {
    public static void main(String[] args) {
        new ConflictClass().display();
    }
}
