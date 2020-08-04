package Libre.Wrapper;

public class BookWrapper extends Book {
   Book original;
   public BookWrapper(Book book) {
   original = book;
   }

   @Override
    public String getAuthor(){
       return "This book's author is " + original.getAuthor();
   }

   @Override
    public String getName(){
       return "This book's name is " + original.setName();
   }

}

