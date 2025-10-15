package asgmnt3.lambdaexpression;

public class ImplementingRunnableIntrfce {
    public static void main(String[] args) {
        Runnable task = () -> {
            System.out.println("task is running");
        };
        Thread thread = new Thread(task);
        thread.start();
    }
}
