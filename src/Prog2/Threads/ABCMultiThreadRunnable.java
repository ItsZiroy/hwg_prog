package Prog2.Threads;

public class ABCMultiThreadRunnable implements Runnable {

    private final Thread thread;
    private final String THREAD_NAME = "ABCMultiThreadRunnable";

    public ABCMultiThreadRunnable() {
        thread = new Thread(this, THREAD_NAME);
        thread.setPriority(Thread.MIN_PRIORITY);
    }

    public void start() {
        thread.start();
    }
    @Override
    public void run() {
        for (int i = 65; i < 75; i++) {
            System.out.println((char) i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ignored) {

            }
        }
    }

    public static void main(String[] args) {
        ABCMultiThreadRunnable r1 = new ABCMultiThreadRunnable(),
                               r2 = new ABCMultiThreadRunnable();
        Thread thread1 = new Thread(r1);

        thread1.start();
        r2.start();
    }
}
