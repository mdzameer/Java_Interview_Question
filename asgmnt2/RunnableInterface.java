package asgmnt2;

public class RunnableInterface {
    public static void main(String[] args) {
        MyThread2 thread2 = new MyThread2();
        Thread thread = new Thread(thread2);
        thread.start();
    }

}

class MyThread2 implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread is running");
    }
}
