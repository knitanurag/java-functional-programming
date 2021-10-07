package designpattern;

import java.util.function.Consumer;

public class IteratorExample {
    public static void main(String[] args) {
        MyArrayList mylist = new MyArrayList(new Object[]{1,2,3,4,5});
        mylist.forEach(System.out::println);
    }
}

class MyArrayList{
    Object[] elements = new Object[5];

    public MyArrayList(Object[] elements) {
        this.elements = elements;
    }

    public void forEach(Consumer<Object> consumer){
        for(int i=0; i< elements.length; i++){
            consumer.accept(elements[i]);
        }
    }
}