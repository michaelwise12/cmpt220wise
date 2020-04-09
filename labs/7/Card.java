
public class Card {
	
	// The two main characteristics of cards is the suit(diamonds, clubs, hearts, spades) and the rank (ace - king)
	private int suit;
	private int rank;
	
	public Card(int rank, int suit) {
		this.rank = rank;
		this.suit = suit;
	}
	
    public int getSuit() {
        return suit;
    }

    public int getRank() {
        return rank;
    }
	
    // We can use integers to store types of suits
    public final static int DIAMONDS = 1;
    public final static int CLUBS = 2;
    public final static int HEARTS = 3;
    public final static int SPADES = 4;

    // Similarly, we can use integers to store the rank
    public final static int ACE = 1;
    public final static int TWO = 2;
    public final static int THREE = 3;
    public final static int FOUR = 4;
    public final static int FIVE = 5;
    public final static int SIX = 6;
    public final static int SEVEN = 7;
    public final static int EIGHT = 8;
    public final static int NINE = 9;
    public final static int TEN = 10;
    public final static int JACK = 11;
    public final static int QUEEN = 12;
    public final static int KING  = 13;
    
    public static String rankToString(int rank) {
        switch (rank) {
        case ACE:
            return "Ace";
        case TWO:
            return "Two";
        case THREE:
            return "Three";
        case FOUR:
            return "Four";
        case FIVE:
            return "Five";
        case SIX:
            return "Six";
        case SEVEN:
            return "Seven";
        case EIGHT:
            return "Eight";
        case NINE:
            return "Nine";
        case TEN:
            return "Ten";
        case JACK:
            return "Jack";
        case QUEEN:
            return "Queen";
        case KING:
            return "King";
        default:
            return null;
        }    
    }
    
    public static String suitToString(int suit) {
        switch (suit) {
        case DIAMONDS:
            return "Diamonds";
        case CLUBS:
            return "Clubs";
        case HEARTS:
            return "Hearts";
        case SPADES:
            return "Spades";
        default:
            return null;
        }    
    }
    // Method that neatly puts a card into string format (i.e. Card(1,4) => "Ace of Spades")
    public String cardName() {
    	return rankToString(getRank()) + " of " + suitToString(getSuit());
    }
}
