package ru.novikov.practika.two.third;

public class Terrier extends Dog {

    public Terrier(String dogName, int ages) {
        super(dogName, ages);
    }

    @Override
    public String getDogType() {
        return "Терьер";
    }

    @Override
    public int getAverageHeight() {
        return 18;
    }
}
