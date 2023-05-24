/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**x
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * @modifier Dipesh Vekariya Student ID:991698745
 */

import java.util.*;

public class CardTrick {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            // c.setValue(insert call to random number generator here)
            c.setValue(rand.nextInt(13) + 1);

            // c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[rand.nextInt(4)]);

            magicHand[i] = c;
        }
        // insert code to ask the user for Card value and suit, create their card
        System.out.println("Enter card value (1-13):");
        int number = sc.nextInt();
        System.out.println("Enter card suit number (0-3):");
        int suit = sc.nextInt();

        Card userCard = new Card();
        userCard.setValue(number);
        userCard.setSuit(Card.SUITS[suit]);

        // and search magicHand here
        boolean found = false;
        for (int i = 0; i < magicHand.length; i++) {
            if (magicHand[i].getValue() == userCard.getValue() && magicHand[i].getSuit().equals(userCard.getSuit())) {
                found = true;
                break;
            }
        }

        // Then report the result here
        if (found == true) {
            System.out.println("Your card is in the magic hand!");
        } else {
            System.out.println("Your card is not in the magic hand.");
        }
    }

}
