package asgmnt3.lambdaexpression;

interface StringReverser{
    String reverse(String str);
}
public class StringReversRunner {
    public static void main(String[] args) {

        StringReverser reverser = (str)-> new StringBuilder(str).reverse().toString();
        String input = "zameer";
        String reversedString = reverser.reverse(input);
        System.out.println("Reversed String is: "+reversedString);

    }
}
