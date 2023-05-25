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

 * @author dancye
 ** @modifier Vasu Tevar
 ** @StudentID - #991674095
 ** @Date - 24-05-2023
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(Card.generateRandomValue());
            c.setSuit(Card.generateRandomSuit());
            magicHand[i] = c;
        }

        // Ask the user for Card value and suit
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of your card (1-13): ");
        int userValue = scanner.nextInt();
        System.out.print("Enter the suit of your card - (Hearts, Diamonds, Spades, Clubs): ");
        String userSuit = scanner.next();

        // Create the user's card
        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(userSuit);

        // Search magicHand for the user's card
        boolean found = false;
        for (Card card : magicHand) {
            if (card.getValue() == userCard.getValue() && card.getSuit().equalsIgnoreCase(userCard.getSuit())) {
                found = true;
                break;
            }
        }

        // Report the result
        if (found) {
            System.out.println("Congratulations! Your card consists in magic hand.");
        } else {
            System.out.println("Sorry! Your card doesn't consists in  magic hand.");
        }

        // Create a lucky card
        Card luckyCard = new Card();
        luckyCard.setValue(8);
        luckyCard.setSuit("Diamonds");

        // Replace the userCard with the luckyCard
        userCard = luckyCard;

        // Search magicHand for the lucky card
        found = false;
        for (Card card : magicHand) {
            if (card.getValue() == userCard.getValue() && card.getSuit().equalsIgnoreCase(userCard.getSuit())) {
                found = true;
                break;
            }
        }

        // Report the result for the lucky card search
        if (found) {
            System.out.println("Congratulations! The lucky card is in the magic hand.");
        } else {
            System.out.println("Sorry! The lucky card is not in the magic hand.");
        }
    }
}