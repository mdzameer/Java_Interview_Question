package asgmnt3.defaultmethods;

interface Printer {
    default void print() {
        System.out.println("Printing from default method...");
    }
}

class CustomPrinter implements Printer {
    @Override
    public void print() {
        System.out.println("Printing from overridden method!");
    }
}

public class OverrideDefaultMethod {
    public static void main(String[] args) {
        new CustomPrinter().print();
    }
}
