/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Set;
import java.util.Scanner;
import java.util.Random;


/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * @modified Darsh Vakil
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Card luckyCard = new Card();
        luckyCard.setValue(7); // Set the card number of your choice
        luckyCard.setSuit("Hearts"); // Set the suit of your choice
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(random.nextInt(13) + 1); //generating random integer between 1 and 13
            c.setSuit(Card.SUITS[random.nextInt(4)]); //value between 0 and 3 to choose suit
            magicHand[i] = c;

            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        
        // Ask the user for a card value and suit
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a card value (1-13): ");
        int userValue = input.nextInt();
        System.out.print("Enter a card suit (0-3): ");
        int userSuit = input.nextInt();
        
        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(Card.SUITS[userSuit]);
        
        boolean found = false; //boolean for finding user's card among the set
        for (Card card : magicHand) {
            if (card.equals(userCard)) {
                found = true;
                break;
            }
        }
        
        // reporting the result if card founhd or not
        if (found) {
            System.out.println("Congratulations! Your card is in the magic hand.");
        } else {
            System.out.println("Sorry! Your card is not in the magic hand.");
        }
    }
        
        
    
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    
}
