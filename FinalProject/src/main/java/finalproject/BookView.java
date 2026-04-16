package finalproject;

import java.util.ArrayList;

public class BookView {
    public void displayBooks() {
        for (Book book : Storage.booksArr){
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Pages: " + book.getPages());
            System.out.println("----------");
        }   
    }
}
