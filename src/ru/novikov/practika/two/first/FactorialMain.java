package ru.novikov.practika.two.first;

public class FactorialMain {
    public static void main(String[] args) {
        int randomInt = (int) (Math.random() * 10);
        System.out.println("Рандомное число: " + randomInt);
        long factorial = Factorial.of(randomInt);
        System.out.println("Факториал: " + factorial);
    }
}
