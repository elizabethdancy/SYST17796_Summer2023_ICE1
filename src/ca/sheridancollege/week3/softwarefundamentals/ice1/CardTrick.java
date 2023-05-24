/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 */
public class CardTrick {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(rand.nextInt(13) + 1);
            c.setSuit(Card.SUITS[rand.nextInt(4)]);
            magicHand[i] = c;  // add card to the magic hand
        }

        System.out.println("Pick a card! Enter a value (1-13):");
        int value = input.nextInt();
        System.out.println("Now pick a suit! Enter: Hearts, Diamonds, Spades, or Clubs:");
        String suit = input.next();

        Card userCard = new Card();
        userCard.setValue(value);
        userCard.setSuit(suit);

        boolean found = false;

        for (Card card : magicHand) {
            if (card.getSuit().equals(userCard.getSuit()) && card.getValue() == userCard.getValue()) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Your card was in the magic hand!");
        } else {
            System.out.println("Your card was not found in the magic hand.");
        }
    }

}
