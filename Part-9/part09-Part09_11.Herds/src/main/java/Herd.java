
import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable {

    private List<Movable> herd;

    public Herd() {
        this.herd = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        this.herd.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable axis : this.herd) {
            axis.move(dx, dy);
        }
    }

    public String toString() {
        String output = "";
        for (Movable axis : this.herd) {
            output += axis.toString() + "\n";
        }
        return output;
    }

}
