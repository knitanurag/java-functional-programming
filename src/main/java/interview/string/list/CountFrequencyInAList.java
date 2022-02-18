package interview.string.list;

import java.util.*;
import java.util.stream.Collectors;

public class CountFrequencyInAList {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("B", "A", "A", "C", "B", "A");
        Set<String> distinct = new HashSet<>(str);
        for (String s : distinct) {
            System.out.println(s+ " : "+Collections.frequency(str,s));
        }

    }


}
