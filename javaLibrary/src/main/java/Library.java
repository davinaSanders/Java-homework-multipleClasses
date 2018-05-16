import java.util.HashMap;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> collection;
    private int capacity;

        public Library(ArrayList<Book> collection, int capacity) {
            this.collection = new ArrayList<>();
            this.capacity = capacity;
        }

            public int countBook(){
                return this.collection.size();
            }


            public void addBook(Book book){
                if (capacity > this.collection.size());
                     this.collection.add(book);
            }

            public void removeBook(Book book){
            collection.remove(0);
    }



}
//    public static void main(String[] args) {
//
//        HashMap<String, Integer> books = new HashMap();
//
//        books.put("Genre1", 5);
//        books.put("Genre2", 6);
//        books.put("Genre3", 8);
//
//
//    }
////
//}
