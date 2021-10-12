package ru.novikov.practika.two.fifth.shapes;

public enum ShapeType {
    CIRCLE, OVAL, RECTANGLE, SQUARE;

    public static ShapeType get(int i) {
        return switch (i) {
            case 0 -> CIRCLE;
            case 1 -> OVAL;
            case 2 -> RECTANGLE;
            case 3 -> SQUARE;
            default -> null;
        };
    }
}
