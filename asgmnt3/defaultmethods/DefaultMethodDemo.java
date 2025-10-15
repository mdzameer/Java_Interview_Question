package asgmnt3.defaultmethods;

interface Greetable {
    default void greet() {
        System.out.println("Hello from default method!");
    }
}

public class DefaultMethodDemo {
    public static void main(String[] args) {
        Greetable g = new Greetable() {}; // Anonymous class
        g.greet();
    }
}
