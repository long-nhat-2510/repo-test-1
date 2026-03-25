package Main;

public class BidTransaction {
    private Bidder bidder;
    private Item item;
    private double amount;

    public BidTransaction(Bidder bidder, Item item, double amount) {
        this.bidder = bidder;
        this.item = item;
        this.amount = amount;
    }

    public Bidder getBidder() {
        return bidder;
    }

    public double getAmount() {
        return amount;
    }
}
