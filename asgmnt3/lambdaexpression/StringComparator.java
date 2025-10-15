package asgmnt3.lambdaexpression;

interface StringCompareInterface{
    boolean compare(String str1, String str2);

}

public class StringComparator {
    public static void main(String[] args) {
        StringCompareInterface comparator = (str1, str2)-> str1.equals(str2);

        String str1 = "Zameer";
        String str2 = "Zameer";
        boolean isEqual = comparator.compare(str1, str2);
        System.out.println("are the equal string:"+isEqual);
    }
}
