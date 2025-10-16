package interveiwprep;

public class Fibonacci {
    public static void main(String[] args) {
      //WAP to print the fibonacci series
        int first = 0,second = 1;
        for (int i=0; i<=10;i++){
            System.out.print(first+" ");
            int third = first+second;
            first=second;
            second=third;
        }
    }
}
