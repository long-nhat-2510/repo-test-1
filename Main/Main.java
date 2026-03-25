package Main;

public class Main {
    public static void main(String[] args) {
        Auction auction = new Auction();

        Item laptop = new Electronics("1", "Laptop", 1000);
        auction.addItem(laptop);

        Bidder user1 = new Bidder("u1", "Ronaldo");
        auction.showItems();
        auction.placeBid(user1, laptop, 1200);
        auction.showItems();
    }
}
