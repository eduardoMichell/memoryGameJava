package br.univali.edu.memoryGame.game;

public class Card {
    private int id;
    private String cardImageFile;
    private String turnedCardImageFile;
    private boolean turned;



    public Card(int id) {
        this.id = id;
        this.cardImageFile = "file:images/" + id + ".png";
        this.turnedCardImageFile = "file:configImages/turnedCard.png";
        this.turned = true;
    }

    /**
     * Getter of card ID
     * @return ID
     */
    public int getId() {
        return id;
    }

    /**
     * Setter of card ID
     * @param id new ID
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Check if the card is Turned
     * @return true if is turned, false otherwise
     */
    public boolean isTurned() {
        return turned;
    }

    /**
     * Setter of turned
     * @param turned new turned
     */
    public void setTurned(boolean turned) {
        this.turned = turned;
    }

    /**
     * Getter of card image file
     * @return card image file
     */
    public String getCardImageFile() {
        return cardImageFile;
    }

    /**
     * Setter of card image file
     * @param cardImageFile new card image file
     */
    public void setCardImageFile(String cardImageFile) {
        this.cardImageFile = cardImageFile;
    }

    /**
     * Getter of turned card image file
     * @return turned card image file
     */
    public String getTurnedCardImageFile() {
        return turnedCardImageFile;
    }

    /**
     * Getter of the card side
     * @param image the side of card
     * @return true if is the back of card, false if is the front of card
     */
    public String getCardSide(boolean image){
        if(image){
            return getTurnedCardImageFile();
        } else {
            return getCardImageFile();
        }
    }

    /**
     * Setter of turned card image file
     * @param turnedCardImageFile new turned card image file
     */
    public void setTurnedCardImageFile(String turnedCardImageFile) {
        this.turnedCardImageFile = turnedCardImageFile;
    }


}
