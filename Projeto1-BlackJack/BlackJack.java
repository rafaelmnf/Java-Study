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
      
      // print all 52 Cards in the order in which they are dealt
       /*
      for (int i = 1; i <= 52; i++)
      {
         // deal and display a Card
         System.out.printf("%-19s", myDeckOfCards.dealCard());

		 if (i % 4 == 0) // output a newline after every fourth card
		    System.out.println();
      }
       */

       System.out.printf("Your cards: %s and %s\n", myDeckOfCards.dealCard(), myDeckOfCards.dealCard());
       System.out.println("Do you want to another one? ");
       // A do-while loop to repeat the prompt until valid input is received
       do {
           System.out.print("Please enter 'y' or 'n': ");
           userInput = scanner.nextLine();

           // Check if the input is not 's' or 'n', ignoring caseSensitive
           if (!userInput.equalsIgnoreCase("s") && !userInput.equalsIgnoreCase("n")) {
               System.out.println("Invalid input. Please try again.");
           }
       } while (!userInput.equalsIgnoreCase("s") && !userInput.equalsIgnoreCase("n"));

        if(userInput.equals("s")) {

        } else {

        }



       scanner.close();
   } 
} // end class DeckOfCardsTest
