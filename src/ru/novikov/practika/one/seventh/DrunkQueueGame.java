package ru.novikov.practika.one.seventh;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DrunkQueueGame {
    private Queue<Integer> playerOne = new LinkedList<>(), playerTwo = new LinkedList<>();
    int count = 0;

    public DrunkQueueGame(int[] array) {
        for (int i = 0; i < 5; i++) {
            playerOne.add(array[i]);
        }
        for (int i = 5; i < 10; i++) {
            playerTwo.add(array[i]);
        }
    }

    public void startGame() {
        while (!playerTwo.isEmpty() && !playerOne.isEmpty()) {
            if (count == 106) {
                break;
            }
            System.out.println(count + ". КартыBe: I-1{" + playerOne + "}, I-2{" + playerTwo + "}");

            int cardA = playerOne.poll();
            int cardB = playerTwo.poll();
            System.out.println(count + ". КартыIn: I-1{" + playerOne + "}, I-2{" + playerTwo + "}, " + cardA + " | " + cardB);

            if (cardA > cardB) {
                playerOne.add(cardA);
                playerOne.add(cardB);
                //this.playerOne = addTwoValuesToEndOfStack(playerOne, cardA, cardB);
            } else {
                playerTwo.add(cardA);
                playerTwo.add(cardB);
            }
            System.out.println(count + ". КартыAf: I-1{" + playerOne + "}, I-2{" + playerTwo + "}");
            count++;
        }
    }

    public int getResult() {
        return playerOne.isEmpty() ? 1 : (playerTwo.isEmpty() ? 2 : 3);
    }

    public int getCount() {
        return count;
    }

    private Queue<Integer> addTwoValuesToEndOfStack(Queue<Integer> stack, int value, int value2) {
        Queue<Integer> tempStack = new LinkedList<>();
        tempStack.add(value);
        tempStack.add(value2);
        tempStack.addAll(stack);
        return tempStack;
    }
}
