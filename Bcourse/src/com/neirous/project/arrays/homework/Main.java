package com.neirous.project.arrays.homework;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Neirous
 * @version 1.0
 * File->settings->Editor->File and Code Templates->include->File Header
 */
public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[5];
        books[0] = new Book("a", 9087);
        books[1] = new Book("bfd", 778);
        books[2] = new Book("94", 89);
        books[3] = new Book("nbfdjf", 2340);
        books[4] = new Book("d", 890);
        Book.customSort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                double i1 = ((Book) o1).price;
                double i2 = ((Book) o2).price;
                if (i2 - i1 > 0) return 1;
                else if (i2 - i1 == 0) return 0;
                else return -1;
            }
        });
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].name + "\t\t\t\t" + books[i].price);
        }

        Book.customSort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int i1 = ((Book) o1).name.length();
                int i2 = ((Book) o2).name.length();
                return i1 - i2;
            }
        });

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].name + "\t\t\t\t" + books[i].price);
        }
    }
}

class Book {
    public String name;
    public double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Book() {
    }

    public static void customSort(Book[] books, Comparator c) {
        Book temp = new Book();
        for (int i = 0; i < books.length; i++) {
            for (int j = 0; j < books.length; j++) {
                if (c.compare(books[i], books[j]) > 0) {
                    temp = books[i];
                    books[i] = books[j];
                    books[j] = temp;
                }
            }
        }
    }
}
