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
                System.out.println("Title: " + book.getTitle());
                System.out.println("Author: " + book.getAuthor());
                System.out.print("Pages: " + book.getPages());

                return;
            }
        }
        System.out.println("Book not found!");
    }
}
