package currying;

import java.util.function.Function;
import java.util.function.IntFunction;

public class CurryingExample {
    public static void main(String[] args) {
        Function<Integer, Function<Integer,Integer>> function1 = (u)->{
            return (v)->u+v;
        };
        System.out.println(function1.apply(10).apply(9));

        currying3InputExample();
    }

    private static void currying3InputExample() {
        Function<Integer,Function<Integer,Function<Integer,Integer>>> exampleInput =
                u-> v -> w -> u+v+w;
        Function<Integer,Function<Integer,Integer>> test = exampleInput.apply(1);
        Function<Integer,Integer> test1 = test.apply(2);
        System.out.println(test1.apply(3));

        //Doing above using int function
        IntFunction<IntFunction<IntFunction<Integer>>> input = value -> value1 -> value2 -> value + value1
                + value2;
        System.out.println(input.apply(2).apply(3).apply(5));    }
}
