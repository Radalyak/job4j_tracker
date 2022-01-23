package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book ccode = new BookBuilder().setName("Clean code").setPages(1024).createBook();
        Book shantaram = new BookBuilder().setName("Shantaram").setPages(800).createBook();
        Book under = new BookBuilder().setName("Under the dome").setPages(765).createBook();
        Book tutorial = new BookBuilder().setName("Repairing washing machines for dummies").
                setPages(427).createBook();
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