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
 * modified by Manan Patel  Student ID-991698490
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        String[] suits = { "Hearts", "Diamonds", "Spades", "Clubs" };
        String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

        Card[] magicHand = new Card[7];
        Random rand = new Random();

        for (int i = 0; i < magicHand.length; i++) 
        {
            Card c = new Card();
            c.setValue(rand.nextInt(13) + 1);
            c.setSuit(suits[rand.nextInt(4)]);
            magicHand[i] = c;
        }

        Card luckyCard = new Card();
        luckyCard.setValue(5);
        luckyCard.setSuit("Hearts");

        boolean isfound = false;
        for (int i = 0; i < magicHand.length; i++) 
        {
            if (luckyCard.getValue() == magicHand[i].getValue() && luckyCard.getSuit().equals(magicHand[i].getSuit())) 
            {
                isfound = true;
                break;
            }
        }

        if (isfound) 
        {
            System.out.println("Your card is in the Magic Hand.");
        } 
        else 
        {
            System.out.println("Your card is not in the Magic Hand.");
        }
    }
    
}
