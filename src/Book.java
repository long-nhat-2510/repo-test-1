package src;
public class Book extends MediaItem {
    private String author;
    private int pages;
    public Book(String id, String name, String author, int pages) {
        super(id, name);
        this.author = author;
        this.pages = pages;
    }
    public String getInfo() {
        return name + " - " + author + " - " + pages + " pages";
    }
}
