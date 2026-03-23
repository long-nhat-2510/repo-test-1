public class Main {
    public static void main(String[] args) {
        LibrarySection<Book> bookSection = new LibrarySection<>();
        bookSection.addItem(new Book("B01", "One Piece", "Eiichiro Oda", 1000));
        bookSection.addItem(new Book("B02", "Naruto", "Masashi Kishimoto", 720));
        System.out.println("Khu vuc sach:");
        bookSection.displayItems();
        LibrarySection<DVD> dvdSectioon = new LibrarySection<>();
        dvdSectioon.addItem(new DVD("D01", "Attack On Titan", "Hajime Isayama", 100));
        dvdSectioon.addItem(new DVD("D02", "One Punch Man", "Yusuke Murata", 200));
        System.out.println("\nKhu vuc DVD");
        dvdSectioon.displayItems();
    }
}
