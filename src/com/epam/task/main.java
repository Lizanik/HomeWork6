package com.epam.task;
import java.util.Scanner;
public class main {
    public static void Main(String[] args) {
        Scanner sc = new Scanner(System.in);
        void library () {
            Book b1 = new Book(1, "Flowers forAlgernon", "Daniel Keys ", "Harcourt,Brace&World", 1959, 311, 20);
            Book b2 = new Book(2, "1984", "George Orwell", "Secker&Warbug", "1949", "328", "25");
            Book b3 = new Book(3, "One Flew Over the Cuckoo's Nest", "Ken Kesey", "Viking Press&Signet Books", "1962", 320, "35")
            Book b4 = new Book(4, "The Minds of Billy Milligan", "Daniel Keyes", "Random House", "1982", "374", "45");
            Books.addBook(b1);
            Books.addBook(b2);
            Books.addBook(b3);
            Books.addBook(b4);
            System.out.println("Enter percent to reprice ");
            Books.changePrice(sc.nextInt());
            System.out.println("Enter author to view book");
            Books author = Books.findByAuthor();
            System.out.print("Enter publication year ");
            Books year = Books.findByYear(sc.nextInt());


        }
    }
}
