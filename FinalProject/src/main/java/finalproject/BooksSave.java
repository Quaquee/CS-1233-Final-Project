package finalproject;

import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class BooksSave {
    public static void saveBooks() throws FileNotFoundException {
        PrintWriter outFile = new PrintWriter("booksTEST.txt");
        for (Book book : Storage.booksArr) {
            outFile.print(book.getTitle() + ";");
            outFile.print(book.getAuthor() + ";");
            outFile.print(book.getPages() + ";");
            outFile.print(book.getAvailability());
            outFile.println();
        }
        System.out.println("Saved successfully!");
        outFile.close();
    }
}