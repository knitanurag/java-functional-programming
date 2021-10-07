package functionalinterface.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicatePracticeExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Basics");
        list.add("");
        list.add("Strong");
        list.add("");
        list.add("BasicsStrong");

        //passing the string list and predicate
       /* Predicate<String> emptyCheck = s->!s.isEmpty();
        filterList(list,emptyCheck);
        list.stream().forEach(System.out::println);*/

        //passing integer list and predicate
        List<Integer> intList = List.of(1,4,6,7,8);
        Predicate<Integer> integerFilter = e -> e % 2 == 0;
        intList = filterList(intList, integerFilter);
        intList.stream().forEach(System.out::println);



    }

    private static <T> List<T> filterList(List<T> list, Predicate<T> predicate){
        return list.stream().filter(predicate).collect(Collectors.toList());

    }
}
