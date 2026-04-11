package finalproject;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class Main { 
    public static void main(String[] args) throws FileNotFoundException {
        initialize();

        //testing
        for (Book book : Storage.booksArr) {
            System.out.printf(("%s %s %d%n", book.getTitle(), book.getAuthor(), book.getPages());
        }
    }
    
    public static void initialize() throws FileNotFoundException {
        Scanner inFile = new Scanner(new FileReader("books.txt"));
        inFile.useDelimiter(";");
        while (inFile.hasNext()) {
            String title = inFile.next().trim();
            String author = inFile.next().trim();
            int pages = inFile.nextInt(); 
            Book book = new Book(title, author, pages);
            Storage.booksArr.add(book);
        }
        inFile.close();
    }
}
