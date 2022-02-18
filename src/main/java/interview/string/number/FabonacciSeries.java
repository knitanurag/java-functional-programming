package interview.string.number;

public class FabonacciSeries {
    static int first = 0,result = 0, second = 1;
    public static void main(String[] args) {
        //createFabonacciSeries();
        createFabonacciSeriesUsingRecursiveWay();

    }

    private static void createFabonacciSeriesUsingRecursiveWay() {

        createFabonacci( 9);
    }

    private static void createFabonacci(int n ) {

        if (n > 0){
            result = first + second;
            System.out.println(result);
            first = second;
            second = result;
            createFabonacci(n-1);
        }
        return ;
    }

    private static void createFabonacciSeries() {
        System.out.println(first);
        System.out.println(second);
        int result = 0;
        for(int i = 0; i < 10; i++){
            result = first + second;
            System.out.println(result);
            first = second;
            second = result;
        }

    }
}
