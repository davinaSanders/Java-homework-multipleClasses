import java.util.ArrayList;

public class Borrower {


    private ArrayList<Book> collection;

    public Borrower(ArrayList<Book> collection) {
        this.collection = new ArrayList<>();

    }

    public int countBook(){
        return this.collection.size();
    }


    public void addBook(Book book){
        this.collection.add(book);
    }

    public void removeBookFromLibrary(Book book, Library library){
       library.removeBook(book);
    }

    public void addAndRemove(Book book, Library library){
        this.addBook(book);
        this.removeBookFromLibrary(book, library);
    }

}
