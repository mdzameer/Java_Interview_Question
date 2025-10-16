package interveiwprep;

public class ReverseString {
    public static void main(String[] args) {
        String input = "zameer";
        char[] charArray = input.toCharArray();
        for (int i=0; i<charArray.length/2;i++){
            char temp = charArray[i];
            charArray[i]=charArray[charArray.length-1-i];
            charArray[charArray.length-1-i]=temp;
        }
        String newStr = new String(charArray);
        System.out.println("reversed string:"+newStr);
    }
}
