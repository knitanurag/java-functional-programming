package highorderfunction.example;

public class HOFunctionExample {
    public static void main(String[] args) {
        System.out.println(createFactory(() -> Math.random()*100, e -> e.intValue()).create());

    }

    private static <T,R> IFactory<R> createFactory(Producer<T> producer, Configurator<T,R> configurator) {
        return ()-> configurator.configure(producer.produce());
    }
}

@FunctionalInterface
interface Producer<T>{
    T produce();
}

@FunctionalInterface
interface Configurator<T,R>{
    R configure(T t);
}

@FunctionalInterface
interface  IFactory<T>{
    T create();
}
