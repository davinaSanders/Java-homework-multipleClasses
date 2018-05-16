import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    Borrower borrower;
    Book book;
    Library library;

    @Before
    public void before() {
        ArrayList<Book> collection = new ArrayList<>();
        ArrayList<Book> collection1 = new ArrayList<>();
        borrower = new Borrower(collection);
        book = new Book();
        library = new Library(collection1, 6);

    }

    @Test
    public void canAddBook() {
        borrower.addBook(book);
        borrower.addBook(book);
        assertEquals(2, borrower.countBook());

    }

    //
    @Test
    public void canRemoveBookFromLibrary() {
        library.addBook(book);
        library.addBook(book);
        borrower.removeBookFromLibrary(book, library);
        assertEquals(1, library.countBook());
    }

    @Test
    public void canAddAndRemove(){
        library.addBook(book);
        borrower.addAndRemove(book, library);
        assertEquals(0, library.countBook());
        assertEquals(1, borrower.countBook());

    }

}