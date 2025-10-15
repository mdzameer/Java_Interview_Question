package asgmnt3.functionalinterface;

@FunctionalInterface
interface MessagePrinter {
    void printMessage(String message);
}

public class CustomFunctionalInterfaceExample {
    public static void main(String[] args) {
        // Lambda expression implementing MessagePrinter
        MessagePrinter printer = msg -> System.out.println("Message: " + msg);

        // Example usage
        printer.printMessage("Hello from Lambda!");
    }
}
