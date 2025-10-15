package asgmntpractise;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        int first = 0, second = 1;
        for(int i=0; i<=10; i++){
            System.out.print(first+" ");

            int third = first+second;
            first=second;
            second=third;
            //added the comments

        }
    }
}
