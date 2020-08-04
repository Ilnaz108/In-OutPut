package Libre.Adapter;

public class Program {
    public static void main(String[] args) {
        BookList books = new BookList();
        books.addBook(new Book().setAuthor("Smith").setName("Economic"));
        books.addBook(new Book().setAuthor("Steven").setName("Radiance"));
        VehicleList vehicleList = new VehicleAdapter(books);
        DataBase.save(vehicleList);
    }
}
