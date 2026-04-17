package finalproject;

/*
Group coordinator: Young, Ray-Jan
Members: Agustin, Keith
         Miguel, Steven Gabriel
         Sears, Ryan Jake
*/

public class Book {
    private String title;
    private String author;
    private int pages;
    private String category;
    private Boolean availability;
    
    public Book(String title, String author, int pages, String category, Boolean availability) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.category = category;
        this.availability = availability;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public int getPages() {
        return pages;
    }
    
    public String getCategory() {
        return category;
    }
    
    public Boolean getAvailability() {
        return availability;
    }
    
    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }
}
