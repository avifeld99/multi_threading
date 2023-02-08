package be.intecbrussel;

public class MultiDemo2 {
    public static void main(String[] args) {

        try {
        Thread thread = new Thread(new CustomThread("é", 100));
        Thread thread2 = new Thread(new CustomThread("§", 100));
        thread.setName("é");
        thread2.setName("§");
        thread.start();
        thread2.start();

        Thread.sleep(3000);

        thread.interrupt();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
