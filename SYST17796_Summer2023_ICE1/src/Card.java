public class Card {
    private int value;
    private String suit;
    
    public static final String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};
    
    public int getValue() {
        return value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public String getSuit() {
        return suit;
    }
    
    public void setSuit(String suit) {
        this.suit = suit;
    }
}