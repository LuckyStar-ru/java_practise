package ru.novikov.practika.one.first;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Киса", 10);
        Ball ball = new Ball(10, BallType.FOOTBALL);
        Author author = new Author("Фёдор", "Достоевский");
        Book book = new Book("Преступление и наказание", author);
        dog.play(ball);
        dog.bite(book);
        System.out.println("\n" + dog.toString());
        System.out.println(ball.toString());
        System.out.println(book.toString());
        System.out.println(author.toString());
    }
}
