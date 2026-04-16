package finalproject;

import java.util.*;
import java.io.*;

public class BookView {
    public void displayBooks() {
        try{
            BufferedReader read = new BufferedReader(new FileReader("books.txt"));
            String line;

            while ((line = read.readLine()) != null){
                String[] parts = line.split(";");
                Books book = new Books(parts[0], parts[1], Integer.parseInt(parts[2]));
                System.out.println("Title: " + book.getTitle());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("Pages: " + book.getPages());
                System.out.println("----------");
            }
            read.close();    
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}