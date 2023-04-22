package edu.guilford;

/**
 * Hello world!
 *
 */
import java.util.Random;
public class App 
{
       

    public static void main( String[] args )
    {
    //make a loop to run the game 5 times and save the results to an array

        



   

        int n = 0;
    String[] playerwins = new String[5];
        handgen dealer = new handgen();
        handgen player = new handgen();
        int index = 0;
        while (n < 5){
        dealer.generateHand();
        player.generateHand();
        //call to set dealer and player cards
        int dealerCard1 = dealer.getCard1();
        int dealerCard2 = dealer.getCard2();
        int dealerCard3 = dealer.getCard3();
        int playerCard1 = player.getCard1();
        int playerCard2 = player.getCard2();
        int playerCard3 = player.getCard3();
        
        //call to set dealer and player totals
        int dealerTotal = dealerCard1 + dealerCard2 + dealerCard3;
        int playerTotal = playerCard1 + playerCard2 + playerCard3;
        //call to set dealer and player busts
        boolean dealerBust = dealerTotal > 21;
        boolean playerBust = playerTotal > 21;
        //call to set dealer and player wins
        boolean dealerWin = dealerTotal > playerTotal;
        boolean playerWin = playerTotal > dealerTotal;
        //call to set dealer and player ties
        boolean dealerTie = dealerTotal == playerTotal;
        boolean playerTie = playerTotal == dealerTotal;
        

        //save the wins under an array
     
        
        //if statements to determine the winner
        
        System.out.println("Dealer's cards: " + dealerCard1 + " " + dealerCard2 + " " + dealerCard3);
        System.out.println("Player's cards: " + playerCard1 + " " + playerCard2 + " " + playerCard3);
        //print the dealer and player totals
        System.out.println("Dealer's total: " + dealerTotal);
        System.out.println("Player's total: " + playerTotal);

        if (dealerBust && playerBust) {
            System.out.println("Both players bust. No winner.");
            playerwins[index] = "Tie";
        }
        else if (dealerBust) {
            System.out.println("Dealer busts. Player wins.");
            playerwins[index] = "Player";
        }
        else if (playerBust) {
            System.out.println("Player busts. Dealer wins.");
            playerwins[index] = "Dealer";
        }
        else if (dealerWin) {
            System.out.println("Dealer wins.");
            playerwins[index] = "Dealer";
        }
        else if (playerWin) {
            System.out.println("Player wins.");
            playerwins[index] = "Player";

        }
        else if (dealerTie) {
            System.out.println("Dealer and player tie.");
            playerwins[index] = "Tie";
            
        }
        index += 1;
            n += 1;
            
    }

    //toString method to print the array
    System.out.println("Results of the game \n" + java.util.Arrays.toString(playerwins));


        
       

      



    
}
}
