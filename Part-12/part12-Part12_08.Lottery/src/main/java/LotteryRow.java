
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private Random random;
    private ArrayList<Integer> numbers;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        // Implement the random number generation here
        // the method containsNumber is probably useful
        this.random = new Random();
        for (int i = 0; i < 7; i++) {
            int randomNum = this.random.nextInt(40) + 1;
            if (containsNumber(randomNum)) {
                i--;
                continue;
            }
            this.numbers.add(randomNum);
        }
    }

    public boolean containsNumber(int number) {
        // Check here whether the number is among the drawn numbers
        return this.numbers.contains(number);
    }
}
