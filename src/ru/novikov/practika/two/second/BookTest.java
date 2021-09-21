package ru.novikov.practika.two.second;

public class BookTest {
    public static void main(String[] args) {
        Author author = new Author("Фёдор", "Достоевский");
        Book book = new Book("Преступление и наказание", author, 1866);
        System.out.println(book.toString());
    }
}
