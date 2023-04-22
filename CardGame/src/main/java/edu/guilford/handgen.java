package edu.guilford;

import java.util.Random;

public class handgen {
    //attributes for a game of blackjack
    private int hand;
    private int card1;
    private int card2;
    private int card3;
    //method to generate a random hand
    public void generateHand() {
        Random rand = new Random();
        int hand = rand.nextInt(3);
        if (hand == 0) {
            card1 = rand.nextInt(10) + 1;
            card2 = rand.nextInt(10) + 1;
            card3 = rand.nextInt(10) + 1;
        }
        else if (hand == 1) {
            card1 = rand.nextInt(10) + 1;
            card2 = rand.nextInt(10) + 1;
            card3 = 0;
        }
        else if (hand == 2) {
            card1 = rand.nextInt(10) + 1;
            card2 = 0;
            card3 = 0;
        }
    }
    //method to get card 1
    public int getCard1() {
        return card1;
    }
    //method to get card 2
    public int getCard2() {
        return card2;
    }
    //method to get card 3
    public int getCard3() {
        return card3;
    }
    



}
