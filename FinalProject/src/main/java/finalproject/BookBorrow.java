package finalproject;

/*
Group coordinator: Young, Ray-Jan
Members: Agustin, Keith
         Miguel, Steven Gabriel
         Sears, Ryan Jake
*/

public class BookBorrow {

    public static void borrowBook(String title) {     
        boolean found = false;

        for (int i = 0; i < Storage.booksArr.size(); i++) {
            Book book = Storage.booksArr.get(i);

            if (book.getTitle().equalsIgnoreCase(title)) {
                found = true;
                if (book.getAvailability()) {
                    System.out.println("Borrowed: " + book.getTitle());
                    book.setAvailability(false);
                    break;
                }
                else {
                    System.out.printf("%s is currently unavailable.%n", book.getTitle());
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("Book not found.");
        }
    }
}
