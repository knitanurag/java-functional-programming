package interview.string.number;

import java.util.stream.IntStream;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(IntStream.rangeClosed(1, 5).reduce(1, (x, y) -> x * y));
    }
}
