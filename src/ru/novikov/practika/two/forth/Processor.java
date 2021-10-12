package ru.novikov.practika.two.forth;

public class Processor implements Priceable {
    private final int price;

    public Processor(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
