/*
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
 * Student Name: Nirmit Premsharan Thakkar
 * Student Number: 991699285
 * Date Modified: 24th May, 2023
 * @author dancye
 */
public class CardTrick
{

    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(Card.generateRandomValue());
            c.setSuit(Card.generateRandomSuit());
            magicHand[i] = c;
        }

        // Ask the user for Card value and suit
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of your card (1-13): ");
        int userValue = scanner.nextInt();
        System.out.print("Please enter the suit of your card (Hearts, Diamonds, Spades, Clubs): ");
        String userSuit = scanner.next();

        // Create the user's card
        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(userSuit);

        // Search magicHand for the user's card
        boolean found = false;
        for (Card card : magicHand)
        {
            if (card.getValue() == userCard.getValue() && card.getSuit().equalsIgnoreCase(userCard.getSuit()))
            {
                found = true;
                break;
            }
        }

        // Report the result
        if (found)
        {
            System.out.println("Congrats! Your card is in the magic hand.");
        } else
        {
            System.out.println("Sorry! Your card is not in the magic hand. Try again next time.");
        }

        // Create a lucky card
        Card luckyCard = new Card();
        luckyCard.setValue(1);
        luckyCard.setSuit("Diamonds");

        // Replace the userCard with the luckyCard
        userCard = luckyCard;

        // Search magicHand for the lucky card
        found = false;
        for (Card card : magicHand)
        {
            if (card.getValue() == userCard.getValue() && card.getSuit().equalsIgnoreCase(userCard.getSuit()))
            {
                found = true;
                break;
            }
        }

        // Report the result for the lucky card search
        if (found)
        {
            System.out.println("Congratulations! Lucky card found in the magic hand.");
        }
        else
        {
            System.out.println("Sorry! Lucky card not found.");
        }
    }
}