package interview.thread;

public class MultipleTaskRunner {

    public static void main(String[] args) {
        Thread t = new Thread(new Task());
        t.start();
    }
}
