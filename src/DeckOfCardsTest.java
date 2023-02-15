package src;

public class DeckOfCardsTest
{
    public static void main(
            String[] args)
    {
        DeckOfCards myDeckOfCards = new DeckOfCards();
        myDeckOfCards.shuffle(); //place the cards in random order

        //print all 52  Cards in the prder in which they are dealt
        for(int i = 1; i<=52; i++)
        {
            //deal and display card
            System.out.printf("%-19s", myDeckOfCards.dealCard());

            if(i % 4 == 0) //output a newline after every fourth card
                System.out.println();
        }
    }
} //end class DeckOFCardsTest