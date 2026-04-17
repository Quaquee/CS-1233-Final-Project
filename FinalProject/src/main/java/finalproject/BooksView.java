package finalproject;

/*
Group coordinator: Young, Ray-Jan
Members: Agustin, Keith
         Miguel, Steven Gabriel
         Sears, Ryan Jake
*/

public class BooksView {
    public static void viewBooks() {
        for (Book book : Storage.booksArr){
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Pages: " + book.getPages());
            System.out.printf("Status: %s%n", book.getAvailability() ? "Available" : "Not Available");
            System.out.println("----------");
        }   
    }
}
