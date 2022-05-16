package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Deck {
    ArrayList<Card> deck = new ArrayList<Card>();

    public ArrayList<Card> getDeck() {
        for (Card card : deck)
            System.out.println(card.getSuit()+ " " + card.getSymbol());
        return deck;
    }

    public Deck(String isEmpty) {
        if(isEmpty.contains("empty")) return;
        String[] suitsArray = {"❤️","♠","️♦","️♣️"};
        for (String s : suitsArray) createSuit(s);
    }

    private void createSuit(String suit){
        for (int i = 2; i < 11; i++)
            deck.add(new Card(suit, Integer.toString(i), i));
        deck.add(new Card(suit, "J", 11));
        deck.add(new Card(suit, "Q", 12));
        deck.add(new Card(suit, "K", 13));
        deck.add(new Card(suit, "A", 14));
    }

    public Card dealCard(){
         Card card = deck.get(0);
         deck.remove(0);
         return card;
    }


}
