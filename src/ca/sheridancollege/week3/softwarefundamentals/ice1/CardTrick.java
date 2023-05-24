/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.*;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * @modifier Divya Luther ID: 991679453;*/

public class CardTrick {
    
    public static void main(String[] args)
    {
        
        Card[] magicHand = new Card[7];
        Random rand = new Random();
        
        
        for (int i=0; i<magicHand.length; i++)
        {
           
            Card c = new Card();
            
            c.setValue(rand.nextInt(13)+1);
            c.setSuit(Card.SUITS[(rand.nextInt(3))+1]);
            magicHand[i]= c;
            
        }
        
        
       Card luckyCard = new Card();
        luckyCard.setValue(5);
        luckyCard.setSuit("Hearts");
        
        
        
        boolean flag = false;
        for (int i=0; i<magicHand.length; i++) {
            if ( luckyCard.getValue() == magicHand[i].getValue() && luckyCard.getSuit().equals(magicHand[i].getSuit()) ) {
                    flag=true;
                    break;
                    }
                }
        
   
        
        if (flag==true)
            System.out.println("Your card is in the Magic Hand: ");
        if (flag== false) 
            System.out.println("Your card is not in the Magic Hand: ");
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    
}
