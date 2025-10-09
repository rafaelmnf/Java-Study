import java.util.ArrayList;

public class Player {
    private final String name;
    private final ArrayList<Card> hand;
    // Array of Card type to store player's cards

    // Constructor
    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>(); // hand starts empty
    }

    // Adding card to player
    public void addCardToHand(Card card) {
        this.hand.add(card);
    }

    // getting handValue
    public int getHandValue() {
        int value = 0;
        int aceCount = 0;
        for (Card card : this.hand) {
            if (card.getFace().equals("Ace")) {
                aceCount++;
            }
            value += card.getValue();
        }

        // while value is lower than 21, keeps one ace with value of 11
        while (aceCount > 0 && value + 10 <= 21) {
            value += 10;
            aceCount--;
        }
        return value;
    }

    // Method to show player's hand
    public void displayHand() {
        System.out.print(this.name + "'s hand: ");
        for (Card card : this.hand) {
            System.out.print(card + " | ");
        }
        System.out.println(" (Value: " + getHandValue() + ")");
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public void clearHand() {
        this.hand.clear();
    }
}