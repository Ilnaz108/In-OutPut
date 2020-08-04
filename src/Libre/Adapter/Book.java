package Libre.Adapter;

public class Book {
    private String author;
    private String name;

    public Book setAuthor(String author) {
        this.author = author;
        return this;
    }

    public Book setName(String name) {
        this.name = name;
        return this;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }
}
