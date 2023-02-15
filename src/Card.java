package src;

public class Card {
    private final String face; //face of card ("Ace", "Deuce", ...)
    private final String suit; //suit of card ("Hearts", "Diamonds", ...)
    public Card(String cardFace, String cardSuit)
    {
        this.face = cardFace; //Initialize the face of the card
        this.suit = cardSuit; //Initialize the suit of the card
    }

    //Return the String Representation of Card
    public String toString()
    {
        return face + " of " + suit;
    }
}//end class Card
