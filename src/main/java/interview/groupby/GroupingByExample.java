package interview.groupby;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingByExample {

    public static void main(String[] args) {
        simpleOperationOnList();

    }

    private static void simpleOperationOnList() {
        List<String> items =
                Arrays.asList("apple", "apple", "banana",
                        "apple", "orange", "banana", "papaya");

        items.
                stream()
                .collect(Collectors.groupingBy(Function.identity()))
                .forEach((k,v)->{
                    System.out.println(k+":"+v);
                });
    }
}

class BlogPost {
    String title;
    String author;
    BlogPostType type;
    int likes;
}

enum BlogPostType {
    NEWS,
    REVIEW,
    GUIDE
}

class Tuple {
    BlogPostType type;
    String author;
}
