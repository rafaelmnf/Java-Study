import java.security.SecureRandom;

public class DeckOfCards
{
   private Card[] deck; // array of Card objects
   private int currentCard; // INDEX of next Card to be dealt (0-51)
   private static final int NUMBER_OF_CARDS = 52; // constant # of Cards

   private static final SecureRandom randomNumbers = new SecureRandom(); // random number generator

   // constructor fills deck of Cards
   public DeckOfCards()
   {
      String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six",
         "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
      String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

      deck = new Card[NUMBER_OF_CARDS]; // create array of 52 Card objects
      currentCard = 0; // first Card dealt will be deck[0]

      // populate deck with Card objects -> with all cards organized
      for (int count = 0; count < deck.length; count++) {
          String face = faces[count % 13];
          String suit = suits[count / 13];
          // divided by 13 because we have 13 faces, so we initialize every face with which suit.

          int value;
          if (count % 13 < 9)         // 0–8 → Ace to Nine
              value = count % 13 + 1; // 1–9
          else                        // 10, J, Q, K → 10
              value = 10;

          deck[count] = new Card(face, suit, value); // create a Card for each space of the Array
      }

   }


   // shuffle deck of Cards with one-pass algorithm
   public void shuffle()
   {
      // next call to method dealCard should start at deck[0] again
      currentCard = 0; 

      // for each Card, pick another random Card (0-51) and swap them
      for (int first = 0; first < deck.length; first++) 
      {
         // select a random number between 0 and 51 
         int second =  randomNumbers.nextInt(NUMBER_OF_CARDS);
         
         // swap current Card with randomly selected Card
         Card temp = deck[first];        
         deck[first] = deck[second];   
         deck[second] = temp;            
      } 
   } 

   // deal one Card
   public Card dealCard()
   {
      // determine whether Cards remain to be dealt
      if (currentCard < deck.length)
         return deck[currentCard++];
          // This is using post-increment (x++), which means: The expression returns the current value of currentCard.
          // Then it increments currentCard by 1 after using it. So, the first one is 0
          // Same as Card c = deck[currentCard]; currentCard++; return c;
      else        
         return null; // return null to indicate that all Cards were dealt
   }
} // end class DeckOfCards