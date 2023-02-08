package be.intecbrussel;

public class MultiDemo1 {
    public static void main(String[] args) {

        Thread thread = new Thread(new CustomThread("&", 10000));
        Thread thread2 = new Thread(new CustomThread("@", 100));
        Thread thread3 = new Thread(new CustomThread("#", 100));

        thread.setName("&");
        thread2.setName("@");
        thread3.setName("#");
        System.out.println(thread.getState());
        System.out.println(thread2.getState());

        thread2.setPriority(10);
        thread.setPriority(5);

        thread.setDaemon(true);
        thread.start(); // not run because it's not multi threading, only start
        thread2.start();
        /*try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/

        //System.out.println(thread.getState());
        //System.out.println(thread2.getState());

        /*CustomThread customThread = new CustomThread();
        CustomThread customThread2 = new CustomThread();
        customThread.start();
        customThread2.start();*/
    }
}
