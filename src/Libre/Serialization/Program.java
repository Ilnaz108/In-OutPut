package Libre.Serialization;

import java.io.*;

public class Program {
    public static void main(String[] args) {
        Book book1 = new Book("Economic", "Smith");
        Book book2 = new Book("Radiance", "Steven");

        try (OutputStream os = new FileOutputStream("fruits.dat");
             ObjectOutputStream oos = new ObjectOutputStream(os)) {
            oos.writeObject(book1);
            oos.writeObject(book2);
        } catch (IOException ex) {
        }
        try(InputStream is = new FileInputStream("fruits.dat");
            ObjectInputStream ois = new ObjectInputStream(is)) {

            while (is.available() > 0) {
                Book object = (Book) ois.readObject();
                System.out.println(object);
                System.out.println(object.getName());
            }
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex);
        }

    }
}
