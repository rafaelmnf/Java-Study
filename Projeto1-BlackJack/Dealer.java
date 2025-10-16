public class Dealer extends Player {

    // The Dealer constructor calls the Player constructor with the name "Dealer".
    public Dealer() {
        super("Dealer"); // "super" executes the constructor of the father class (Player)
    }

    // Dealer's behavior of showing one card and hiding the other
    public void displayInitialHand() {
        System.out.println("Dealer's hand: " + getHand().get(0) + " | [Hidden Card]");
    }


    public boolean shouldHit() {
        return getHandValue(getHand()) < 17;
        // returns true or false depending if handValue is lower or bigger than 17
    }
}
