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
 * @modifier HarjotSingh 
 */


public class CardTrick {
    
    public static void main(String[] args){
            Random rand =new Random();
            Scanner scan=new Scanner(System.in);
            
            boolean matched=false;
    
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(rand.nextInt(13)+1);
            
            c.setSuit(Card.SUITS[rand.nextInt(4)]);
            magicHand[i]=c;
        }
        System.out.println("Enter the value of your card");
        int value=scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the suit of your card");
        String suit=scan.nextLine();
        Card cards=new Card();
        cards.setValue(value);
        cards.setSuit(suit);
        
        for (Card magicHand1 : magicHand) {
            if (magicHand1.equals(cards)) {
                matched=true;
                break;
            }
        }
   
        if(matched){
            System.out.println("The Card was in the magic hand");
        }
        else{
            System.out.println("The card was not in the magic hand");
        }
        
       
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    }  

