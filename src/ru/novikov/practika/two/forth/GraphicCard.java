package ru.novikov.practika.two.forth;

public class GraphicCard implements Priceable, Nameable {
    private final String name;
    private final int price;

    public GraphicCard(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
