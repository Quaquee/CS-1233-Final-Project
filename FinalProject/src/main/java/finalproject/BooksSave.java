package finalproject;

/*
Group coordinator: Young, Ray-Jan
Members: Agustin, Keith
         Miguel, Steven Gabriel
         Sears, Ryan Jake
*/

import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class BooksSave {
    public static void saveBooks() throws FileNotFoundException {
        PrintWriter outFile = new PrintWriter("books.txt");
        for (Book book : Storage.booksArr) {
            outFile.print(book.getTitle() + ";");
            outFile.print(book.getAuthor() + ";");
            outFile.print(book.getPages() + ";");
            String bookLength = (book.getPages() > 300 ? "LONG" : "SHORT");
            outFile.print(bookLength + ";");
            outFile.print(book.getAvailability());
            outFile.println();
        }
        System.out.println("Saved successfully!");
        outFile.close();
    }
}