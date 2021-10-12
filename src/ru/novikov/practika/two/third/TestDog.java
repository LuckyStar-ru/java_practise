package ru.novikov.practika.two.third;

public class TestDog {
    public static void main(String[] args) {
        Dog dog = new Bulldog("Шарик", 5);
        System.out.println(dog);
        System.out.println("Средний рост: " + dog.getAverageHeight() + "\n");
        Terrier terrier = new Terrier("Мячик", 6);
        System.out.println(terrier);
        System.out.println("Средний рост: " + terrier.getAverageHeight());
    }
}
