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
        Scanner input = new Scanner(System.in);
        
        Card[] magicHand = new Card[7];
        Random rand = new Random();
        
        
        for (int i=0; i<magicHand.length; i++)
        {
           
            Card c = new Card();
            
            c.setValue(rand.nextInt(13)+1);
            c.setSuit(Card.SUITS[(rand.nextInt(3))+1]);
            magicHand[i]= c;
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        System.out.println(" Please Choose Card(1 13) : ");
        int userCard = input.nextInt();
        System.out.println("Please Choose Suit 1:Heart 2:Spade 3:Diamonds 4:Clubs  ");
        int userSuit = input.nextInt();
        
        boolean flag = false;
        for (int i=0; i<magicHand.length; i++) {
            if ( userCard== magicHand[i].getValue() && Card.SUITS[userSuit].equals(magicHand[i].getSuit()) ) {
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
