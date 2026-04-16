package finalproject;

public class Book {
    private String title;
    private String author;
    private int pages;
    private Boolean availability;
    
    public Book(String title, String author, int pages, Boolean availability) {
        this.title = title;
        this.author = author;
        this.pages = pages;
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
    
    public Boolean getAvailability() {
        return availability;
    }
    
    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }
}
