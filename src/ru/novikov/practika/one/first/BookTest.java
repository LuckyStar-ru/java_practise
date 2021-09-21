package ru.novikov.practika.one.first;

public class BookTest {
    public static void main(String[] args) {
        Author author = new Author("Фёдор", "Достоевский");
        Book book = new Book("Преступление и наказание", author);
        System.out.println(book.toString());
    }
}
