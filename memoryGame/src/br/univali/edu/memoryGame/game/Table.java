package br.univali.edu.memoryGame.game;

import java.util.ArrayList;
import java.util.Collections;

public class Table {
   private ArrayList<Card> cards = new ArrayList<>();


    /**
     * Set one card true, turn the card around
     * @param numberOfCard number of card
     */
    public void turnCardTrue(int numberOfCard){
      cards.get(numberOfCard).setTurned(true);
    }

    /**
     * Set one card false, turns the card forward
     * @param numberOfCard number of card
     */
    public void turnCardFalse(int numberOfCard){
      cards.get(numberOfCard).setTurned(false);
    }

    /**
     * Generates the table of cards.
     * @param numberOfCards number of cards that will be generated
     */
    public void generateTableCards(int numberOfCards){
        for(int i = 1; i <= numberOfCards/2; i++){
            cards.add(new Card(i));
            cards.add(new Card(i));
        }
        Collections.shuffle(cards);
    }

    /**
     * Getter of Cards
     * @return cards
     */
    public ArrayList<Card> getCards() {
        return cards;
    }

    /**
     * Setter of Cards
     * @param cards new Cards
     */
    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }
}
