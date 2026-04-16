package finalproject;

import java.util.Iterator;

public class BookRemove {
    public static void removeBook(String title) {
        Iterator<Book> iterator = Storage.booksArr.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.printf("%s removed from inventory%n", book.getTitle());
                Storage.booksArr.remove(book);
                return;
            }
        }
        System.out.println("Book not found!");
    }
}