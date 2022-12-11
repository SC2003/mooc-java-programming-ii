
import java.util.Comparator;

public class BySuitInValueOrder implements Comparator<Card> {

    @Override
    public int compare(Card c1, Card c2) {
        int valCard = 0;
        int valSuit = c1.getSuit().ordinal() - c2.getSuit().ordinal();
        if (valSuit == 0) {
            valCard = c1.getValue() - c2.getValue();
        }
        return valSuit + valCard;
    }

}
