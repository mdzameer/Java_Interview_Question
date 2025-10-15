package asgmnt1.oops;


interface Orderable {
    void placeOrder();
}

class Pizza implements Orderable {
    @Override
    public void placeOrder() {
        System.out.println("Pizza order placed.");
    }
}

class Burger implements Orderable {
    @Override
    public void placeOrder() {
        System.out.println("Burger order placed.");
    }
}

public class OrderableMain {
    public static void main(String[] args) {
        Orderable food1 = new Pizza();
        Orderable food2 = new Burger();

        food1.placeOrder();
        food2.placeOrder();
    }
}

