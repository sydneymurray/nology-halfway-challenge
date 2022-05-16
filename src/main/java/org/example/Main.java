package org.example;

public class Main {

    public static void main(String[] args) {
        Deck deck = new Deck("");
        //deck.getDeck();

        for (int i = 0; i < 5; i++) {
            Card card = deck.dealCard();
            System.out.println(card.getSuit() + " " + card.getSymbol());
        }


    }
}