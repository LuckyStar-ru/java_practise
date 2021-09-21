package ru.novikov.practika.one.third.movable;

public class MovablePoint implements Movable {
    int x, y, xSpeed, ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        this.ySpeed += 1;
    }

    @Override
    public void moveDown() {
        this.ySpeed -= 1;
    }

    @Override
    public void moveLeft() {
        this.xSpeed -= 1;
    }

    @Override
    public void moveRight() {
        this.xSpeed += 1;
    }
}
