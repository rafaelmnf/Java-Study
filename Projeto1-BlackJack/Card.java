public class Card 
{
    private final String face; // face of card ("Ace", "Deuce", ...)
    private final String suit; // suit of card ("Hearts", "Diamonds", ...)
    private final int value; // value of a card (1,2,3...10)

   // two-argument constructor initializes card's face and suit
   public Card(String face, String suit, int value)
   {
      this.face = face;
      this.suit = suit;
      this.value = value;
   }

    public String getFace() {
        return face;
    }

    public String getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }

   // return String representation of Card
   public String toString() 
   { 
      return face + " of " + suit;
   } 
} // end class Card