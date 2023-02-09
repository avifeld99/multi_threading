package trial;

public class PathApp {
    public static void main(String[] args) {

        try {
            Thread thread = new Thread(new MyThread("*", 100));
            Thread thread2 = new Thread(new MyThread("-", 1000));

            //thread.setDaemon(true);

            thread.start();
            thread2.start();

            Thread.sleep(5000);
            thread.interrupt();
            Thread.sleep(500);
            thread.interrupt();
            Thread.sleep(500);
            thread.interrupt();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
