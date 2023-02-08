package be.intecbrussel;

public class CustomThread implements Runnable {

    private String sign;
    private int times;

    public CustomThread(String sign, int times) {
        this.sign = sign;
        this.times = times;
    }

    @Override
    public void run() {
        for (int i = 0; i < times; i++) {
            System.out.println(i + " " + sign);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " was interrupted: " +
                        Thread.currentThread().getState());            }
            Thread.yield();
        }
    }
}
