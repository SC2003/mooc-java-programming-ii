
import java.util.ArrayList;

public class Box implements Packable {

    private ArrayList<Packable> items;
    private double maxWeight;

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    public void add(Packable packable) {
        if (this.weight() + packable.weight() > maxWeight) {
            return;
        }
        this.items.add(packable);
    }

    @Override
    public double weight() {
        double weight = 0;
        for (Packable pack : this.items) {
            weight += pack.weight();
        }
        return weight;
    }

    @Override
    public String toString() {
        return ("Box: " + this.items.size() + " items, total weight " + this.weight() + " kg");
    }
}
