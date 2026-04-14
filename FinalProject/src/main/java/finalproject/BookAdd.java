package finalproject;

import java.util.Scanner;
import java.util.Comparator;

public class BookAdd {
    public static void input(Scanner sc) {
        //sc.nextLine();
        System.out.print("Enter title: ");
        String title = sc.nextLine().trim();
        
        System.out.print("Enter author: ");
        String author = sc.nextLine().trim();
        
        System.out.print("Enter page count: ");
        int pages = sc.nextInt(); sc.nextLine();
        Book book = new Book(title, author, pages);
        Storage.booksArr.add(book);
        Storage.booksArr.sort(Comparator.comparing(Book::getTitle, String.CASE_INSENSITIVE_ORDER));
        System.out.println("Book successfully added");
    }
}
