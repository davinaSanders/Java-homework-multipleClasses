import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Library library;
    Book book;


    @Before
    public void before() {
        ArrayList<Book> booklist = new ArrayList<>();
//        booklist.add("book1");
//        booklist.add("book2");
//        booklist.add("book3");
//        booklist.add("book4");
        library = new Library(booklist, 6);
        book = new Book();


    }

    @Test
    public void canAddBook(){
        library.addBook(book);
        library.addBook(book);
        assertEquals(2, library.countBook());
    }

    @Test
    public void canRemoveBook(){
        library.addBook(book);
        library.addBook(book);
        library.removeBook(book);
        assertEquals(1, library.countBook());
    }


}
