package asgmnt2;

public class ThreadClass {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}

class MyThread extends Thread{
    public void run(){
        System.out.println("Thread is running");
    }
}
