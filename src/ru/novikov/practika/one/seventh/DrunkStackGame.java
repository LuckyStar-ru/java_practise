package ru.novikov.practika.one.seventh;

import java.util.Stack;

public class DrunkStackGame {
    private Stack<Integer> playerOne = new Stack<>(), playerTwo = new Stack<>();
    int count = 0;

    public DrunkStackGame(int[] array) {
        for (int i = 4; i >= 0; i--) {
            playerOne.push(array[i]);
        }
        for (int i = 9; i >= 5; i--) {
            playerTwo.push(array[i]);
        }
    }

    public void startGame() {
        while (!playerTwo.isEmpty() && !playerOne.isEmpty()) {
            if (count == 106) {
                break;
            }
            System.out.println(count + ". КартыBe: I-1{" + playerOne + "}, I-2{" + playerTwo + "}");

            int cardA = playerOne.pop();
            int cardB = playerTwo.pop();

            System.out.println(count + ". КартыIn: I-1{" + playerOne + "}, I-2{" + playerTwo + "}, " + cardA + " | " + cardB);

            if (cardA > cardB) {
                playerOne.add(0, cardA);
                playerOne.add(0,cardB);
            } else {
                playerTwo.add(0,cardA);
                playerTwo.add(0,cardB);
            }
            System.out.println(count + ". Карты: I-1{" + playerOne + "}, I-2{" + playerTwo + "}");
            count++;
        }
    }

    public int getResult() {
        return playerOne.isEmpty() ? 1 : (playerTwo.isEmpty() ? 2 : 3);
    }

    public int getCount() {
        return count;
    }
}
