package asgmnt2;

public class ThreadIsAlive {

    public static void main(String[] args) {
        MyThread5 thread = new MyThread5();

        System.out.println("Is thread alive before start? " + thread.isAlive());

        thread.start();

        System.out.println("Is thread alive after start? " + thread.isAlive());

        try {
            thread.join(); // Wait for thread to finish
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        System.out.println("Is thread alive after completion? " + thread.isAlive());
    }
}

class MyThread5 extends Thread {
    public void run() {
        System.out.println("Thread is running...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}
