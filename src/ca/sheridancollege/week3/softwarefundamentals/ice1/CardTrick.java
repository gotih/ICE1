/*
    name : harsh goti
    Student ID : 991625543
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Scanner;
import java.util.Random;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author harsh goti 
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        
        for (int i=0; i<magicHand.length; i++) {
            magicHand[i] = new Card();
            magicHand[i].setValue(rand.nextInt(13 - 1) + 1);
            magicHand[i].setSuit(Card.SUITS[(int)(rand.nextInt(4 - 1) + 1)]);
        }
        
        for (Card mh : magicHand) {
            System.out.println(mh.getSuit() + " " + mh.getValue());
        }
        
        Card c = new Card();
        System.out.printf("please select cart suit (1 for hearts,2 for diamonds,3 for spades or 4 for clubs): ");
        c.setSuit(input.next());
        System.out.printf("please enter card value between 1 and 13: ");
        c.setValue(input.nextInt());
        
        for (String s : Card.SUITS) {
            if("1".equals(c.getSuit())){
                c.setSuit("hearts");
            } else if("2".equals(c.getSuit())){
                c.setSuit("diamonds");
            } else if("3".equals(c.getSuit())){
                c.setSuit("spades");
            } else if("4".equals(c.getSuit())){
                c.setSuit("clubs");
            }
        }
        
        int compareAns = 0;
        for (Card magicHand1 : magicHand) {
            if (c.getValue() == magicHand1.getValue()) {
                if (c.getSuit().equals(magicHand1.getSuit())) {
                    System.out.println("Magic hand does contain your card");
                }
                compareAns=1;
                break;
            }
        }
        
        if(compareAns==0){
            System.out.println("Magic hand does not contain your card");
        }
        
        Card luckyCard  = new Card();
        c.setSuit("diamonds");
        c.setValue(8);
        
    }
}
