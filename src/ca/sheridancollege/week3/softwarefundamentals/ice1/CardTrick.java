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
 * @modifier Anush
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Random rand = new Random();
        
        boolean matched = false;
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(rand.nextInt(13)+1);
            c.setSuit(Card.SUITS[rand.nextInt(4)]);
            magicHand[i]=c;
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        Card cards = new Card();
        cards.setValue(5);
        cards.setSuit("Hearts");
        
        for(int i=0; i<magicHand.length; i++){
            if(magicHand[i].equals(cards)){
                matched=true;
                break;
            }
        }
        
        if(matched){
            System.out.println("The card was in the magic hand.");
        }
        else{
            System.out.println("The card was not in the magic hand.");
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    
}
