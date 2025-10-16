package interveiwprep;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashsetValues {

    public static void main(String[] args) {

        //WAP to print the has
        HashSet<String> names = new HashSet<>();

        names.add("zameer");
        names.add("sameer");
        names.add("ajay");
        names.add("zameer");  //duplicate
        names.add("anil");
        names.add("ajay");  //duplicate

        for (String name : names) {
            System.out.println(name);

        }
        System.out.println("============");
        LinkedHashSet<String> OrderdNames = new LinkedHashSet<>();
        OrderdNames.add("zameer");
        OrderdNames.add("sameer");
        OrderdNames.add("ajay");
        OrderdNames.add("zameer");  //duplicate
        OrderdNames.add("anil");
        OrderdNames.add("ajay");  //duplicate

        for (String name : OrderdNames) {
            System.out.println(name);

        }


    }
}
