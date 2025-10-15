package asgmnt2;

public class RunStartMethod {

    public static void main(String[] args) {
        MyThread3 thread = new MyThread3();

        System.out.println("Before setting custom name");
        thread.run();
        thread.setName("CustomThread");
        thread.start();
    }
}

class MyThread3 extends Thread {

    public void run() {
        System.out.println("Running in thread: " + Thread.currentThread().getName());
    }
}


