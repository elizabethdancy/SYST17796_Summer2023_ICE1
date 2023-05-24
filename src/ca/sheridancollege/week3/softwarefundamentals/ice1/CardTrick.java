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
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
             Random random = new Random();
            c.setValue(random.nextInt(13)+1);
            c.setSuit(Card.SUITS[random.nextInt(4)]);
            magicHand[i]=c;
        }
        Card luckyCard = new Card();
        luckyCard.setValue(7);
        luckyCard.setSuit("Spade");
        
        boolean found =false;
        for(int i=0; i<magicHand.length;i++){
            Card card = magicHand[i];
            if(card.getValue()== luckyCard.getValue()&& card.getSuit().equalsIgnoreCase(luckyCard.getSuit())){
                found = true;
                break;
            }
        }
        if (found){
            System.out.println("you found the lucky card");
        }else{
            System.out.println("lucky card is not in the magic hand");
            
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    
}
