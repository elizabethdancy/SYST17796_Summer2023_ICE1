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
 * Student Name: Princekumar Rajput
 * Student Number: 991698363
 * Date Modified: 24th May, 2023
 *
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card random = new Card();
            random.setValue(Card.generateRandomValue());
            random.setSuit(Card.generateRandomSuit());
            magicHand[i] = random;
        }

        // Ask the user for Card value and suit
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of your card (1-13): ");
        int valueOfUser = input.nextInt();
        System.out.print("Enter the suit of your card (Hearts, Diamonds, Spades, Clubs): ");
        String userSuit = input.next();

        // Create the user's card
        Card userCard = new Card();
        userCard.setValue(valueOfUser);
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
            System.out.println("Congratulations! Your card is in the magic hand.");
        } else {
            System.out.println("Sorry! Your card is not in the magic hand.");
        }

        // Create the lucky card
        Card luckyCard = Card.createLuckyCard();

        // Search magicHand for the lucky card
        found = false;
        for (Card card : magicHand) {
            if (card.getValue() == luckyCard.getValue() && card.getSuit().equalsIgnoreCase(luckyCard.getSuit())) {
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
