package ru.novikov.practika.two.sixth;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;

public class GuessGameFrame extends JFrame {
    private final JLabel label = new JLabel("Угадайте число от 1 до 20:");
    private final JTextField textField = new JTextField();
    private final JButton button = new JButton("Предположить");
    private int guessedValue = (int) (Math.random() * 19) + 1;
    private int tryes = 2; // + 1

    public GuessGameFrame() {
        super("Угадайка");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 70);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
        add(label);
        add(textField);
        add(button);

        textField.setColumns(2);

        button.addActionListener((event) -> {
            String stringValue = textField.getText();
            try {
                int val = Integer.parseInt(stringValue);
                if (val < 0 || val > 20) {
                    JOptionPane.showMessageDialog(null, "Ошибка! Число должно быть от 1 до 20!");
                } else {
                    if (val == guessedValue) {
                        JOptionPane.showMessageDialog(null, "Вы угадали число! Поздравляю!");
                        dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
                    } else {
                        if (tryes <= 0) {
                            JOptionPane.showMessageDialog(null, "Вы проиграли! Число было " + val);
                            dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
                        } else {
                            JOptionPane.showMessageDialog(null, "Вы не угадали число! " +
                                    "\nОсталось попыток: " + tryes +
                                    "\nЗагаданное число: " + ((val > guessedValue) ? "Меньше " + val  : "Больше " + val));
                            tryes--;
                        }
                    }
                    textField.setText("");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ошибка! Введите число!");
            }
        });
    }
}
