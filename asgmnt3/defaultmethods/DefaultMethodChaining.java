package asgmnt3.defaultmethods;

interface Chainable {
    default Chainable stepOne() {
        System.out.println("Step One");
        return this;
    }

    default Chainable stepTwo() {
        System.out.println("Step Two");
        return this;
    }

    default void finish() {
        System.out.println("Finished!");
    }
}

class Workflow implements Chainable {}

public class DefaultMethodChaining {
    public static void main(String[] args) {
        new Workflow().stepOne().stepTwo().finish();
    }
}
