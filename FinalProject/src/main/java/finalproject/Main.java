package finalproject;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class Main {
    static ArrayList<Book> booksArr = new ArrayList<>();
    
    public static void main(String[] args) throws FileNotFoundException {
        initialize();
        
        for (Book book : booksArr) {
            System.out.println(book.getTitle());
        }
    }
    
    public static void initialize() throws FileNotFoundException {
        Scanner inFile = new Scanner(new FileReader("books.txt"));
        inFile.useDelimiter(";");
        while (inFile.hasNext()) {
            String title = inFile.next();
            String author = inFile.next();
            int pages = inFile.nextInt(); 
            Book book = new Book(title, author, pages);
            booksArr.add(book);
        }
        inFile.close();
    }
}
