package ru.novikov.practika.one.fifth;

public class ThirdSolution {

    public void solution(int max) {
        solution(max, 0);
    }

    private void solution(int max, int addition) {
        if (addition <= max) {
            printNTimes(addition, addition);
            solution(max, addition + 1);
        }
    }

    private void printNTimes(int value, int n) {
        if (n == 0) {
            return;
        }
        System.out.println(value);
        printNTimes(value, n - 1);
    }
}
