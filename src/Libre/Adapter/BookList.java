package Libre.Adapter;

import java.util.ArrayList;
import java.util.List;

public class BookList {
    List<Book> books;

    public BookList() {
        books = new ArrayList();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Book getBooks(int id) {
        return books.get(id);
    }

    public int count() {
        return books.size();
    }
}
