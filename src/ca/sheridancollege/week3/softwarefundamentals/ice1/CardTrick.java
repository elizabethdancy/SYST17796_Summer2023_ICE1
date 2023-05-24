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
        
        Card userCard = new Card();       
        int userValue = 0;
        int userSuit = 0;
        
        boolean repeat = true;
        while(repeat){
            try{
                System.out.print("Enter the value of your card: ");
                userValue = sc.nextInt();
                if(userValue <= 0 || userValue > 13){
                    throw new Exception("Value should be between 1 and 13");
                }
                repeat = false;
            }catch(Exception e){
                System.out.println(e);
                sc.nextLine();
            }
        }
        
        repeat = true;
        while(repeat){
            try{
                System.out.print("Enter your suit(0 = Hearts, 1 = Diamonds, 2 = Spades, 3 = Clubs): ");
                userSuit = sc.nextInt();
                if(userSuit < 0 || userSuit > 3 ){
                    throw new Exception("Not a valid selection");
                }
                repeat = false;
            }catch(Exception e){
                System.out.println(e);
                sc.nextLine();
            }
        }      
        userCard.setValue(userValue);
        userCard.setSuit(Card.SUITS[userSuit]);
        
        boolean existsInMagicHand = false;
        
        for(Card i: magicHand){
            if(userCard.getValue() == i.getValue() && userCard.getSuit().equals(i.getSuit())){
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
