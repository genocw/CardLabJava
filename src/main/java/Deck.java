import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> deckOfCards;

    public Deck() {
        this.deckOfCards = new ArrayList<>();
    }

    public ArrayList<Card> getDeckOfCards() {
        return this.deckOfCards;
    }

    public Card getCard(SuitType suit, RankType rank) {
        return new Card(suit, rank) ;
    }

    public void addCard(SuitType suit, RankType rank) {
        this.deckOfCards.add(getCard(suit, rank));
    }

    public void populateDeck() {
        for (SuitType suit : SuitType.values()) {
            for (RankType rank : RankType.values()) {
                addCard(suit, rank);
            }
        }
    }

    public void shuffleDeck() {
        Collections.shuffle(this.deckOfCards);
    }

    public Card dealCard() {
        return this.deckOfCards.remove(0);
    }
}
