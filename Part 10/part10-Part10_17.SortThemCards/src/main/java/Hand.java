
import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand> {

    private ArrayList<Card> hand;

    public Hand() {
        this.hand = new ArrayList<>();
    }

    public void add(Card card) {
        this.hand.add(card);
    }

    public void print() {
        this.hand.stream().forEach(System.out::println);
    }

    public void sort() {
        Collections.sort(this.hand);
    }

    public int sumValues() {
        int sum = 0;
        for (Card card : this.hand) {
            sum = sum + card.getValue();
        }
        return sum;
    }

    public int numCards() {
        return this.hand.size();
    }

    @Override
    public int compareTo(Hand h) {
        int val = this.sumValues() - h.sumValues();

        return val;
    }

    public void sortBySuit() {
        Collections.sort(this.hand, new BySuitInValueOrder());
    }
}
