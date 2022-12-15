
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // test your code here

//        Card first = new Card(2, Suit.DIAMOND);
//        Card second = new Card(14, Suit.SPADE);
//        Card third = new Card(12, Suit.HEART);
//
//        System.out.println(first);
//        System.out.println(second);
//        System.out.println(third);
//        Hand hand = new Hand();
//
//        hand.add(new Card(2, Suit.DIAMOND));
//        hand.add(new Card(14, Suit.SPADE));
//        hand.add(new Card(12, Suit.HEART));
//        hand.add(new Card(2, Suit.SPADE));
//        hand.sort();
//        hand.print();
        Hand hand1 = new Hand();
        hand1.add(new Card(12, Suit.HEART));
        Hand hand2 = new Hand();
        hand2.add(new Card(3, Suit.SPADE));
        hand2.add(new Card(9, Suit.SPADE));
        System.out.println(hand2.compareTo(hand1));
    }
}
