package finalproject;

public class BookBorrow {

    public static void borrowBook(String title) {     
        if (Storage.booksArr.isEmpty()) {
            System.out.println("No books available to borrow.");
            return;
        }

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
