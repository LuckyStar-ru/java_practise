package ru.novikov.practika.seventh;

import java.util.Collections;
import java.util.Queue;
import java.util.Stack;

public class DrunkGame {
    private Stack<Integer> playerOne = new Stack<>(), playerTwo = new Stack<>();
    int count = 0;

    public DrunkGame(int[] array) {
        for (int i = 0; i < 5; i++) {
            playerOne.push(array[i]);
        }
        for (int i = 5; i < 10; i++) {
            playerTwo.push(array[i]);
        }
    }

    public void startGame() {
        while (!playerTwo.isEmpty() && !playerOne.isEmpty()) {
            if (count == 106) {
                break;
            }

            int cardA = playerOne.pop();
            int cardB = playerTwo.pop();

            if (cardA > cardB) {
                playerOne.push(cardB);
                playerOne.push(cardA);
                //this.playerOne = addTwoValuesToEndOfStack(playerOne, cardA, cardB);
            } else {
                playerTwo.push(cardB);
                playerTwo.push(cardA);
                //this.playerTwo = addTwoValuesToEndOfStack(playerTwo, cardA, cardB);
            }
            //System.out.println("Карты: I-1{" + playerOne + "}, I-2{" + playerTwo + "}");
            count++;
        }
    }

    public int getResult() {
        return playerOne.isEmpty() ? 1 : (playerTwo.isEmpty() ? 2 : 3);
    }

    public int getCount() {
        return count;
    }

    private Stack<Integer> addTwoValuesToEndOfStack(Stack<Integer> stack, int value, int value2) {
        System.out.println("Стак 1: " + stack);
        Stack<Integer> tempStack = new Stack<>();
        tempStack.push(value);
        tempStack.push(value2);
        for (Integer integer : stack) {
            tempStack.push(integer);
        }
        System.out.println("Стак 2: " + tempStack);
        return tempStack;
    }
}
