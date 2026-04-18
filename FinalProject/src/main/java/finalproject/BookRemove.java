package finalproject;

/*
Group coordinator: Young, Ray-Jan
Members: Agustin, Keith
         Miguel, Steven Gabriel
         Sears, Ryan Jake
*/

import java.util.Iterator;

public class BookRemove {
    public static void removeBook(String title) {
        Iterator<Book> iterator = Storage.booksArr.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getTitle().equalsIgnoreCase(title)) {
                String tempTitle = book.getTitle();
                Storage.booksArr.remove(book);
                System.out.printf("%s successfully removed from inventory%n", tempTitle);
                return;
            }
        }
        System.out.println("Book not found.");
    }
}