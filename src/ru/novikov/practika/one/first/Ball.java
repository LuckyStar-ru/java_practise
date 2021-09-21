package ru.novikov.practika.one.first;

public class Ball {
    private int radius;
    private BallType ballType;

    public Ball(int radius, BallType ballType) {
        this.radius = radius;
        this.ballType = ballType;
    }

    public int getRadius() {
        return radius;
    }

    public BallType getBallType() {
        return ballType;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String toString() {
        return "Мячик {r=" + radius + ", type=" + ballType + "}";
    }
}
