package finalproject;

/*
Group coordinator: Young, Ray-Jan
Members: Agustin, Keith
         Miguel, Steven Gabriel
         Sears, Ryan Jake
*/

import java.util.Comparator;

public class BookAdd {
    public static void addBook(String title, String author, int pages) {
        String category = (pages > 300) ? "LONG" : "SHORT";
        Book book = new Book(title, author, pages, category, true);
        Storage.booksArr.add(book);
        Storage.booksArr.sort(Comparator.comparing(Book::getTitle, String.CASE_INSENSITIVE_ORDER));
        System.out.println("Book successfully added.");
    }
}
