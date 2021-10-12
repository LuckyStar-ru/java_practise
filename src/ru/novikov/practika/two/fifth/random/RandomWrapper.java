package ru.novikov.practika.two.fifth.random;

import ru.novikov.practika.two.fifth.shapes.ShapeType;

import java.awt.*;

public class RandomWrapper {
    public Color getRandomColor() {
        int red = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);
        return new Color(red, green, blue);
    }

    public int getRandom(int max) {
        return (int) (Math.random() * max);
    }

    public boolean getRandomBoolean() {
        return Math.random() >= 0.5;
    }

    public ShapeType getRandomShapeType() {
        return ShapeType.get(getRandom(3));
    }
}
