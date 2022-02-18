package interview;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

    public static void main(String[] args) {

        String keyValue = "a=b;b=c";
        Matcher keyValueMatcher = getMatcher("([^\\=\\s]+)\\=([^\\s]+)", keyValue.trim());
        if (keyValueMatcher.matches()) {
            String key = keyValueMatcher.group(1);
            String value = keyValueMatcher.group(2);
            System.out.println(key +" : "+value);
        }
    }

    private static Matcher getMatcher(String regex, String input) {
        Pattern periodPattern = Pattern.compile(regex);
        return periodPattern.matcher(input);
    }
}


