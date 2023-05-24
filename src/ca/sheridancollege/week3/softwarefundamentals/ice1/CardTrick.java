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
 * @modifier John Fraser 991455478
 */

import java.util.Scanner;
import java.util.Random;
public class CardTrick extends Card{
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        Card[] magicHand = new Card[7];
        Random random = new Random();
        for(int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(random.nextInt(13)+1);
            c.setSuit(Card.SUITS[random.nextInt(4)]);
            magicHand[i] =c;
            
        
            
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
       /* System.out.println("Enter a card number from 1 -13: ");
        int value = input.nextInt();
        input.nextLine();
        System.out.println("Enter card suit: ");
        String suit = input.nextLine();
                
        Card userCard = new Card();
        userCard.setValue(value);
        userCard.setSuit(suit);
         */
        Card luckyCard = new Card();
        luckyCard.setValue(7);
        luckyCard.setSuit(Card.SUITS[1]);
        
       boolean same = false;
    for (int i = 0; i < magicHand.length; i++) {
        if (magicHand[i].equals(luckyCard)) {
            same = true;
            break;
    }
                    
    }
   if (same){
       System.out.println("Lucky card was in the hand!:D");
   }else{
       System.out.println("Lucky card was not in the hand :(.");
   }
    
    }
}
