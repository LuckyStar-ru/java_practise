package ru.novikov.practika.one.forth.game;

public class Game {
    private Team team1;
    private Team team2;

    private final int score[] = {0, 0};
    private Team lastScorer = null;

    public Game(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
    }

    public String getLastScorer() {
        if (lastScorer == null) {
            return "N/A";
        } else {
            return lastScorer.getTitle();
        }
    }

    public void addScore(Team team) {
        if (team.equals(team1)) {
            score[0] += 1;
            updateLastScorer(team1);
        } else {
            score[1] += 1;
            updateLastScorer(team2);
        }
    }

    public int[] getScore() {
        return score;
    }

    public String getWinner() {
        if (score[0] == score[1])
            return "N/A";
        else if (score[0] < score[1])
            return team2.getTitle();
        else
            return team1.getTitle();
    }

    public Team[] getTeams() {
        return new Team[] {team1, team2};
    }

    void updateLastScorer(Team team) {
        this.lastScorer = team;
    }
}
