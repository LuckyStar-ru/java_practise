package ru.novikov.practika.two.fifth.shapes;

import java.awt.*;

public class Oval extends Shape {
    public Oval(int x, int y, int width, int height, boolean fill, Color color) {
        super(x, y, width, height, fill, color);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        if (fill) {
            g.fillOval(x, y, width, height);
        } else {
            g.drawOval(x, y, width, height);
        }
    }
}
