package finalproject;

/*
Group coordinator: Young, Ray-Jan
Members: Agustin, Keith
         Miguel, Steven Gabriel
         Sears, Ryan Jake
*/

public class BooksView {
    public static void viewBooks() {
        if (Storage.booksArr.isEmpty()) {
            System.out.println("No books in inventory.");
            return;
        }
        
        for (Book book : Storage.booksArr){
            System.out.printf("%-60s  (%d pages)  %s%n",
                        book.getTitle() + "  by " + book.getAuthor(), book.getPages(), book.getAvailability() ? "" : "(NOT AVAILABLE)");
            System.out.println("-------------------------------------------------------------------------");
        }   
    }
}
