package interview.string;

public class NumberReverse {
    public static void main(String[] args) {
        int number = 123;
        reverseNumber(number);
    }

    private static void reverseNumber(int number) {
        int reverse = 0;
        while(number > 0){
            int remainder = number % 10;
            number = number / 10;
            reverse = reverse * 10 + remainder;
        }
        System.out.println(reverse);
    }
}
