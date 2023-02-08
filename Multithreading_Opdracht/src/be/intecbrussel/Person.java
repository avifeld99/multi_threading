package be.intecbrussel;

public class Person implements Runnable {

    private String name;
    private int age;
    private Thread heart;
    private Thread breathing;
    private Thread life;

    public Person(String name, int age, int heartBeatMilliSeconds) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void run() {
    }

    public void startLife() {

    }

    public void endLife() {

    }
}
