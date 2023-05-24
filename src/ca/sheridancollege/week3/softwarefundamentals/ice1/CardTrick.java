/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Scanner;
import java.util.Random;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random rand = new Random();
        int randomValue = rand.nextInt(13) + 1;
        int randomSuit = rand.nextInt(4);
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(randomValue);
            c.setSuit(Card.SUITS[randomSuit]);
            magicHand[i]=c;
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        randomValue = rand.nextInt(13) + 1;
        randomSuit = rand.nextInt(4);
        }
        
        Scanner scan = new Scanner(System.in);  
        System.out.println("Enter card value");
        int userValue = scan.nextInt();
        System.out.println("Enter suit you want to pick up");
        int userSuitIndex = scan.nextInt();
        
        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(Card.SUITS[userSuitIndex]);
        
        
        boolean found = false;
        
        
        for(int i = 0; i<magicHand.length;i++){
            if(magicHand[i].getValue() == userCard.getValue() && magicHand[i].getSuit().equals(userCard.getSuit())){
                found = true;
                break;
                
            }
        }
        if(found){
            System.out.println("Your card is in the magic hand!");
        }else{
            System.out.println("Your card is not in the magic hand");
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    
}
