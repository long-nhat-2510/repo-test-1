import java.util.*;
public class LibrarySection<T extends MediaItem> {
    private List<T> mediaItems = new ArrayList<>();
    public void addItem(T item) {
        mediaItems.add(item);
    }
    public void removeItem(T item) {
        mediaItems.remove(item);
    }
    public void displayItems() {
        for (T item : mediaItems) {
            System.out.println(item.getInfo());
        }
    }
}
