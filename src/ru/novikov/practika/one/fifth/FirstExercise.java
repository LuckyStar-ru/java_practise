package ru.novikov.practika.one.fifth;

import java.util.Scanner;

public class FirstExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        new FirstSolution().solution(input);
        System.out.println("Решено!");
    }
}
