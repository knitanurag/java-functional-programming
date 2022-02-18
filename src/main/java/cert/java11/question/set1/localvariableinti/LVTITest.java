package cert.java11.question.set1.localvariableinti;

public class LVTITest {
    static float tax_rate =0.06F;
    public static void main(String[] args) {
 
        var result = 0;
        var tax_rate = 0.05;    // Line 1
        var price = 100;
        var adjusted_tax = price * tax_rate;  // Line 2
        //Below line gives compile error since double can't be casted to int.
        //result = price + adjusted_tax;  // Line 3
        System.out.println("Adjusted price = " + result);
    }
}