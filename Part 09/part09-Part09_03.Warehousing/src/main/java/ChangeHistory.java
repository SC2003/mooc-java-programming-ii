
import java.util.ArrayList;

public class ChangeHistory {

    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        this.history.add(status);
    }

    public void clear() {
        this.history.clear();
    }

    public double maxValue() {
        double maxValue = Double.MIN_VALUE;
        if (!(this.history.isEmpty())) {
            for (double value : this.history) {
                maxValue = Math.max(maxValue, value);
            }
            return maxValue;
        }
        return 0.0;
    }

    public double minValue() {
        double minValue = Double.MAX_VALUE;
        if (!(this.history.isEmpty())) {
            for (double value : this.history) {
                minValue = Math.min(minValue, value);
            }
            return minValue;
        }
        return 0.0;
    }

    public double average() {
        if (!(this.history.isEmpty())) {
            double sum = 0;
            int size = this.history.size();
            for (double value : this.history) {
                sum += value;
            }
            return (double) sum / size;
        }
        return 0.0;
    }

    @Override
    public String toString() {
        return (this.history.toString());
    }

}
