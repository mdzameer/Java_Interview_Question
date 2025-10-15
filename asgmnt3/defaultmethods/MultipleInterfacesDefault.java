package asgmnt3.defaultmethods;

interface A {
    default void show() {
        System.out.println("Default from A");
    }
}

interface B {
    default void show() {
        System.out.println("Default from B");
    }
}

class C implements A, B {
    @Override
    public void show() {
        A.super.show(); // or B.super.show()
    }
}

public class MultipleInterfacesDefault {
    public static void main(String[] args) {
        new C().show();
    }
}
