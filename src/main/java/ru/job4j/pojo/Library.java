package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book ccode = new Book("Clean code", 1024);
        Book shantaram = new Book("Shantaram", 800);
        Book under = new Book("Under the dome", 765);
        Book tutorial = new Book("Repairing washing machines for dummies", 427);
        Book[] bookshelf = new Book[4];
        bookshelf[0] = ccode;
        bookshelf[1] = shantaram;
        bookshelf[2] = under;
        bookshelf[3] = tutorial;
        for (Book wat : bookshelf) {
            System.out.println(wat.getName() + " - " + wat.getPages());
        }
        System.out.println("Let's swap first and fourth book");
        Book inHand = bookshelf[0];
        bookshelf[0] = bookshelf[3];
        bookshelf[3] = inHand;
        System.out.println("Done!");
        for (Book wat : bookshelf) {
            System.out.println(wat.getName() + " - " + wat.getPages());
        }
        for (Book wat : bookshelf) {
            if ("Clean code".equals(wat.getName())) {
                System.out.println(wat.getName() + " - " + wat.getPages());
            }
        }
        }
    }