package optional;

import java.util.Optional;

public class OptionalOperationExample {
    public static void main(String[] args) {
        //map
        Optional<String> value = Optional.of("value");
        System.out.println(value.map(val -> "replaced").get());
        //filter
        System.out.println(value.filter((e) -> e.equals("value")));
        //flatmap
        System.out.println(value.flatMap((val) -> Optional.of(val)));
        //IF Present
        value.ifPresent(System.out :: println);
        //IF Present orElse
        value.ifPresentOrElse(System.out :: println,()-> System.out.println("Empty value"));
        //or
        System.out.println(value.or(() -> Optional.of("new value")));
        System.out.println(Optional.empty().or(() -> Optional.of("new value")));
        //equals
        System.out.println(value.equals(Optional.of("value")));

    }
}
