public class War
   {
   //  deck and 2 piles
   private CardPile deck;
   private CardPile pile1;
   private CardPile pile2;
   
   
   public War()
      //create deck and piles, add cards to deck, shuffle,split into 2 card piles
      {
      
      deck=new CardPile();
      pile1=new CardPile();
      pile2=new CardPile();
      
      for (int i=0; i<=3; i++)
         {
         for(int j=1; j<=13; j++)
            {
               Card card=new Card(j,i);
               deck.add(card);
            }
          }
       deck.shuffle();
       
       for (int c=0;c<=25;c++)
       {
           pile1.add(deck.getTopCard());
           pile2.add(deck.getTopCard());
       }   
       
       
          
        }
        
    public boolean turn()
      {
        // if either pile isnt empty
        if (pile1.size() !=0 && pile2.size() !=0)
         {
             
            // which has the higher value
            if (pile1.seeTopCard().getValue() > pile2.seeTopCard().getValue())
            {  
               // add the cards to the pile that won, shuffle
               pile1.add(pile1.getTopCard());
               pile1.add(pile2.getTopCard());
               pile1.shuffle();
               
            }
            
            else if (pile1.seeTopCard().getValue() < pile2.seeTopCard().getValue())
            {
               pile2.add(pile1.getTopCard());
               pile2.add(pile2.getTopCard());
               pile2.shuffle();
               
            }   
            
            else
            {
            // separate method
            }
            return true;
            }
            return false;
            }
            
       public void warTime()
            // if a war each player puts 3 cars face down including the match
            {
            Card c1=pile1.getTopCard();
            Card c2=pile1.getTopCard();
            Card c3=pile1.getTopCard();
            Card c4=pile1.getTopCard();
            
            
            Card c5=pile2.getTopCard();
            Card c6=pile2.getTopCard();
            Card c7=pile2.getTopCard();
            Card c8=pile2.getTopCard();
            
            
            if (pile1.seeTopCard().getValue() > pile2.seeTopCard().getValue())
            {
              // add all the cards if pile 1 wins
               pile1.add(c1);
               pile1.add(c2);
               pile1.add(c3);
               pile1.add(c4);
               pile1.add(c5);
               pile1.add(c6);
               pile1.add(c7);
               pile1.add(c8);
               pile1.add(pile1.getTopCard());
               pile1.add(pile2.getTopCard());
               
               pile1.shuffle();
               
            }
            
            else if (pile1.seeTopCard().getValue() < pile2.seeTopCard().getValue())
            {
               pile2.add(c1);
               pile2.add(c2);
               pile2.add(c3);
               pile2.add(c4);
               pile2.add(c5);
               pile2.add(c6);
               pile2.add(c7);
               pile2.add(c8);
               pile2.add(pile1.getTopCard());
               pile2.add(pile2.getTopCard());
               pile2.shuffle();
            }
            
            else
            {
            }
            }
            
            
            
            
           
     // flip card show you the top card without removing it       
    public Card flipCard()
    {
      return pile1.seeTopCard();
    }  
     
    public Card flipCard2()
    {
      return pile2.seeTopCard();
    }  
      
             
    
  
  }           
             
     
   