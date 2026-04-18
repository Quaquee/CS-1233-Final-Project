package finalproject;

/*
Group coordinator: Young, Ray-Jan
Members: Agustin, Keith
         Miguel, Steven Gabriel
         Sears, Ryan Jake
*/

public class BookSearch {
    public static void searchBook(String title) {
        for (Book book : Storage.booksArr) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Book found! ");
                System.out.println("---------------------");
                System.out.println("Title: " + book.getTitle());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("Pages: " + book.getPages());
                System.out.printf("Status: %s%n", book.getAvailability() ? "Available" : "Not Available");
                System.out.println("---------------------");
                return;
            }
        }
        System.out.println("Book not found.");
    }
}
