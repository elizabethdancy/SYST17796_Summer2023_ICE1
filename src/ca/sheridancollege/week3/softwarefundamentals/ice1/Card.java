/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * A class that models playing card Objects. Cards have 
 * a value (note that Ace = 1, Jack -11, Queen =12, King = 13)
 * A suit (clubs, hearts, spades, diamonds).
 * There are 52 cards in a deck, no jokers.
 * This code is to be used in ICE1. When you create your own branch,
 * Student Name: Nirmit Premsharan Thakkar
 * Student Number: 991699285
 * Date Modified: 24th May, 2023
 * @author dancye
 */
public class Card
{

    private String suit; // clubs, spades, diamonds, hearts
    private int value; // 1-13

    public static final String[] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};

    /**
     * @return the suit
     */
    public String getSuit()
    {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit)
    {
        this.suit = suit;
    }

    /**
     * @return the value
     */
    public int getValue()
    {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value)
    {
        this.value = value;
    }

    /**
     * Generates a random card value.
     *
     * @return a random card value between 1 and 13 (inclusive)
     */
    public static int generateRandomValue()
    {
        // Use the Math.random() method to generate a random number between 1 and 13 (inclusive)
        return (int) (Math.random() * 13) + 1;
    }

    /**
     * Generates a random card suit.
     *
     * @return a random card suit from the SUITS array
     */
    public static String generateRandomSuit()
    {
        // Use the Math.random() method to generate a random number between 0 and 3 (inclusive)
        int index = (int) (Math.random() * 4);
        return SUITS[index];
    }
}