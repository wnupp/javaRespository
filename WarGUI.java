import java.awt.*;
import java.awt.event.*;
import javax.swing.*;




public class WarGUI extends JFrame
{
   private JPanel imagePanel1,imagePanel2,imagePanel3,imagePanel4,imagePanel5,imagePanel6;     // To hold the label
   private JPanel buttonPanel;    // To hold a button
   private JLabel imageLabel1,imageLabel2,imageLabel3,imageLabel4,message1,message2,imageLabel5;     // To show an image
   private JButton button;        // To get an image
   private War game;




   public WarGUI()
   {
     game=new War();
      // Set the title.
      setTitle("War");

      // Specify an action for the close button.
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      //flow layout add all panels and labels
      setLayout(new FlowLayout());
      imagePanel1 = new JPanel();
      imageLabel1 = new JLabel();
      imagePanel2 = new JPanel();
      imageLabel2 = new JLabel();
      imagePanel3 = new JPanel();
      imageLabel3 = new JLabel();
      imagePanel4 = new JPanel();
      imageLabel4 = new JLabel();
      imagePanel6 = new JPanel();
      imageLabel5 = new JLabel();
      buttonPanel = new JPanel();
      message1=new JLabel();
      message2=new JLabel();
      imagePanel5 = new JPanel();
      
      
     
      //add image labels to panels
      imagePanel1.add(imageLabel1);
      imagePanel2.add(imageLabel2);
      imagePanel3.add(imageLabel3);
      imagePanel4.add(imageLabel4);
      imagePanel6.add(imageLabel5);
      
      
      
      
      // create a button that does stuff when you hit it
      button = new JButton("flip");
      button.addActionListener(new ButtonListener());
      add(button);
       
      
     

      
      // get card back jpg
      
      ImageIcon cardBack = new ImageIcon("back.jpg");
         
         
         

         // Display the image in the label.
         imageLabel1.setIcon(cardBack);
         imageLabel4.setIcon(cardBack);
         
         
         

         

         
         

      // Add the panels to the content pane.
      add(imagePanel1);
      add(imagePanel2);
      add(imagePanel6);
      add(imagePanel3);
      add(imagePanel4);
      add(imagePanel5);
      
      
      

      
      
      
   }
   
   private class ButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
      // look at top card from each deck
         Card card= game.flipCard();
         Card card2=game.flipCard2();
         
         
         // get pic of card using to String 
         ImageIcon player1 = new ImageIcon(card.toString());
         
         ImageIcon player2 = new ImageIcon(card2.toString());
         
         // set images
         imageLabel2.setIcon(player1);
         
         imageLabel3.setIcon(player2);
         
         //remove dumb war message
         imagePanel5.remove(message2);
         
         // if card >card
          if (game.flipCard().getValue() > game.flipCard2().getValue())
            {
             // reset text
             imagePanel6.remove(imageLabel5);
             imagePanel5.remove(message1);
             imagePanel5.remove(message2);
             
             // who wins the round
             message1=new JLabel("Player 1 Wins this round");
             // next turn
             game.turn();
               
            }
            
            else if (game.flipCard().getValue() < game.flipCard2().getValue())
            {
              imagePanel6.remove(imageLabel5);
              imagePanel5.remove(message1);
              imagePanel5.remove(message2);
              message1=new JLabel("Player 2 Wins");
              game.turn();
              
            }   
            
            else
            {
            
              
            imagePanel6.remove(imageLabel5);
            imagePanel5.remove(message1);
            imagePanel5.remove(message2);
            message1=new JLabel("War");
            // create a special war image
            ImageIcon warCards = new ImageIcon("war.jpg");
            imageLabel5.setIcon(warCards);
            
            
            // special war method in War that simulates war
            game.warTime();
            
            
            // flip the 4th cardss to see who winds
            Card card3= game.flipCard();
            Card card4=game.flipCard2();
            
            if (game.flipCard().getValue() > game.flipCard2().getValue())
            {
             
             message2=new JLabel("Player 1 Wins");
             game.turn();
               
            }
            
            else if (game.flipCard().getValue() < game.flipCard2().getValue())
            {
              
              message2=new JLabel("Player 2 Wins");
              
              
            }   
               
            
         
             
             imagePanel6.add(imageLabel5);
             
             game.turn();
             
            
            imagePanel5.add(message2);
            }
            
      
         
           imagePanel5.add(message1);
           
           
         
         
         
         

         // Pack the frame again to accomodate the 
         // new size of the label.
         pack();
      }
     }
  
   //driver
   public static void main(String[] args)
   {
      JFrame frame = new WarGUI();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.pack();
      frame.setVisible(true);
   
   }
}
