package br.univali.edu.memoryGame.game;

public enum Difficulty {
    EASY(20), HARD(30);

    private int numberOfCards;

    Difficulty(int numberOfCards) {
        this.numberOfCards = numberOfCards;
    }


    /**
     * Getter of number of cards
     * @return number of cards
     */
    public int getNumberOfCards() {
        return numberOfCards;
    }

    /**
     * Setter of number of cards
     * @param numberOfCards new number of cards
     */
    public void setNumberOfCards(int numberOfCards) {
        this.numberOfCards = numberOfCards;
    }
}
