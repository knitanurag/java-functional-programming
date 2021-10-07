package composition.closure;

public class ClosureExample {
    public static void main(String[] args) {
        int val = 112;
       /*
         Closure is a function that refers to free variables in it's lexical scope.
        */
        Task lambda = ()-> System.out.println("Hey this is anurag"+val);
        lambda.doTask();
    }
}

@FunctionalInterface
interface Task{
    void doTask();
}