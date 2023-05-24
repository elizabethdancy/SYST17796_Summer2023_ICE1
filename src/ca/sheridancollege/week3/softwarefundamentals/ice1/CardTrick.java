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
 * @ModifiedBy Manpreet Kaur
 * Student ID: 991680973
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)(Math.random()* (1+12) ) + 1);
            c.setSuit((int)(Math.random() *4) );
            magicHand[i] = c;
            
            System.out.println(magicHand[i].getValue() + " " + magicHand[i].getSuit() ); //Print magic hand
        }
        
        //insert code to ask the user for Card value and suit, create their card
        
        Card luckyCard = new Card();
        luckyCard.setValue(1);
        luckyCard.setSuit(1);
        
        // and search magicHand here
        //Then report the result here
        int x = 0;
        for(int i=0; i<magicHand.length; i++)
        {
            if(magicHand[i].equals(luckyCard))
            {
                System.out.println("This Card is present in the hand" );
                x = 1;
                break;
            }
            
        }
        if( x == 0)
        {
            System.out.println("This Card is not present in the Hand");
        }
        
        
    }
    
}
