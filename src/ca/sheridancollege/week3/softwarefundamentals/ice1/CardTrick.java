package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * @modifier ajay jesa odedara ID - 991700418
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Random random = new Random();

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(random.nextInt(13) + 1);
            c.setSuit(Card.SUITS[random.nextInt(4)]);
            magicHand[i] = c;
        }

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of your lucky card (1-13):");
        int luckyValue = input.nextInt();

        input.nextLine(); // Consume the newline character

        System.out.println("Enter the suit of your lucky card (Hearts, Diamonds, Spades, Clubs):");
        String luckySuit = input.nextLine();

        Card luckyCard = new Card();
        luckyCard.setValue(luckyValue);
        luckyCard.setSuit(luckySuit);
        
         // Hard-coded lucky card
        Card hardcodedLuckyCard = new Card();
        hardcodedLuckyCard.setValue(7); // Choose any card number you desire
        hardcodedLuckyCard.setSuit("Diamonds"); // Choose any suit you desire

        boolean found = false;
        for (Card card : magicHand) {
            if (card.getValue() == luckyCard.getValue() && card.getSuit().equalsIgnoreCase(luckyCard.getSuit())) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Your lucky card is in the magic hand!");
        } else {
            System.out.println("Your lucky card is not in the magic hand.");
        }
    }
}
