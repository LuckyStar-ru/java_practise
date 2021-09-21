package ru.novikov.practika.one.second;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Новиков Владислав Игоревич", "viadlmba@mail.ru", 'М');
        Author prepodovatel = new Author("Волков Михаил Юрьевич", "volkov_m@mirea.ru", 'М');
        System.out.println(author.toString());
        System.out.println(prepodovatel.toString());
        author.setEmail(null);
        System.out.println("\nAfter Author#setEmail(null) : " + author.toString());
    }
}
