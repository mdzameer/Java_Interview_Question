package asgmnt1.oops;

// Superclass
class Vehicle {
    public void start() {
        System.out.println("Vehicle is starting.");
    }
}

// Subclass
class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting.");
    }
}

// Main class to test
public class VehiclePolymorphism {
    public static void main(String[] args) {
        Vehicle vehicle = new Car(); // Polymorphism in action
        vehicle.start(); // Calls Car's overridden method
    }
}
