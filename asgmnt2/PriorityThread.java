package asgmnt2;

public class PriorityThread {
    public static void main(String[] args) {
        MyThread4 thread = new MyThread4();
        thread.setPriority(Thread.MAX_PRIORITY); // Priority 10
        thread.start();
    }
}

class MyThread4 extends Thread {
    public void run() {
        System.out.println("Thread is running with priority: " + Thread.currentThread().getPriority());
    }
}
