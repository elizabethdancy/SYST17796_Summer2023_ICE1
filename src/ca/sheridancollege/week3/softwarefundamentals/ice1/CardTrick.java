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
 * @modifier Sandesh Gautam std id : 991706391
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Random randominput = new Random();
        Scanner newInput = new Scanner(System.in);
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            for (int j=0; j<magicHand.length; j++)
            {
                Card c = new Card();
            c.setValue(randominput.nextInt(13) + 1);
            c.setSuit(Card.SUITS[randominput.nextInt(4)]);
            magicHand[i]=c;
            }
        
        
        
        Card luckyCard = new Card();
        int luckyCardValue = 0;
        int luckySuit = 0;
         
        boolean repeat = true;
        while(repeat){
            try{
                System.out.println("Enter the value for card: ");
                luckyCardValue = newInput.nextInt();
                if(luckyCardValue <= 0 || luckyCardValue > 13){
                    throw new Exception("Enter Value between 1 and 13");
                }
                repeat = false;
            }catch(Exception e){
                System.out.println(e);
                newInput.nextLine();
            }
        }
        
        repeat = true;
        while(repeat){
            try{
                System.out.print("Enter the value for suit( 0 = Hearts, 1 = Diamonds, 2 = Spades, 3 = Clubs): ");
                luckySuit = newInput.nextInt();
                if(luckySuit < 0 || luckySuit > 3){
                    throw new Exception("Not a valid selection");
                }
                repeat = false;
            }catch(Exception e){
                System.out.println(e);
                newInput.nextLine();
            }
        }
        
        luckyCard.setValue(luckyCardValue);
        luckyCard.setSuit(Card.SUITS[luckySuit]);
        
        boolean inMagicHand = false;
        
        for(Card card: magicHand)
        {
            if(luckyCard.getValue() == card.getValue() && luckyCard.getSuit().equals(card.getSuit()))
            {
                inMagicHand = true;
                break;
            }
        }
        
        if(inMagicHand)
        {
            System.out.println("Congratulations!!! card is in magic hand...");
        }
        else
        {
            System.out.println("Oops!!! card is not in magic hand...");
        }
    }
  
    }
}

    
