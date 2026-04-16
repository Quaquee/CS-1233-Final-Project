package finalproject;

import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class BooksSave {
    public static void saveBooks() throws FileNotFoundException {
        PrintWriter outFile = new PrintWriter("studentRecordTEST.txt");
        outFile.println("//[TITLE];[AUTHOR];[PAGECOUNT];[CATEGORY];[BORROWED?]");
        for (Book book : Storage.booksArr) {
            outFile.print(book.getTitle() + ";");
            outFile.print(book.getAuthor() + ";");
            outFile.print(book.getPages() + ";");
        }
    }
}