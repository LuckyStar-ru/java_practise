package ru.novikov.practika.one.first;

public class DogTest {
    public static void main(String[] args) {
        Dog dog = new Dog("Киса", 10);
        System.out.println("\n" + dog.toString());
        dog.intoHumanAge();
    }
}
