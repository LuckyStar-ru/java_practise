package ru.novikov.practika.two.third;

public class Bulldog extends Dog {

    public Bulldog(String dogName, int ages) {
        super(dogName, ages);
    }

    @Override
    public String getDogType() {
        return "Бульдог";
    }

    @Override
    public int getAverageHeight() {
        return 28;
    }
}
