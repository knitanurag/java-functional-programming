package interviewprogram;

import java.util.LinkedHashMap;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Set1 {

    public static void main(String[] args) {
        String input = "Java Hungry Blog Alive is Awesome";
        //1. Given a String, find the first repeated character in it using Stream functions
        findFirstRepeatedCharacter(input);

    }

    private static void findFirstRepeatedCharacter(String input) {
      Optional<Character> result =  input.chars()
                .mapToObj(s->Character.toLowerCase((char) s))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entrySet-> entrySet.getValue() > 1L)
                .map(entrySet->entrySet.getKey())
                .findFirst();
        System.out.println(result.isPresent()?result.get():"no repeat");
    }
}
