/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Random;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 */
public class CardTrick {

    public static void main(String[] args) {
        Random rand = new Random();
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(rand.nextInt(13) + 1);
            c.setSuit(Card.SUITS[rand.nextInt(4)]);
            magicHand[i] = c;  // add card to the magic hand
        }

        Card luckyCard = new Card();
        luckyCard.setValue(8);
        luckyCard.setSuit("Hearts");

        boolean found = false;

        for (Card card : magicHand) {
            if (card.getSuit().equals(luckyCard.getSuit()) && card.getValue() == luckyCard.getValue()) {
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
