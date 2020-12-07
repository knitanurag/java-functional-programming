package composition;

public class CompositionExample {
    public static void main(String[] args) {
        Function<Square,Integer> function1 = s->s.getArea();
        Function<Integer,Double> function2 = area->Math.sqrt(area);
        Function<Square,Double> function3 =  function2.compose(function1);
        Square square  = new Square();
        square.setArea(100);
        System.out.println(function3.apply(square));
    }
}

interface Function<T,R>{
    R apply(T t);

    default <V> Function<V,R> compose(Function<V,T> before){

        return (V v)->this.apply(before.apply(v));
    };
}

class Square{
    int Area;


    public int getArea() {
        return Area;
    }

    public void setArea(int area) {
        Area = area;
    }
}