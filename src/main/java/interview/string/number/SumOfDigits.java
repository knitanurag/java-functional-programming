package interview.string.number;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SumOfDigits {
    public static void main(String[] args) {
        sumOfDigitsUsingJava8(1234);
    }

    private static void sumOfDigitsUsingJava8(int n) {
        //first
        System.out.println(String.valueOf(n).chars().map(Character::getNumericValue).sum());
        //second
        System.out.println(Integer.toString(n).chars().boxed().mapToInt(c -> c - '0').sum());
    }
}
