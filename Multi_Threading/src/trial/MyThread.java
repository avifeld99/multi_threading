package trial;

public class MyThread implements Runnable {

    private String sign;
    private int times;

    public MyThread(String sign, int times) {
        this.sign = sign;
        this.times = times;
    }

    @Override
    public void run() {
        for (int i = 0; i < times; i++) {
            System.out.println(i + " " + sign);
        }
    }
}
