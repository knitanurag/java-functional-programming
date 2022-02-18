package online.question.multiplechoice;

public class Question1 {
    public static void main(String[] args) {
        String str = "Hacking";
        //Uncomment below code and we can find compilation error that says that
        // the copy of variable must be effective final.
       /* LangFunction lf = ()->System.out.println(str + "Java");
        str = "ay";
        lf.callMe();*/
    }
}

interface LangFunction{
    void callMe();
}

