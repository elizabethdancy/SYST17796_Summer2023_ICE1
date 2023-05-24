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
 * @modifier Vraj Contractor 
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

    // Create your lucky card with chosen number and suit
    Card luckyCard = new Card();
    luckyCard.setValue(7);  // Replace 7 with your chosen card number
    luckyCard.setSuit("Hearts");  // Replace "Hearts" with your chosen card suit

    boolean found = false;
    for (Card card : magicHand) {
        if (card.equals(luckyCard)) {
            found = true;
            break;
        }
    }

    if (found) {
        System.out.println("Your card is in the magic hand!");
    } else {
        System.out.println("Your card is not in the magic hand.");
    }
}

    
}
