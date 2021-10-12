package ru.novikov.practika.two.fifth;

import ru.novikov.practika.two.fifth.random.RandomWrapper;
import ru.novikov.practika.two.fifth.shapes.*;
import ru.novikov.practika.two.fifth.shapes.Rectangle;
import ru.novikov.practika.two.fifth.shapes.Shape;

import javax.swing.*;
import java.awt.*;

public class NullLayout extends JFrame {
    private final JButton buttonAdd = new JButton("Добавить!");
    private final JButton buttonClear = new JButton("Очистить");

    public NullLayout() {
        super("Двадцать случайных фигур");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 800);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
        buttonAdd.setBounds(150, 700, 200, 50);
        buttonClear.setBounds(450, 700, 200, 50);
        add(buttonAdd);
        add(buttonClear);
        buttonClear.addActionListener((event) -> {
            getGraphics().clearRect(0, 0, 800, 699);
        });
        buttonAdd.addActionListener((event) -> {
            addRandomShapes(20);
        });
    }

    private void addRandomShapes(int count) {
        Graphics graphics = getGraphics();
        ShapeFabric fabric = new ShapeFabric();
        RandomWrapper random = new RandomWrapper();

        for (int i = 0; i < count; i++) {
            ShapeType randomShape = random.getRandomShapeType();
            int randomX = random.getRandom(800);
            int randomY = random.getRandom(600);
            int randomWidth = random.getRandom(100);
            int randomHeight = random.getRandom(100);
            boolean fill = random.getRandomBoolean();
            Color color = random.getRandomColor();

            Shape shape = fabric.getShape(randomShape, randomX, randomY, randomWidth, randomHeight, fill, color);
            shape.draw(graphics);
        }
    }


}
