package optional;

import java.util.IllformedLocaleException;
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> optionalValue1 = Optional.of("Anurag");
        Optional<String> optionalValue2 = Optional.empty();

        Optional<String> optionalValue3 =  Optional.ofNullable("Anurag");
        Optional<String> optionalValue4 = Optional.ofNullable(null);

        //to get
        optionalValue1.get();// throe no such element exception in case of empty value.

        //to get with default value
        optionalValue1.orElse("");

        //to get and return a supplier
        optionalValue2.orElseGet(()->"");

        //return with exception
        optionalValue1.orElseThrow(()->new IllformedLocaleException());
        //Introduced in java 10
        optionalValue1.orElseThrow();//throw no such element exception
    }
}
