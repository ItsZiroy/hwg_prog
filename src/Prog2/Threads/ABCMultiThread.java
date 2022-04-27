package Prog2.Threads;

public class ABCMultiThread extends Thread {
    public void run() {
        for (int i = 65; i < 75; i++) {
            System.out.println((char) i);
            try {
                sleep(1000);
            } catch (InterruptedException ignored) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        ABCMultiThread abc = new ABCMultiThread(), abc2 = new ABCMultiThread();
        abc.start();
        abc2.start();
    }
}
