package asgmnt2;

public class ThreadId {
    public static void main(String[] args) {
        MyThread6 thread = new MyThread6();
        thread.start();
    }
}

class MyThread6 extends Thread {
    public void run() {
        System.out.println("Thread is running...");
        System.out.println("Thread ID: " + Thread.currentThread().getId());
    }
}
