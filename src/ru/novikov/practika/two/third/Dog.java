package ru.novikov.practika.two.third;

public abstract class Dog {
    private String dogName;
    private int ages;

    public Dog(String dogName, int ages) {
        this.dogName = dogName;
        this.ages = ages;
    }

    /**
     * Makes sound (in console)
     */
    public void woof() {
        System.out.println("Собака \"" + dogName + "\" гавкает!");
    }

    public String getDogName() {
        return this.dogName;
    }

    public int getAges() {
        return this.ages;
    }

    @Override
    public String toString() {
        return "{DOG [" + dogName + ", type=" + getDogType() + ", age=" + getAges() + ", name=" + dogName + "]}";
    }

    public abstract String getDogType();

    /**
     *
     * @return average height in sm
     */
    public abstract int getAverageHeight();
}
