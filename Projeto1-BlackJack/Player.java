import java.util.ArrayList;

public class Player {
    private final String name;
    private final ArrayList<Card> hand;
    // Player can
    private final ArrayList<Card> splittedHand;
    // Array of Card type to store player's cards
    private int splitted

    // Constructor
    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>(); // hand starts empty
        this.splittedHand = new ArrayList<>();
    }

    // Now we have to specify for which hand would we want to run those methods
    // Adding card to player
    public void addCardToHand(Card card, ArrayList<Card> hand) {
        hand.add(card);
    }

    // getting handValue
    public int getHandValue(ArrayList<Card> hand) {
        int value = 0;
        int aceCount = 0;
        for (Card card : hand) {
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
        System.out.println(" (Value: " + getHandValue(hand) + ")");
        if (!this.splittedHand.isEmpty()) {
            System.out.print(this.name + "'s second hand: ");
            for (Card card : this.splittedHand) {
                System.out.print(card + " | ");
            }
            System.out.println(" (Value: " + getHandValue(splittedHand) + ")");
        }
    }


    public String getName() {
        return this.name;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }
    public ArrayList<Card> getSplittedHand() {
        return splittedHand;
    }

    public void clearHand(ArrayList<Card> hand) { hand.clear(); }
}