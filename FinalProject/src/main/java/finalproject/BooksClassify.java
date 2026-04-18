package finalproject;

/*
Group coordinator: Young, Ray-Jan
Members: Agustin, Keith
         Miguel, Steven Gabriel
         Sears, Ryan Jake
*/

public class BooksClassify {
    public static void classifyBooks() {
        if (Storage.booksArr.isEmpty()) {
            System.out.println("No books in inventory.");
            return;
        }

        System.out.println("\n--- Book Classification ---");

        System.out.println("\nLong Books (300+ pages):");
        for (Book book : Storage.booksArr) {
            if (book.getCategory().equals("LONG")) {
                System.out.printf("%-60s  (%d pages)  %s%n",
                        book.getTitle() + "  by " + book.getAuthor(), book.getPages(), book.getAvailability() ? "" : "(NOT AVAILABLE)");
                System.out.println("-------------------------------------------------------------------------");
            }
        }

        System.out.println("\n\nShort Books (<=300 pages):");
        for (Book book : Storage.booksArr) {
            if (book.getCategory().equals("SHORT")) {
                System.out.printf("%-60s  (%d pages)  %s%n",
                        book.getTitle() + "  by " + book.getAuthor(), book.getPages(), book.getAvailability() ? "" : "(NOT AVAILABLE)");
                System.out.println("-------------------------------------------------------------------------");
            }
        }
    }
}
