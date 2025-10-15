package asgmnt1;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class JavaQuestions {

    public static void main(String[] args) {
//        boolean output = isPalindrome("madam");
//        int output = vowelsCount("zameer");
//        int output = consonentsCount("javas");
//        String output = reverseString("java");
//        boolean output = isAnagrams("silent", "listen");
//        String output = removeSpaces("  za m         ee r");

        int output = strLength("zameer123");
        System.out.println(output);
    }


    public static boolean isPalindrome(String input){
        StringBuilder builder = new StringBuilder(input);
        String reverse = builder.reverse().toString();
        if (input.equals(reverse))
            return true;
        return false;
    }

    public static int vowelsCount(String input){
        int count=0;
        for (char ch: input.toCharArray()){
            if("aeiou".indexOf(ch)!=-1)
                count++;
        }        return count;
    }

    public static int consonentsCount(String input){
        int count=0;
        for (char ch: input.toCharArray()){
            if("aeiou".indexOf(ch)==-1)
                count++;
        }        return count;
    }

    public static String reverseString(String input){
//        return new StringBuilder(input).reverse().toString();
//        String reversed = "";
//        for(int i=input.length()-1 ; i>=0; i--){
//            reversed= reversed+ input.charAt(i);
//        }
//        return reversed;

       return IntStream.rangeClosed(1,input.length())
                .mapToObj(i-> input.substring(input.length()-i,input.length()-i+1))
                .collect(Collectors.joining());
    }

    public static boolean isAnagrams(String s1, String s2){
        String str1 = s1.replaceAll("\\s", "").toLowerCase();
        String str2 = s2.replaceAll("\\s", "").toLowerCase();

        if (str1.length()!=str2.length())
            return false;
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static String removeSpaces(String input){
        return input.replaceAll("e","E");
    }

    public static int strLength(String input){
        int count = 0;
        char[] charArray = input.toCharArray();
        for (char ch: charArray)
            count++;
        return count;
    }
}
