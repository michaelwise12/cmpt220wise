
public class TestDeckofCards {

	public static void main(String[] args) {
		// We begin by creating a new deck of cards. This initializes them in standard order
		// (the order you would get them out of a new box)
		Deck deck1 = new Deck();
		System.out.println("Printing new deck in standard order:");
		System.out.println(deck1.deckToString());
		
		// Testing out the shuffle method
		System.out.println("\nShuffling deck randomly...");
		deck1.shuffle();
		System.out.println("\nPrinting shuffled deck:");
		System.out.println(deck1.deckToString());
		
		// Testing dealing a random card
		System.out.println("\nLet's pick a card. I pick the 31st card in the deck.");
		System.out.println("The card I picked is the " + deck1.getCard(30).cardName());
	}

}
