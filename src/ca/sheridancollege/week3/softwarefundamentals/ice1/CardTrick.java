/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Random;
import java.util.Scanner;
/**
  A class that fills a magic hand of 7 cards with random Card Objects
  and then asks the user to pick a card and searches the array of cards
  for the match to the user's card. To be used as starting code in ICE 1
  @author dancye
  @modifer AnuragReddyYelka id - 991706133
  **/
 
public class CardTrick {
    
    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Random rand = new Random();
        
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(rand.nextInt(13) + 1);
            c.setSuit(Card.SUITS[rand.nextInt(4)]);
            magicHand[i] = c;
        }
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of the card (1-13): ");
        int value = input.nextInt();
        System.out.print("Enter the suit of the card (0-3): ");
        int suit = input.nextInt();
        
        Card userCard = new Card();
        userCard.setValue(value);
        userCard.setSuit(Card.SUITS[suit]);
        Card hardcodedLuckyCard = new Card();
        hardcodedLuckyCard.setValue(7); 
        hardcodedLuckyCard.setSuit("Diamonds");
      
        boolean found = false;
        for (Card card : magicHand) {
            if (card.equals(userCard)) {
                found = true;
                break;
            }
        }
        
        if (found) {
            System.out.println("Your card is in the magic hand!");
        } else {
            System.out.println("Your card is not in the magic hand.");
        }
    }
    
}
