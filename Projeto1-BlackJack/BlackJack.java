import java.util.Scanner;

public class BlackJack {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DeckOfCards deck = new DeckOfCards();
        deck.shuffle();

        // Objects
        Player player = new Player("Rafael");
        Dealer dealer = new Dealer();

        // Dealing the cards
        // We can use this method because dealer class extends player
        player.addCardToHand(deck.dealCard());
        dealer.addCardToHand(deck.dealCard());
        player.addCardToHand(deck.dealCard());
        dealer.addCardToHand(deck.dealCard());

        System.out.println("--- Wellcome to BlackJack! ---\n");

        // Show dealer's first card
        dealer.displayInitialHand();

        // Player's turn
        playerTurn(player, deck, scanner);

        // Dealer's Turn (only happens if the player didn't bust)
        if (player.getHandValue() <= 21) {
            dealerTurn(dealer, deck);
        }

        // Determine the winner
        determineWinner(player, dealer);

        scanner.close();
    }

    public static void playerTurn(Player player, DeckOfCards deck, Scanner scanner) {
        System.out.println("--- YOUR TURN ---");
        // infinite loop, only stops with break
        while (true) {
            player.displayHand();
            int handValue = player.getHandValue();

            if (handValue >= 21) {
                break;
            }

            System.out.print("Do you want another card? (y/n): ");
            // Ignoring case sensitive
            String userInput = scanner.nextLine();
            if (userInput.equalsIgnoreCase("y")) {
                player.addCardToHand(deck.dealCard());
            } else {
                break;
            }
        }
        System.out.println();
        player.displayHand();
        System.out.println("-------------------\n");
    }

    public static void dealerTurn(Dealer dealer, DeckOfCards deck) {
        System.out.println("--- DEALER'S TURN ---");
        // while true, keep getting cards
        while (dealer.shouldHit()) {
            System.out.println("Dealer hits...");
            dealer.addCardToHand(deck.dealCard());
        }
        dealer.displayHand();
        System.out.println("---------------------\n");
    }

    public static void determineWinner(Player player, Dealer dealer) {
        System.out.println("--- FINAL RESULTS ---");
        player.displayHand();
        dealer.displayHand();

        // Getting those values of player and dealer
        int playerValue = player.getHandValue();
        int dealerValue = dealer.getHandValue();

        if (playerValue > 21) {
            System.out.println("You busted! Dealer wins.");
        } else if (dealerValue > 21) {
            System.out.println("Dealer busted! You win!");
        } else if (playerValue > dealerValue) {
            System.out.println("You win!");
        } else if (dealerValue > playerValue) {
            System.out.println("Dealer wins.");
        } else {
            System.out.println("It's a push (tie).");
        }
    }
}