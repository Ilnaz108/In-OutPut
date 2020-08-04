package Libre.Serialization;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramBookList {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("1 - добвить книгу");
        System.out.println("2 - сохранить книгу");
        System.out.println("3 - выход");
        boolean exit = false;
        do {
            switch (sc.nextInt()) {
                case 1: {
                    System.out.println("введите название книги");
                    String name = sc.next();
                    System.out.println("введите автора книги");
                    String author = sc.next();
                    books.add(new Book(name, author));
                }
                break;
                case 2: {
                    try (OutputStream os = new FileOutputStream("BookList.dat");
                         ObjectOutputStream oos = new ObjectOutputStream(os)) {
                        oos.writeObject(books);
                    } catch (IOException ex) {

                    }
                }
                break;
                case 3:
                    exit = true;
                    break;
            }
        } while (!exit);

        List<Book> bookList = getBooks("BookList.dat");
        for (Book book : bookList) {
            System.out.println(book);
        }
    }

    private static List<Book> getBooks(String fileName) {
        if (new File(fileName).exists()) {
            try (InputStream is = new FileInputStream(fileName);
                 ObjectInputStream ois = new ObjectInputStream(is)) {
                return (List<Book>) ois.readObject();

            } catch (IOException | ClassNotFoundException ex) {
                System.out.println(ex);
            }
        }
        System.out.println("не удалось найти файл, инициализируем пустым списком");
        return new ArrayList<>();
    }
}
