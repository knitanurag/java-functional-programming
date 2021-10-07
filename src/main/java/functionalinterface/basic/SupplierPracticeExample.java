package functionalinterface.basic;

import java.util.function.Supplier;

public class SupplierPracticeExample {
    public static void main(String[] args) {
        Supplier<String> stringSupplier = () -> new String("A String");

        System.out.println(stringSupplier.get());

        Supplier<Double> randomNumber = Math :: random ;

        System.out.println(randomNumber.get());
    }
}
