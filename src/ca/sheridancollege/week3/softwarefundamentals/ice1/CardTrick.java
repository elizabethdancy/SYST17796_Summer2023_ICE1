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
 * @modifier Azadveer Singh
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            
            int r1= (int)(Math.random()*14)+1;
            int r2= (int)(Math.random()*4);
            //c.setValue(insert call to random number generator here)
            c.setValue(r1);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[r2]);
            
            magicHand[i]=c;
        }
        
        //insert code to ask the user for Card value and suit, create their card
        Scanner scan = new Scanner(System.in);
        System.out.println("enter value of card(1 - 13); ");
        int v = scan.nextInt();
        
        System.out.println("Enter the suit of card: ");
        String s = scan.next();
        
        Card c1 = new Card(v,s);
       
        // and search magicHand here
        int result = -1;
        for (int i=0; i<magicHand.length; i++){
            
            System.out.println(magicHand[i]);
            
            if (magicHand[i]==c1){
                result=0;
            }   
        }
        //Then report the result here
        if(result==0){
            System.out.println("You Won");
        }else{
            System.out.println("you Lost");
        }
    }
    
}
