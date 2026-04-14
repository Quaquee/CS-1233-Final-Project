package finalproject;

import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class Main { 
    public static void main(String[] args) throws FileNotFoundException {
        initialize();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        
        while(choice != 7) {
            System.out.println("=====MENU=====");
            System.out.printf("1) Add Book%n");
            System.out.printf("2) View Books%n");
            System.out.printf("3) Search Book%n");
            System.out.printf("4) Classify Books%n");
            System.out.printf("5) Borrow Book%n");
            System.out.printf("6) Save report%n");
            System.out.printf("7) Exit%n");
            System.out.printf("Enter Choice: ");
            choice = sc.nextInt(); sc.nextLine();
            switch (choice) {
                case 1: BookAdd.addBook(sc); break;
                case 2: break;
                case 3: break;
                case 4: BooksClassify.classifyBooks(); break;
                case 5: BookBorrow.borrowBook(); break;
                case 6: break;
                case 7: continue;
                default: break;
            }
            System.out.println();
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
