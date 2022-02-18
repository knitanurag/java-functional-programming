package interview.string;

import java.util.Arrays;

public class StringReverse {

    public static void main(String[] args) {
        String originalString="abcdef";
        //reverse string without string buffer
        //reverseStringWithoutStringBuffer(originalString);
        reverseStringUsingStringBuffer(originalString);
    }

    private static void reverseStringUsingStringBuffer(String originalString) {
        StringBuffer buffer = new StringBuffer(originalString);
        System.out.println(buffer.reverse());
    }

    /**
     * complexity O(n/2)
     * @param str string to be reversed.
     */
    private static void reverseStringWithoutStringBuffer(String str) {
        char[] charArray = str.toCharArray();
        for (int i = 0,j=charArray.length - 1; i <charArray.length/2;i++,j--){
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
        }
        System.out.println("charArray.toString() = " + Arrays.toString(charArray));

    }
}
