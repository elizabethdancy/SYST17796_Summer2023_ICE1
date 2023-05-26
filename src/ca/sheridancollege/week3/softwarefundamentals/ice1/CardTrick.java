import java.util.Random;
import java.util.Scanner;
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
 */
import card.Card;
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (Card magicHand1 : magicHand) {
            Card one = new Card();
            Random random = new Random();
            one.setValue(random.nextInt(13)+1);
            int random1 = random.nextInt(4);
            one.setSuit(Card.SUITS[random1]);
            
            Card two = new Card();
            two.setValue(random.nextInt(13)+1);
            int random2 = random.nextInt(4);
            two.setSuit(Card.SUITS[random2]);
            
            Card three = new Card();
            three.setValue(random.nextInt(13)+1);
            int random3 = random.nextInt(4);
            three.setSuit(Card.SUITS[random3]);
            
            Card four = new Card();
            four.setValue(random.nextInt(13)+1);
            int random4 = random.nextInt(4);
            four.setSuit(Card.SUITS[random4]);
            
            Card five = new Card();
            five.setValue(random.nextInt(13)+1);
            int random5 = random.nextInt(4);
            five.setSuit(Card.SUITS[random5]);
            
            Card six = new Card();
            six.setValue(random.nextInt(13)+1);
            int random6 = random.nextInt(4);
            six.setSuit(Card.SUITS[random6]);
            
            Card seven = new Card();
            seven.setValue(random.nextInt(13)+1);
            int random7 = random.nextInt(4);
            seven.setSuit(Card.SUITS[random7]);
//c.setValue(insert call to random number generator here)
//c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the card value (1-13): ");
        int cardValue = scanner.nextInt();
        
        System.out.print("Enter the card suit (Spades, Hearts, Diamonds, Clubs): ");
        String cardSuit = scanner.next();
        
        Card userCard = new Card();
        userCard.setValue(cardValue);
        userCard.setSuit(cardSuit);
        
        boolean found = false;
        for (Card card : magicHand){
            if(Card.equals(userCard)){
                found = true;
                break;
            }
        }
        
        if (found) {
            System.out.println("Congratulations! Your card is in the magic hand.");
        } else {
            System.out.println("Sorry, Your card is not in the magic hand.");
        }
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    
}

