package asgmnt2;

public class ThreadGetName {

    public static void main(String[] args) {
        MyThread7 thread = new MyThread7();
        thread.start();
    }
}

class MyThread7 extends Thread{
    public void run(){
        System.out.println("Thread is running with name: "+ Thread.currentThread().getName());
    }
}
