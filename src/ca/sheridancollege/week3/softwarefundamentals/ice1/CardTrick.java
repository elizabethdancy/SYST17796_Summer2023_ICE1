 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * @modifer Rakshit Sapra 991712089
 */


import java.util.Scanner;

public class CardTrick {
    public static final int NUM_CARDS = 7;
    public static final int MAX_CARD_VALUE = 13;
    public static final int NUM_CARD_SUITS = 4;

    public static void main(String[] args) {
        Card[] magicHand = new Card[NUM_CARDS];

        for (int i = 0; i < magicHand.length; i++) {
            Card yourCard = new Card();
            yourCard.setValue((int) (Math.random() * MAX_CARD_VALUE) + 1);
            yourCard.setSuit(Card.SUITS[(int) (Math.random() * NUM_CARD_SUITS)]);
            magicHand[i] = yourCard;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of your card: ");
        int value = scanner.nextInt();
        System.out.print("Enter the suit of your card (0-3): ");
        int suit = scanner.nextInt();
        Card userCard = new Card();
        userCard.setValue(value);
        userCard.setSuit(Card.SUITS[suit]);

        boolean youGotIt = false;
        for (Card card : magicHand) {
            if (card.getValue() == userCard.getValue() && card.getSuit().equals(userCard.getSuit())) {
               youGotIt = true;
                break;
            }
        }

        if (youGotIt) {
            System.out.println("Your card is in the magic hand!lesssgooooooo");
        } else {
            System.out.println("Your card is not in the magic hand.Sorryyy");
        }
    }
}
