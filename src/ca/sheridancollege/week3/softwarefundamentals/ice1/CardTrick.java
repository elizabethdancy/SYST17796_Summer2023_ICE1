/*
* this code is modified by Prabhjot Singh Thiara student ID:991721685
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
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card c2 = new Card(2, "Hearts");
  
            
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
             c.setValue((int)(Math.random()*13+1))  ;
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[((int)(Math.random()*3+1))]);
            magicHand[i]=c;
        }
       // first code which was asking user to enter the value 
       
       

//insert code to ask the user for Card value and suit, create their card
//          Scanner sc = new Scanner(System.in);
//          System.out.println("Enter the value for the Card and Suit with s after every suit");
//          String cardValueAndSuit = sc.nextLine();
//          cardValueAndSuit = cardValueAndSuit.replace(" ", "");
//             System.out.println(cardValueAndSuit);
 
        //  and search magicHand here
//         boolean found = false;
//         for (int i = 0; i < magicHand.length; i++) {
//             if (cardValueAndSuit.equalsIgnoreCase(magicHand[i].getValue() + magicHand[i].getSuit())) {
//                found = true;
//                break;
//             }
      
//       }  
        //Then report the result here
//         if(found){
//             System.out.println("Yea! your card is found in our Magic Hand");
//         }
//         else{
//             System.out.println("Nope! your card is found in our Magic Hand");
   
//         }




            // new hard coded object 
            boolean isFound = false;
            for (int i =0; i<magicHand.length;i++){
               if (c2.equals(magicHand[i])) {
                 isFound = true;
                   break;
        }
            }
                if(isFound){
            System.out.println("Yea! your card is found in our Magic Hand");
        }
        else{
            System.out.println("Nope! your card is found in our Magic Hand");
   
        }
                
            
    }
    

  
 }
          
    

