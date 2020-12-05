package functionalinterface.basic;

public class BasicGenericFunctionalInterfaceExample {

    public static void main(String[] args) {
        MyGenericInterface<Integer,String> fun = s-> s.length();
        System.out.println(fun.execute("Hello"));

    }

}


@FunctionalInterface
interface MyGenericInterface<R,T>{
    R execute(T t);
}