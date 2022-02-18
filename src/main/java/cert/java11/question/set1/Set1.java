package cert.java11.question.set1;

public class Set1 {
    static int i;
    public static void main(String[] args) {

      initializationError();
      localVariableTest();
    }

    private static void initializationError() {
        int i, j, k= 10; // Line 1
        i = Set1.i+k; // Line 2
        k = i+++k;  // Line 3
        //Uncomment below to see initialization error.
        //Set1.i = j+i; // Line 4
        System.out.println(i+" " +k);
    }

    private static void localVariableTest() {
        boolean input1 = true, input2 = false;  // Line 1
        boolean result1 = input1 = !input1; // Line 2
        boolean result2 = input2 = input1;  // Line 3
        boolean result3 = input1 == (result1=!input2);  // Line 4
        System.out.println(input1+" " +input2 + " " +  result2 + " " + result3);
        // input 1 = true , result1 = true, input 2 = false, result2 = false, result3 = true
    }
}
