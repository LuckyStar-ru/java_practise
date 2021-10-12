package ru.novikov.practika.two.fifth.shapes;

import java.awt.*;

public class Rectangle extends Shape {
    public Rectangle(int x, int y, int width, int height, boolean fill, Color color) {
        super(x, y, width, height, fill, color);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        if (fill) {
            g.fillRect(x, y, width, height);
        } else {
            g.drawRect(x, y, width, height);
        }
    }
}
