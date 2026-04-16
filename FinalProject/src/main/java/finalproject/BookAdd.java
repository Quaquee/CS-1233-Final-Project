package finalproject;

import java.util.Comparator;

public class BookAdd {
    public static void addBook(String title, String author, int pages) {
        String category = (pages < 300) ? "SHORT" : "LONG";
        Book book = new Book(title, author, pages, category, true);
        Storage.booksArr.add(book);
        Storage.booksArr.sort(Comparator.comparing(Book::getTitle, String.CASE_INSENSITIVE_ORDER));
        System.out.println("Book successfully added.");
    }
}
