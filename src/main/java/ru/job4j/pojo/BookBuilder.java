package ru.job4j.pojo;

public class BookBuilder {
    private String name;
    private int pages;

    public BookBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public BookBuilder setPages(int pages) {
        this.pages = pages;
        return this;
    }

    public Book createBook() {
        return new Book(name, pages);
    }
}