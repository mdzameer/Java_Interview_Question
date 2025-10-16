package interveiwprep;

public class SwappingNumbers {
    public static void main(String[] args) {
        int a=5;
        int b=6;

        System.out.println("a:"+a+" b:"+b);
//        int temp;
//        temp = a;
//        a=b;
//        b=temp;
//        System.out.println("a:"+a+" b:"+b);

        //without third variable
        a=a+b; //a is a+b
        b=a-b; // b is a
        a=a-b; // a is b

        System.out.println("a:"+a+" b:"+b);
    }




}
