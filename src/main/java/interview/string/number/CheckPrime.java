package interview.string.number;

public class CheckPrime {
    public static void main(String[] args) {
        checkPrime(7);
    }

    private static void checkPrime(int i) {

        usingRoot(i);

        usingHalf(i);
    }

    private static boolean usingHalf(int n) {
        for(int i = 0; i<Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    private static boolean usingRoot(int n) {
        for(int i = 0; i<Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
