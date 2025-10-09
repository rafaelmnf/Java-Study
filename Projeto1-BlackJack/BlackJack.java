import java.util.ArrayList;
import java.util.Scanner;

public class BlackJack
{
   // execute application
   public static void main(String[] args)
   {
       DeckOfCards myDeckOfCards = new DeckOfCards(); // create the deck
       myDeckOfCards.shuffle(); // place Cards in random order

       // for user input
       Scanner scanner = new Scanner(System.in);
       String userInput;

       // Creating an array of Cards called userCards
       ArrayList<Card> userCards = new ArrayList<>();

       int userSum;

       // Game starts giving to user 2 cards
       userCards.add(myDeckOfCards.dealCard());
       userCards.add(myDeckOfCards.dealCard());

       // Main loop for the player's turn
       while (true) { // We use an infinite loop that will be broken internally
           userSum = 0; // RESET the sum each round to recalculate correctly

           System.out.println("-------------------------");
           System.out.print("Your cards are: ");
           for (Card card : userCards) {
               System.out.print(card + " | "); // Shows all the cards
               userSum += card.value; // Recalculates the sum from zero
           }

           System.out.printf("\nYour total sum: %d\n", userSum);

           // Check for end-of-game conditions (bust or 21)
           if (userSum > 21) {
               System.out.println("You busted! Game over.");
               break; // Exit the loop
           }
           if (userSum == 21) {
               System.out.println("Blackjack! You win!");
               break; // Exit the loop
           }

           // Asks the player if they want another card
           // A do-while loop to repeat the prompt until valid input is received
           do {
               System.out.print("Do you want another card? (y/n): ");
               userInput = scanner.nextLine();
               // Checks if the input is not 'y' or 'n', ignoring case
               if (!userInput.equalsIgnoreCase("y") && !userInput.equalsIgnoreCase("n")) {
                   System.out.println("Invalid input. Please enter 'y' or 'n'.");
               }
           } while (!userInput.equalsIgnoreCase("y") && !userInput.equalsIgnoreCase("n"));

           // Logic to hit or stand
           if (userInput.equalsIgnoreCase("y")) {
               Card newCard = myDeckOfCards.dealCard();
               userCards.add(newCard);
               System.out.println("You received a: " + newCard);
           } else { // if user typed "n"
               System.out.println("You stood with " + userSum + ".");
               break; // Exit the loop to end the player's turn
           }
       } // End of while loop

       System.out.println("Player's turn is over.");
       scanner.close();
   } 
} // end class DeckOfCardsTest





// To Study:
/* Differences between array x ArrayList
   Array (faster): Static (fixed). Defined at creation and cannot be changed.
          It can store primitive types (int, double, char) and Objects (String, Card).
        declaration: Type[] name = new Type[size]; Ex: Card[] myDeck = new Card[52];
   ArrayList (slow): Dynamic (flexible). Automatically grows and shrinks when adding/removing elements.
                     Stores ONLY Objects. For primitive types, uses Wrapper Classes (Integer, Double, Character)
        declaration: ArrayList<Type> name = new ArrayList<>(); Ex: ArrayList<Card> playerHand = new ArrayList<>();
        Full of useful methods: .add(), .get(), .remove(), .size(), .clear(), .contains(), etc.

*/
