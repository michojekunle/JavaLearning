import java.security.SecureRandom;

public class DeckOfCards {
    private Card[] deck; //Array of card Objects
    private int currentCard; //index of next card to be dealt with (0-51)
    private static final int NUMBER_OF_CARDS = 52; //constant # of cards
    //Random number Generator
    private static final SecureRandom randomNumbers = new SecureRandom();

    //constructor fill deck of Cards
    public DeckOfCards()
    {
        String[] faces = { "Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Nine", "Ten", "Jack", " Queen", " King" };
        String[] suits = { "Hearts", "Duiamonds", "Clubs", "Spades" };

        deck = new Card[NUMBER_OF_CARDS]; //Create an array of card Objects
        currentCard = 0; //first Card dealt with will be deck[0]

        //populate deck with card objects
        for (int count = 0;count< deck.length;count++)
            deck[count] = new Card(faces[count % 13], suits[count / 13]);
    }

    //shuffle deck fo cards with one pass algorithm
    public void shuffle()
    {
        //next call to method dealCard should start at deck[0] again
        currentCard = 0;

        //for each card, pick another random Card(0-51) and swap them
        for (int first = 0; first< deck.length; first++)
        {
            //select random number between 0 and 51
            int second  = randomNumbers.nextInt(NUMBER_OF_CARDS);

            //swap the current Crd with randomly Selected Card
            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
    }

    //deal one card
}
