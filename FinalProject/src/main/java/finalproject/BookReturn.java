package finalproject;

public class BookReturn {

    public static void returnBook(String title) {     
        if (Storage.booksArr.isEmpty()) {
            System.out.println("No books available to borrow.");
            return;
        }

        boolean found = false;

        for (int i = 0; i < Storage.booksArr.size(); i++) {
            Book book = Storage.booksArr.get(i);

            if (book.getTitle().equalsIgnoreCase(title)) {
                found = true;
                if (!book.getAvailability()) {
                    System.out.println("Returned: " + book.getTitle());
                    book.setAvailability(true);
                    break;
                }
                else {
                    System.out.printf("%s is already returned.%n", book.getTitle());
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("Book not found.");
        }
    }
}
