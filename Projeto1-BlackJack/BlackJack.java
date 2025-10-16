import java.util.Scanner;
import java.util.ArrayList;

public class BlackJack {

    // supposing that max is 7
    public static int maxPlayers = 7;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DeckOfCards deck = new DeckOfCards();
        deck.shuffle();


        System.out.println("--- Wellcome to BlackJack! ---\n");
        int qntPlayers = 0;

        while((qntPlayers < 1 || qntPlayers > maxPlayers)) {
            System.out.printf("How many players(1-%d)? ", maxPlayers);
            qntPlayers = scanner.nextInt();
        }
        scanner.nextLine(); // remove /n of nextInt

        Player[] players = new Player[qntPlayers];

        for(int i = 0; i < qntPlayers; i++) {
            System.out.printf("Name of player[%d]: ", i + 1);
            String namePlayer = scanner.nextLine();
            players[i] = new Player(namePlayer);
            players[i].addCardToHand(deck.dealCard(), players[i].getHand());
            players[i].addCardToHand(deck.dealCard(), players[i].getHand());

            players[i].displayHand(players[i].getHand());

            // LOOP FOR EACH PLAYER
            String split = "";
            // if both cards equals, you can split and make two games
            // if player decides to split, normal hand will contain first card, and the second hand will contain second card
            if (players[i].getHand().get(0).getFace().equals(players[i].getHand().get(1).getFace())) {
                while (!split.equalsIgnoreCase("y") && !split.equalsIgnoreCase("n")) {
                    System.out.print("Do you wanna split your game(y/n)?");
                    split = scanner.nextLine();
                }

                if (split.equalsIgnoreCase("y")) {
                    // Splitted hand gets the second card and deleted by normal hand
                    players[i].addCardToHand(players[i].getHand().get(1), players[i].getSplittedHand());
                    players[i].getHand().remove(1);

                    // deal one more car to each hand
                    players[i].addCardToHand(deck.dealCard(), players[i].getSplittedHand());
                    players[i].addCardToHand(deck.dealCard(), players[i].getHand());

                    System.out.printf("First Hand: %s\t", players[i].getHand());
                    System.out.printf("Second Hand: %s\n", players[i].getSplittedHand());
                }
            }
        }

        System.out.println();

        // Objects
        Dealer dealer = new Dealer();
        // Dealing the cards
        // We can use this method because dealer class extends player
        dealer.addCardToHand(deck.dealCard(), dealer.getHand());
        dealer.addCardToHand(deck.dealCard(), dealer.getHand());

        // Show dealer's first card
        dealer.displayInitialHand();
        System.out.println();

        // Player's turn
        for (int i = 0; i < qntPlayers; i++) {
            playerTurn(players[i], deck, scanner);
        }

        // Dealer's Turn
        dealerTurn(dealer, deck);

        // Determine the winner
        determineWinner(players, dealer, qntPlayers);

        scanner.close();
    }

    // playerTurn
    public static void playerTurn(Player player, DeckOfCards deck, Scanner scanner) {
        System.out.printf("--- %s'S TURN ---\n", player.getName().toUpperCase());

        System.out.println("Playing first hand:");
        playSingleHand(player, player.getHand(), deck, scanner);

        // If second hand
        if (!player.getSplittedHand().isEmpty()) {
            System.out.println("\nPlaying second hand:");
            playSingleHand(player, player.getSplittedHand(), deck, scanner);
        }

        System.out.println("\n--- FINAL HANDS FOR " + player.getName().toUpperCase() + " ---");
        player.displayHand(player.getHand());
        if (!player.getSplittedHand().isEmpty()) {
            player.displayHand(player.getSplittedHand());
        }
        System.out.println("-------------------\n");
    }

    public static void dealerTurn(Dealer dealer, DeckOfCards deck) {
        System.out.println("--- DEALER'S TURN ---");
        // while true, keep getting cards
        while (dealer.shouldHit()) {
            System.out.println("Dealer hits...");
            dealer.addCardToHand(deck.dealCard(), dealer.getHand());
        }
        dealer.displayHand(dealer.getHand());
        System.out.println("---------------------\n");
    }

    public static void determineWinner(Player[] players, Dealer dealer, int qntPlayers) {
        System.out.println("--- FINAL RESULTS ---");

        for (int i = 0; i < qntPlayers; i++) {
            players[i].displayHand(players[i].getHand());
            if (!players[i].getSplittedHand().isEmpty()) {
                players[i].displayHand(players[i].getSplittedHand());
            }
        }

        dealer.displayHand(dealer.getHand());
        System.out.println("---------------------\n");

        int dealerValue = dealer.getHandValue(dealer.getHand());
        // Getting values of the players and comparing it to dealer
        for (int i = 0; i < qntPlayers; i++) {
            if (players[i].getHandValue(players[i].getHand()) > 21) {
                System.out.printf("%s busted! Dealer wins.\n", players[i].getName());
            } else if (dealerValue > 21) {
                System.out.printf("Dealer busted! %s win!\n", players[i].getName());
            } else if (players[i].getHandValue(players[i].getHand()) > dealerValue) {
                System.out.printf("%s wins!\n", players[i].getName());
            } else if (dealerValue > players[i].getHandValue(players[i].getHand())) {
                System.out.printf("Sorry %s, but Dealer wins.\n", players[i].getName());
            } else {
                System.out.printf("It's a push(tie), %s\n", players[i].getName());
            }

            if (!players[i].getSplittedHand().isEmpty()) {
                System.out.print("For the second hand:   ");
                if (players[i].getHandValue(players[i].getSplittedHand()) > 21) {
                    System.out.printf("%s busted! Dealer wins.\n", players[i].getName());
                } else if (dealerValue > 21) {
                    System.out.printf("Dealer busted! %s win!\n", players[i].getName());
                } else if (players[i].getHandValue(players[i].getSplittedHand()) > dealerValue) {
                    System.out.printf("%s wins!\n", players[i].getName());
                } else if (dealerValue > players[i].getHandValue(players[i].getSplittedHand())) {
                    System.out.printf("Sorry %s, but Dealer wins.\n", players[i].getName());
                } else {
                    System.out.printf("It's a push(tie), %s\n", players[i].getName());
                }
            }
        }
    }

    // Better Organization
    public static void playSingleHand(Player player, ArrayList<Card> hand, DeckOfCards deck, Scanner scanner) {
        while (true) {
            player.displayHand(hand);
            int handValue = player.getHandValue(hand);

            if (handValue >= 21) {
                if (handValue == 21) {
                    System.out.println("BlackJack!");
                }
                break;
            }

            String userInput = "";
            while (!userInput.equalsIgnoreCase("y") && !userInput.equalsIgnoreCase("n")) {
                System.out.print("Do you want another card? (y/n): ");
                userInput = scanner.nextLine();
            }

            if (userInput.equalsIgnoreCase("y")) {
                player.addCardToHand(deck.dealCard(), hand);
            } else {
                break;
            }
        }
    }
}