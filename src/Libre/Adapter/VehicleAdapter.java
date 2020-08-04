package Libre.Adapter;

public class VehicleAdapter implements VehicleList {

    private final BookList bookList;

    public VehicleAdapter(BookList bookList) {
        this.bookList = bookList;
    }

    @Override
    public Book getVehicle(int id) {
        return bookList.getBooks(id);
    }

    @Override
    public void addVechicle(Book book) {
        bookList.addBook(book);
    }

    @Override
    public int size() {
        return bookList.count();
    }
}