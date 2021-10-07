package tailcalloptimization;

public class TCOExample {
    public static void main(String[] args) {
        System.out.println(reFact(5));
        tailCallOptimizationExample();
    }

    private static void tailCallOptimizationExample() {
        int a = 4, b=1;
        System.out.println(tco(a, b));
    }

    private static int tco(int a, int b) {
        if(a <= 1) return b;
        return tco(a-1, b * a);
    }

    private static long reFact(int n) {
        if(n == 1) return 1;
        return    n *  reFact(n-1);

    }
}
