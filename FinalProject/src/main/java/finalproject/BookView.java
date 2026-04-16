package finalproject;

import java.util.*;

public class BookView {
    public void displayBooks() {
        try{
            for (Book book : Storage.booksArr){
                System.out.println("Title: " + book.getTitle());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("Pages: " + book.getPages());
                System.out.println("----------");
            }   
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
