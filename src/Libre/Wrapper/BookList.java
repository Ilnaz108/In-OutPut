package Libre.Wrapper;

import java.util.ArrayList;
import java.util.List;

public class BookList {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book().setAuthor("Smith").setName());
        books.add(new Book().setAuthor("Steven").setName());
        for (Book book:books) {
            print(book);
        }
        List<Book> wrapperBooks = new ArrayList<>();
        for (Book book:books) {
            wrapperBooks.add(new BookWrapper(book));
        }
        for (Book book:wrapperBooks) {
            print(book);
        }
    }

    public static void print(Book book) {
        System.out.println(book.getAuthor()+", " +book.getName());
    }

}
