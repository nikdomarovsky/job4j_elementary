package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book alfabet = new Book("Alfabet", 80);
        Book magic = new Book("Magic", 56);
        Book sea = new Book("Sea", 120);
        Book cleancode = new Book("Clean code", 0);
        Book[] books = new Book[4];
        books[0] = alfabet;
        books[1] = magic;
        books[2] = sea;
        books[3] = cleancode;
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + " - " + book.getPage());
        }
        System.out.println("Replace alfabet to clean code.");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + " - " + book.getPage());
        }

        System.out.println("Shown only book = clean code");
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            if ("Clean code".equals(book.getName())) {
                System.out.println(book.getName() + " - " + book.getPage());
            }
        }
    }
}
