package ru.novikov.practika.two.fifth.shapes;

import java.awt.*;

public abstract class Shape {
    protected int x, y, width, height;
    protected boolean fill;
    protected Color color;

    public Shape(int x, int y, int width, int height, boolean fill, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.fill = fill;
        this.color = color;
    }
    public abstract void draw(Graphics g);
}
