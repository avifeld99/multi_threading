package be.intecbrussel;

public class MultiDemo3 {
    public static void main(String[] args) {

        try {
            Thread thread = new Thread(new CustomThread("é", 10000));
            Thread thread2 = new Thread(new CustomThread("&", 10000));
            Thread thread3 = new Thread(new CustomThread("@", 10000));

            thread.start();
            thread.join(5000);
            thread2.start();
            thread3.start();
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
