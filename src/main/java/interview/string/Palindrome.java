package interview.string;

import java.util.stream.IntStream;

public class Palindrome {
    public static void main(String[] args) {
        String s = "abba";
        System.out.println(checkUsingStringBuffer(s));
        System.out.println(checkUsingStream(s));
    }

    private static boolean checkUsingStream(String s) {
        return IntStream.range(0,s.length())
                .noneMatch(i->s.charAt(i) != s.charAt(s.length()-i-1));
    }

    private static boolean checkUsingStringBuffer(String s) {
        StringBuilder builder = new StringBuilder(s);
        String reversedString = builder.reverse().toString();
        return reversedString.equals(builder.toString());
    }
}
