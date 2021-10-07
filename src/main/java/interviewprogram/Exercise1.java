package interviewprogram;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Exercise1 {
    public static void main(String[] args) {
        // Find max long
        //findMaxLong(new String[]{"77", "332", null, "10", "500", ""});
        //Take an array of strings and build the biggest number possible such
        // that "77", "332", null, "10", "500" returns 5003327710L. (15-30 min)
        //buildBiggestPossibleNumber(new String[]{"77", "332", null, "10", "500", ""});
        //Sort the characters in a string
        //sortStringCharacter("zabcxdef12");
       // Find sum of prime numbers
        //findSumPrimeNumber(new int[]{1, 4, 5, 5, 7, 9, 13, 21, 30, 7});
        //Parse string and extract values
        parseAndExtract("11 ,  34,,   45 ,,  88, 99||22");
    }
    private static void parseAndExtract(String s) {
            String [] values = s.split("(\\s+|,+|\\|+)+");
            String str = Arrays.stream(values)
                    .sorted(Comparator.naturalOrder())
                    .reduce("",(a,b)->a + b);
        System.out.println(str);
    }

    private static void findSumPrimeNumber(int[] ints) {
        IntPredicate primeFilter = i-> {
            int ceil = (int) Math.floor(Math.sqrt(i));
            for (int a = 3; a <= ceil; a += 2) {
                if (i % a == 0) return false;
            }
            return  true;
        };
        int sum = Arrays.stream(ints)
                .filter(i->! (i % 2 ==0 || i ==1 ))
                .filter(primeFilter)
                .reduce(0, Integer::sum);
        System.out.println(sum);
    }

    private static void sortStringCharacter(String str) {
        StringBuilder builder = new StringBuilder();
        str.chars().boxed()
                .sorted(Comparator.naturalOrder())
                .forEach(i -> builder.append((char) (i.byteValue())));
        System.out.println(builder);
    }

    private static void buildBiggestPossibleNumber(String[] strings) {
        String reduced = Arrays.stream(strings)
                .filter(s->s != null && !s.isBlank())
                .map(Long::parseLong)
                .sorted(Comparator.reverseOrder())
                .map(s->s + "")
                .reduce("",(a,b)->a + b);
        System.out.println(reduced);
    }

    private static void findMaxLong(String[] strings) {
        Arrays.stream(strings)
                .filter(s->s != null && !s.isBlank())
                .map(s-> Long.valueOf(s.trim()))
                .max((a,b)->a<b?-1:0).ifPresent(System.out::println);
    }
}
