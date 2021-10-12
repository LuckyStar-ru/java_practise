package ru.novikov.practika.two.fifth.shapes;

import java.awt.*;

public class ShapeFabric {

    public Shape getShape(ShapeType shapeType, int x, int y, int width, int height, boolean fill, Color color) {
        return switch (shapeType) {
            case OVAL -> new Oval(x, y, width, height, fill, color);
            case CIRCLE -> new Oval(x, y, width, width, fill, color);
            case SQUARE -> new Rectangle(x, y, width, width, fill, color);
            case RECTANGLE -> new Rectangle(x, y, width, height, fill, color);
        };
    }
}
