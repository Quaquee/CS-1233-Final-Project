package finalproject;

/*
Group coordinator: Young, Ray-Jan
Members: Agustin, Keith
         Miguel, Steven Gabriel
         Sears, Ryan Jake
*/

public class BookReturn {

    public static void returnBook(String title) {     
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
