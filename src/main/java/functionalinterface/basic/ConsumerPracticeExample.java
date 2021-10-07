package functionalinterface.basic;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerPracticeExample {
    public static void main(String[] args) {
        List<Integer> list = List.of(34,67,8,23,67,89,90);
        Consumer<Integer> consumer = System.out :: println;
        printElements(list,consumer);

    }
    private static <T> void printElements(List<T> list, Consumer<T> consumer) {
        list.stream().forEach(consumer);
    }
}
