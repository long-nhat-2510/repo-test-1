package Main;
import java.util.ArrayList;
import java.util.List;
public class Auction {
    private List<Item> items = new ArrayList<>();
    private List<BidTransaction> bids = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }
    public void placeBid(Bidder bidder, Item item, double amount) {
        if (amount > item.getCurrentPrice()) {
            item.setCurrentPrice(amount);
            bids.add(new BidTransaction(bidder, item, amount));
            System.out.println("Bid successful");
        } else {
            System.out.println("Bid unsuccessful");
        }
    }
    public void showItems() {
        for (Item item : items) {
            System.out.println(item.getName() + " - " + item.getCurrentPrice());
        }
    }
}
