package ru.novikov.practika.one.fifth;

public class FirstSolution {
    public void solution(int value) {
        int size = getSize(value);
        printDigits(value, size);
    }

    private void printDigits(int value, int k) {
        if (k <= 0) return;
        System.out.println(getDigit(value, k));
        printDigits(value, k - 1);
    }

    private int getSize(int value) {
        return getSize(value, 0);
    }

    private int getSize(int value, int size) {
        if (value != 0) {
            return getSize(value / 10, size + 1);
        }
        return size;
    }

    private int getDigit(int value, int i) {
        return (int) ((value % Math.pow(10, i)) / Math.pow(10, i-1));
    }
}
