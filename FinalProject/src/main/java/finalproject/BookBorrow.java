package finalproject;

import java.util.Scanner;

public class BookBorrow {

    public static void borrowBook() {
        Scanner sc = new Scanner(System.in);

        if (Storage.booksArr.isEmpty()) {
            System.out.println("No books available to borrow.");
            return;
        }

        System.out.print("Enter book title to borrow: ");
        String title = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < Storage.booksArr.size(); i++) {
            Book book = Storage.booksArr.get(i);

            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("You borrowed: " + book.getTitle());
                Storage.booksArr.remove(i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Book not found.");
        }
    }
}
