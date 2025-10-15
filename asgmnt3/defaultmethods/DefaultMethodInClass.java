package asgmnt3.defaultmethods;

interface Vehicle {
    default void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car implements Vehicle {}

public class DefaultMethodInClass {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
    }
}
