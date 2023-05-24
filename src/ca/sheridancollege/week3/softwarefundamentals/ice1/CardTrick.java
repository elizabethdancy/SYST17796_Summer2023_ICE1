/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * @modifiedBy Kaitlin Saqui, Student ID: 991723734
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)(Math.random()* (1+12) ) + 1);
            c.setSuit(Card.SUITS[(int)(Math.random() *4)] );
            magicHand[i] = c;
            System.out.println(magicHand[i].getValue() + " " + magicHand[i].getSuit() ); //Print magic hand
        }
        
        //insert new Card object, luckyCard with a suit and value
        Card luckyCard = new Card();
        luckyCard.setValue(2);
        luckyCard.setSuit(Card.SUITS[1]);
        
        boolean isInMagicHand = false;
        // and search magicHand here
        for (int i=0; i<magicHand.length; i++) {
            if ((luckyCard.getValue() == magicHand[i].getValue()) && (luckyCard.getSuit().equals(magicHand[i].getSuit())) ) {
                isInMagicHand = true;
                break;
            }
        }
        //Then report the result here
        if (isInMagicHand) {
            System.out.println("Your card " + luckyCard.getValue() +  " " + luckyCard.getSuit() + " is in the magic hand, great job!");
        }
        else {
             System.out.println("Your card " + luckyCard.getValue() + " " + luckyCard.getSuit() + " was not in the magic hand, try again!");
        }
    }
    
}
