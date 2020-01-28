package com.epam.task;

public class Books {
    private Book[] books;
    private int bookCount = 0;

    public Books(int size) {
        books = new Book[size];
    }

    boolean addBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                return true;
            }
        }
        return false;
    }

    public void changePrice(int percents) {
        for (int i = 0; i < bookCount; i++) {
            books[i].setPrice(books[i].getPrice() + books[i].getPrice() / 100 * percents);
        }
    }

    public Books findByAuthor(String author) {
        Books Author = new Books(books.length);
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getAuthor().equals(author)) {
            }
        }
        if (bookCount == 0) {
            System.out.println("didn't find one");
        }
        return Author;
    }

    public Book findByYear(int year) {
        Books Year = new Books(books.length);
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getYear() > year) {
            }
        }
        return Year;
    }
}



