package asgmnt3.defaultmethods;

@FunctionalInterface
interface Calculator {
    int operate(int a, int b);

    default void show() {
        System.out.println("Using Calculator interface");
    }
}

public class LambdaWithDefault {
    public static void main(String[] args) {
        Calculator add = (a, b) -> a + b;
        System.out.println("Sum: " + add.operate(5, 3));
        add.show(); // default method
    }
}
