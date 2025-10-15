package asgmnt3.lambdaexpression;


interface Adder{
    int add(int a,int b);
}
public class AddingTwoNumbers {
    public static void main(String[] args) {
        Adder addition = (a,b)->a+b;

        int result = addition.add(3, 4);

        System.out.println(result);
    }

}
