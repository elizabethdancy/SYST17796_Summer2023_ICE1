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
 * @modified by Arshvir Singh (Student id: 991709700)
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for(int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)(Math.random() * 13) + 1);
            c.setSuit(Card.SUITS[(int) (Math.random() * 4)]);
            magicHand[i] = c;
            
        }
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the card value from 1-13: ");
        int userValue = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your card suit (Hearts, Diamonds, Spades, Clubs): ");
        String userSuit = sc.nextLine();   
        
        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(userSuit);
        boolean isMagicHand = false;
        
         for (int i = 0; i < magicHand.length; i++) {
            if (magicHand[i].getSuit().equals(userCard.getSuit()) && magicHand[i].getValue() == userCard.getValue()) {
                isMagicHand = true;
                break;
            }
        }
         
      if(isMagicHand){
          System.out.println("Your card was in Magic Hand !");
      }
        else {
            System.out.println("Your card was not in the Magic Hand.");
        }
      
    
}
}
