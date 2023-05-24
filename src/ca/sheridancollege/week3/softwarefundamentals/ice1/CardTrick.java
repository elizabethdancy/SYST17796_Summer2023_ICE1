/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * Modified by Aditya Kumar Silwal - 991703219
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++){
            Card c = new Card();
            c.setValue(rand.nextInt(13) + 1);
            c.setSuit(Card.SUITS[rand.nextInt(4)]);
            magicHand[i] = c;
        }
        
        Card luckyCard = new Card();       
        int luckyValue = 7;
        String luckySuit = "Hearts";
        luckyCard.setValue(luckyValue);
        lucky.setSuit(luckySuit);
        
        boolean existsInMagicHand = false;
        
        for(Card i: magicHand){
            if(luckyCard.getValue() == i.getValue() && luckyCard.getSuit().equals(i.getSuit())){
                existsInMagicHand = true;
                break;
            }
        }
        if(existsInMagicHand){
            System.out.println("The card exists in magic hand!");
        }
        else{
            System.out.println("The card doesn't exist in magic hand!");
        }
    }
    
}
