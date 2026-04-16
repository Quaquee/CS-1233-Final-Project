package finalproject;

import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Comparator;

public class Main { 
    public static void main(String[] args) throws FileNotFoundException {
        initialize();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        
        while(choice != 9) {
            System.out.println("=====MENU=====");
            System.out.printf("1)Add Book%n");
            System.out.printf("2)Remove Book%n");
            System.out.printf("3)View Books%n");
            System.out.printf("4)Search Book%n");
            System.out.printf("5)Classify Books%n");
            System.out.printf("6)Borrow Book%n");
            System.out.printf("7)Return Book%n");
            System.out.printf("8)Save report%n");
            System.out.printf("9)Exit%n");
            System.out.printf("Enter Choice: ");
            choice = sc.nextInt(); sc.nextLine();
            switch (choice) {
                case 1: bookAddInput(sc); break;
                case 2: bookRemoveInput(sc); break;
                case 3: BooksView.viewBooks(); break;
                case 4: bookSearchInput(sc); break;
                case 5: BooksClassify.classifyBooks(); break;
                case 6: bookBorrowInput(sc); break;
                case 7: bookReturnInput(sc); break;
                case 8: BooksSave.saveBooks(); break;
                case 9: continue;
                default: System.out.println("Invalid choice. Please try again."); break;
            }
            System.out.println();
        }
        sc.close();
    }
    
    public static void initialize() throws FileNotFoundException {
        Scanner inFile = new Scanner(new FileReader("books.txt"));
        inFile.useDelimiter(";");
        while (inFile.hasNext()) {
            String line = inFile.nextLine().trim();
            String[] parts = line.split(";");
            Book book = new Book(parts[0], parts[1], Integer.parseInt(parts[2]), Boolean.parseBoolean(parts[3]));
            Storage.booksArr.add(book);
        }
        Storage.booksArr.sort(Comparator.comparing(Book::getTitle, String.CASE_INSENSITIVE_ORDER));
        inFile.close();
    }
    
    public static void bookAddInput(Scanner sc) {
        System.out.print("Enter title: ");
        String title = sc.nextLine().trim();
        
        System.out.print("Enter author: ");
        String author = sc.nextLine().trim();
        
        System.out.print("Enter page count: ");
        int pages = sc.nextInt(); sc.nextLine();
        BookAdd.addBook(title, author, pages);
    }
    
    public static void bookRemoveInput(Scanner sc) {
        System.out.print("Enter title: ");
        String title = sc.nextLine().trim();
        
        BookRemove.removeBook(title);
    }
    
    public static void bookSearchInput(Scanner sc) {
        System.out.print("Enter book title to search for: ");
        String title = sc.nextLine().trim();
        BookSearch.searchBook(title);
    }
    
    public static void bookReturnInput(Scanner sc) {
        System.out.print("Enter book title to return: ");
        String title = sc.nextLine().trim();
        BookReturn.returnBook(title);
    }
    
    public static void bookBorrowInput(Scanner sc) {
        System.out.print("Enter book title to borrow: ");
        String title = sc.nextLine().trim();
        BookBorrow.borrowBook(title);
    }
}
