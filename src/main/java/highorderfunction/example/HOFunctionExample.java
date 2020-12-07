package highorderfunction.example;

public class HOFunctionExample {
    public static void main(String[] args) {
        System.out.println(createFactory(() -> Math.random()*100, e -> e.intValue()).create());

    }

    private static <T,R> IFactory<R> createFactory(Producer<T> producer, Configurator<T,R> configurator) {

        return ()->{
            return configurator.configure(producer.produce());
        };
    }
}

interface Producer<T>{
    T produce();
}

interface Configurator<T,R>{
    R configure(T t);
}

interface  IFactory<T>{
    T create();
}
