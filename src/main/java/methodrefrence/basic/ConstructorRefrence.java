package methodrefrence.basic;

import java.util.function.Function;

public class ConstructorRefrence {
    public static void main(String[] args) throws InterruptedException {
        Function<Runnable, Thread> threadGenerator = Thread::new;
        Runnable task1 = () -> System.out.println("executing task 1");
        Runnable task2 = () -> System.out.println("executing task 2");
        threadGenerator.apply(task1).start();
        threadGenerator.apply(task2).start();
        threadGenerator.apply(()-> System.out.println("executing task 3")).start();

    }
}
