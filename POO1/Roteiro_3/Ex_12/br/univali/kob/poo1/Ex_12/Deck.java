package br.univali.kob.poo1.Ex_12;

import java.util.Random;

/**
 * 
 */
public class Deck {

    /**
     * Default constructor
     */
    public Deck() {
        int i=0;
        for (Card.Suit suit : Card.Suit.values())
        {
            for (Card.Value value: Card.Value.values())
            {
                cards[i] = new Card(value, suit);
                i++;
            }
        }
    }

    /**
     * 
     */
    private final Card[] cards = new Card[52];

    /**
     * 
     */
    public void shuffle() {
        Random random = new Random();
        for (int i=0;i<50;i++)
        {
            int randint1 = random.nextInt(51);
            int randint2 = random.nextInt(51);
            Card aux = cards[randint1];
            cards[randint1] = cards[randint2];
            cards[randint2] = aux;
        }
    }

    /**
     * @param i 
     * @return
     */
    public Card getCard(int i) {
        return this.cards[i];
    }

    /**
     * @return
     */
    public Card[] getAll() {
        return cards;
    }

}