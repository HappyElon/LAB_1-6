package ru.mirea.LAB4_1.fifthTask;

public class Main {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Петров В. В.", 12345, "Факультет1", "01.01.1990", "+7 123-456-7890");
        Reader reader2 = new Reader("Иванов И. И.", 54321, "Факультет2", "02.02.1985", "+7 987-654-3210");

        Book book1 = new Book("Приключения", "Автор1");
        Book book2 = new Book("Словарь", "Автор2");
        Book book3 = new Book("Энциклопедия", "Автор3");

        reader1.takeBook(3);
        reader2.takeBook("Приключения", "Словарь", "Энциклопедия");
        reader1.takeBook(book1, book2, book3);

        reader1.returnBook(2);
        reader2.returnBook("Приключения", "Словарь");
        reader1.returnBook(book2, book3);
    }
}
