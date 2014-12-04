// Bill Nupp
// cs 110
// deck class


/**
 *  An object of type Deck represents a deck of playing cards.  The deck
 *  is a regular poker deck that contains 52 regular cards
 */
public class Deck {

    
    private Card[] deck;

    /**
     * Keeps track of the number of cards that have been dealt from
     * the deck so far.
     */
    private int cardsUsed;

   
    public Deck() 
    {
    }        

    
    
    /**
     * Put all the used cards back into the deck (if any), and
     * shuffle the deck into a random order.
     */
    public void shuffle() 
    {
        for ( int i = deck.length-1; i > 0; i-- ) 
        {
            int rand = (int)(Math.random()*(i+1));
            Card temp = deck[i];
            deck[i] = deck[rand];
            deck[rand] = temp;
        }
        cardsUsed = 0;
    }

    
    public int cardsLeft()
     {
        return deck.length - cardsUsed;
    }

    
    public Card dealCard() 
    {
        if (cardsUsed == deck.length)
            throw new IllegalStateException("No cards are left in the deck.");
        cardsUsed++;
        return deck[cardsUsed - 1];
        
    }

   
} // end class Deck