
import java.util.List;


public class Item {

    private String product;
    private int quantity;
    private int price;

    public Item(String product, int qty, int unitPrice) {
        this.product = product;
        this.quantity = qty;
        this.price = unitPrice;
    }

    public int price() {
        return this.price * this.quantity;
    }

    public void increaseQuantity() {
        this.quantity++;
    }

    @Override
    public String toString() {
        return (this.product + ": " + this.quantity);
    }
}
