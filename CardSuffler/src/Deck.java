import java.util.ArrayList;
import java.util.Random;

public class Deck {
    private ArrayList<Card> cards = new ArrayList<>();

    public ArrayList<Card> getCards() {
        return cards;
    }
    public void addCard(Card card) {
        cards.add(card);
    }
    public void print() {
        for (Card c : cards) {
            System.out.println(c.toString());
        }
    }
    public void shuffle() {
        Random rand = new Random();

        for (int i = 0; i < cards.size(); i++) {
            int idx = rand.nextInt(cards.size());
            Card tmp = cards.get(i);
            cards.set(i, cards.get(idx));
            cards.set(idx, tmp);
        }
    }
    public Deck deal(int count) {
        Deck hand = new Deck();
        int size = cards.size();
        for (int i = size - 1; i >= size - count; i--) {
            hand.addCard(cards.remove(i));
        }
        return hand;
    }
}
