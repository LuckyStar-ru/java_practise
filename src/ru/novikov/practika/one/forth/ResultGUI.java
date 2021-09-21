package ru.novikov.practika.one.forth;

import ru.novikov.practika.one.forth.game.Game;
import ru.novikov.practika.one.forth.game.Team;

import javax.swing.*;
import java.awt.*;

public class ResultGUI extends JFrame {
    private Game game = new Game(new Team("AC Milan"), new Team("Real Madrid"));
    private JButton buttonMilan = new JButton(game.getTeams()[0].getTitle());
    private JButton buttonMadrid = new JButton(game.getTeams()[1].getTitle());

    private JLabel result = new JLabel("Result: " + game.getScore()[0] +" X " + game.getScore()[1]);
    private JLabel lastScorerElement = new JLabel("Last Scorer: " + game.getLastScorer());
    private Label label = new Label("Winner: " + game.getWinner());

    public ResultGUI() {
        super("Match result");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setSize(450, 90);
        add(buttonMilan, BorderLayout.WEST);
        add(buttonMadrid, BorderLayout.EAST);
        add(result, BorderLayout.NORTH);
        add(label, BorderLayout.CENTER);
        add(lastScorerElement, BorderLayout.SOUTH);

        label.setAlignment(Label.CENTER);
        lastScorerElement.setHorizontalAlignment(JLabel.CENTER);
        result.setHorizontalAlignment(JLabel.CENTER);

        buttonMilan.addActionListener(action -> {
            game.addScore(game.getTeams()[0]);
            updateResult();
        });

        buttonMadrid.addActionListener(action -> {
            game.addScore(game.getTeams()[1]);
            updateResult();
        });

        setVisible(true);
    }

    private void updateResult() {
        result.setText("Result: " + game.getScore()[0] +" X " + game.getScore()[1]);
        lastScorerElement.setText("Last Scorer: " + game.getLastScorer());
        label.setText("Winner: " + game.getWinner());
        lastScorerElement.setText("Last Scorer: " + game.getLastScorer());
    }
}
