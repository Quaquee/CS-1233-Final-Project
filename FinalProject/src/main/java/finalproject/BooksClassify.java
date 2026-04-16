package finalproject;

public class BooksClassify {
    public static void classifyBooks() {

        if (Storage.booksArr.isEmpty()) {
            System.out.println("No books available to classify.");
            return;
        }

        System.out.println("\n--- Book Classification ---");

        System.out.println("\nLong Books (300+ pages):");
        for (Book book : Storage.booksArr) {
            if (book.getCategory().equals("LONG")) {
                System.out.printf("%s by %s (%d pages) %s%n",
                        book.getTitle(), book.getAuthor(), book.getPages(), book.getAvailability() ? "" : "(NOT AVAILABLE)");
            }
        }

        System.out.println("\nShort Books (<300 pages):");
        for (Book book : Storage.booksArr) {
            if (book.getCategory().equals("SHORT")) {
                System.out.printf("%s by %s (%d pages)%n",
                        book.getTitle(), book.getAuthor(), book.getPages(), book.getAvailability() ? "" : "(NOT AVAILABLE)");
            }
        }
    }
}
