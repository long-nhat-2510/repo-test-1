package Main;

public abstract class Item extends Entity {
    protected String name;
    protected double currentPrice;

    public Item(String id, String name, double currentPrice) {
        super(id);
        this.name = name;
        this.currentPrice = currentPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }
    public void setCurrentPrice(double price) {
        this.currentPrice = price;
    }
    public String getName() {
        return name;
    }
}
