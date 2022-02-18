package interview.thread;

public class Task  implements Runnable {

    @Override
    public void run() {
        System.out.println("Task is running.");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Task is completed.");
    }

}
