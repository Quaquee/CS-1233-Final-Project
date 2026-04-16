package finalproject;

import java.util.Comparator;

public class BookAdd {
    public static void addBook(String title, String author, int pages) {
        Book book = new Book(title, author, pages, true);
        Storage.booksArr.add(book);
        Storage.booksArr.sort(Comparator.comparing(Book::getTitle, String.CASE_INSENSITIVE_ORDER));
        System.out.println("Book successfully added.");
    }
}
