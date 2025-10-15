package asgmnt1.oops;

abstract class Animal {
    abstract void makeSound();
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Barking");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meowing");
    }
}

public class AnimalLoader {
    public static void main(String[] args) {

        Animal animal1 = new Dog();
        animal1.makeSound();
        Animal animal2 = new Cat();
        animal2.makeSound();
    }
}
