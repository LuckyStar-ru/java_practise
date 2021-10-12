package ru.novikov.practika.one.fifth;

public class SecondSolution {
    public void solution(int value) {
        if (value == 0) {
            return;
        }
        System.out.println(value % 10);
        solution(value / 10);
    }
}
