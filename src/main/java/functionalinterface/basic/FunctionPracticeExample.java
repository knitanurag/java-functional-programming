package functionalinterface.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionPracticeExample {
    public static void main(String[] args) {
        List<String> list = List.of("Kit", "Kat", "Shake");

        Function<String, Integer> function = String :: length ;
        System.out.println(map(list,function));
    }
    private static <T, R> List<R> map(List<T> list, Function<T, R> function) {


        List<R> newList = new ArrayList<>();

        for (T e : list) {

            newList.add(function.apply(e));

        }

        return newList;
    }
}
