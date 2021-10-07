package chaining;

import java.util.Objects;

public class ChainingExample {
    public static void main(String[] args) {
        Consumer<String> printConsumer1 = (s)-> System.out.println(s);
        Consumer<String> printConsumer2 = (s)-> System.out.println(s);
        printConsumer1.accept("Hello");
        printConsumer2.accept("Anurag");

        Consumer<String> printConsumer3 = (s)->{
            printConsumer1.accept(s);
            printConsumer2.accept(s);
        };
        printConsumer3.accept("check");
        Consumer<String> printConsumer4 = printConsumer1.thenAccept(printConsumer2);
        printConsumer4.accept("Hello->");

    }

}


interface Consumer<T>{
    void accept(T t);

    default Consumer<T> thenAccept(Consumer<T> next){
        return (T t)->{
            this.accept(t);
            next.accept(t);
        };
    };

}