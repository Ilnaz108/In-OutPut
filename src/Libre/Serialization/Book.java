package Libre.Serialization;

import java.io.Serializable;

public class Book implements Serializable {
    public static final long serialVersionUID = 1L;
    String name;
    String author;
    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getName(){
        return name;
    }
    public String getAuthor() {
        return author;
    }
    @Override
    public String toString() {
        return "Book{" +
                "name= " + name + '\'' +
                ", author= " + author+ '\'' +
                '}';
    }

}
