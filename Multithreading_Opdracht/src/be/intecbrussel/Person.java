package be.intecbrussel;

import java.util.Random;

public class Person implements Runnable {

    private String name;
    private int age;
    private Thread heart;
    private Thread breathing;
    private Thread life;

    public Person(String name, int age, int heartBeatMilliSeconds) {
        this.name = name;
        this.age = age;
        heart = new Thread(new Heartbeat(heartBeatMilliSeconds), name);
        breathing = new Thread(new Lungs(), name);
        life = new Thread(this, name);
    }

    public void startLife() {
        heart.start();
        breathing.start();
        life.start();
    }

    public void endLife() {
        heart.interrupt();
        breathing.interrupt();
        System.out.println(life.getName() + " died.");
    }

    @Override
    public void run() {
        Random random = new Random();

        for (int i = age; i < 100; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(life.getName() + " is " + i + " years old.");
            if (random.nextInt(20) == 13) {
                System.out.println("Bad luck!");
                break;
            }
        }
        endLife();
    }
}
