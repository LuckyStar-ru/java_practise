package ru.novikov.practika.one.fifth;

import java.util.Scanner;

public class ForthExercise {
    private static int[] array = new int[100];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        getArray(scanner, 0);
        new ForthSolution().solution(array);
        System.out.println("Решено!");
    }

    private static void getArray(Scanner scanner, int i) {
        int value = scanner.nextInt();
        if (value == 0) {
            return;
        }
        array[i] = value;
        getArray(scanner, i + 1);
    }
}
