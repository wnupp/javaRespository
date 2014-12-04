//Bill Nupp
//Cs 110
//Card Class
public class Card 
{
   
   public final static int SPADES = 0;   // Codes for the 4 suits
   public final static int HEARTS = 1;
   public final static int DIAMONDS = 2;
   public final static int CLUBS = 3;
   
   
   public final static int ACE = 1;      // Codes for the non-numeric cards.
   public final static int JACK = 11;    //   Cards 2 through 10 have their 
   public final static int QUEEN = 12;   //   numerical values for their codes.
   public final static int KING = 13;
   
  
   private final int suit; 
   
   
   private final int value;
   
   // default construcotr
   public Card() 
   {
      suit=1;
      value=1;
      
   }
      //create a card
      public Card(int theValue, int theSuit) 
      {
      if (theSuit != SPADES && theSuit != HEARTS && theSuit != DIAMONDS && 
            theSuit != CLUBS)
         throw new IllegalArgumentException("Illegal playing card suit");
      if ((theValue < 1 || theValue > 13))
         throw new IllegalArgumentException("Illegal playing card value");
      value = theValue;
      suit = theSuit;
      }

   /**
    * Returns the suit of this card.
    * @returns the suit, which is one of the constants Card.SPADES, 
    * Card.HEARTS, Card.DIAMONDS, Card.CLUBS,
    */
   public int getSuit()
    {
      return suit;
   }
   
   /**
    * Returns the value of this card.
    * @return the value, which is one of the numbers 1 through 13, inclusive for
    * a regular card,
    */
   public int getValue() 
   {
      return value;
   }
   
 
   public String getSuitAsString() 
   {
      switch ( suit )
       // for the .jpg file
       {
      case SPADES:   return "s";
      case HEARTS:   return "h";
      case DIAMONDS: return "d";
      case CLUBS:    return "c";
      default:       return "s";
      
       }
   
    }
   
   public String getValueAsString() 
   {
      //for the .jpg file
      
         switch ( value ) 
         {
         case 1:   return "ace";
         case 2:   return "2";
         case 3:   return "3";
         case 4:   return "4";
         case 5:   return "5";
         case 6:   return "6";
         case 7:   return "7";
         case 8:   return "8";
         case 9:   return "9";
         case 10:  return "10";
         case 11:  return "jack";
         case 12:  return "queen";
         default:  return "king";
         
      }
   }
   
   
   public String toString() 
   {
      // to String returns the .jpg file
      
         return getValueAsString()+getSuitAsString()+".jpg";
   }
   

} 
