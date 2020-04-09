import java.util.Random;

public class Deck {
	private Card[] cards;
	public static final int DECK_SIZE = 52;
	
	// Initializes a deck of 52 cards
	public Deck() {
		cards = new Card[DECK_SIZE];
		for (int i = 0; i < Card.KING; i++) {
			cards[i] = new Card(i + 1, Card.HEARTS);
			cards[i + 13] = new Card(i + 1, Card.DIAMONDS);
			cards[i + 26] = new Card(i + 1, Card.CLUBS);
			cards[i + 39] = new Card(i + 1, Card.SPADES);
		}
	}
	public Card getCard(int i) {
		return cards[i];
	}
	// Method that outputs the whole deck in string format.
	public String deckToString() {

		String str = getCard(0).cardName() + " | ";
		for (int i = 1; i < DECK_SIZE; i++) {
			if (i % 13 == 0)
				str += "\n";
			str += getCard(i).cardName() + " | ";
		}
		return str;
	}
	// Method that shuffles the cards in the deck
	public void shuffle() {
		int newIndex;
		Card temp;
		Random randIndex = new Random();

		for (int i = 0; i < DECK_SIZE; i++) {

			// Picks a random index
			newIndex = randIndex.nextInt(DECK_SIZE);

			// Swapping card in old index with new index
			temp = cards[i];
			cards[i] = cards[newIndex];
			cards[newIndex] = temp;
		}
	}
}
