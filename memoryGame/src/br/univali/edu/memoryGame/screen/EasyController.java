package br.univali.edu.memoryGame.screen;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.*;

import br.univali.edu.memoryGame.game.Difficulty;
import br.univali.edu.memoryGame.game.Game;
import javafx.application.Platform;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class EasyController {
    private static boolean easy = false;
    private MediaPlayer music;
    private static int points;
    private static int time;
    private int cards;
    private ArrayList<Integer> numberOfCards;
    private Game easyGame;
    private boolean firstSelectedCard, secondSelectedCard;
    private int firstSelectedCardId, secondSelectedCardId;

    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    private ImageView screenEasy;
    @FXML
    private ImageView card1;
    @FXML
    private ImageView card2;
    @FXML
    private ImageView card3;
    @FXML
    private ImageView card4;
    @FXML
    private ImageView card5;
    @FXML
    private ImageView card6;
    @FXML
    private ImageView card7;
    @FXML
    private ImageView card8;
    @FXML
    private ImageView card9;
    @FXML
    private ImageView card10;
    @FXML
    private ImageView card11;
    @FXML
    private ImageView card12;
    @FXML
    private ImageView card13;
    @FXML
    private ImageView card14;
    @FXML
    private ImageView card15;
    @FXML
    private ImageView card16;
    @FXML
    private ImageView card17;
    @FXML
    private ImageView card18;
    @FXML
    private ImageView card19;
    @FXML
    private ImageView card20;
    @FXML
    private Text minutes;
    @FXML
    private Text seconds;

    /**
     * The action of all card methods is the same, when clicked, turn the image and add Card for check with the other.
     * When entered, turn the image to a larger one and when exited, turn the image to a smaller one.
     */
    @FXML
    void card1Clicked(MouseEvent event) throws InterruptedException {
        if(cards < 2 && easyGame.getTable().getCards().get(0).isTurned() && time <= 120) {
            card1.setImage(new Image("file:images/" + easyGame.getTable().getCards().get(0).getId() + ".png"));
            easyGame.getTable().turnCardFalse(0);
            addCards(0);
        }
    }
    @FXML
    void card1Entered(MouseEvent event) {
        if(time <= 120 && easyGame.getTable().getCards().get(0).isTurned()) {
            card1.setImage(new Image("file:configImages/turnedCardEntered.png"));
        }
    }
    @FXML
    void card1Exited(MouseEvent event) {
        if(time <= 120 && easyGame.getTable().getCards().get(0).isTurned()) {
            card1.setImage(new Image("file:configImages/turnedCard.png"));

        }
    }


    @FXML
    void card2Clicked(MouseEvent event) throws InterruptedException {
        if(cards < 2 && easyGame.getTable().getCards().get(1).isTurned() && time <= 120) {
            card2.setImage(new Image("file:images/" + easyGame.getTable().getCards().get(1).getId() + ".png"));
            easyGame.getTable().turnCardFalse(1);
            addCards(1);
        }
    }
    @FXML
    void card2Entered(MouseEvent event) {
        if(time <= 120 && easyGame.getTable().getCards().get(1).isTurned()) {
            card2.setImage(new Image("file:configImages/turnedCardEntered.png"));
        }
    }
    @FXML
    void card2Exited(MouseEvent event) {
        if (time <= 120 && easyGame.getTable().getCards().get(1).isTurned()) {
            card2.setImage(new Image("file:configImages/turnedCard.png"));
        }
    }


    @FXML
    void card3Clicked(MouseEvent event) throws InterruptedException {
        if (cards < 2 && easyGame.getTable().getCards().get(2).isTurned() && time <= 120) {
            card3.setImage(new Image("file:images/" + easyGame.getTable().getCards().get(2).getId() + ".png"));
            easyGame.getTable().turnCardFalse(2);
            addCards(2);
        }
    }
    @FXML
    void card3Entered(MouseEvent event) {
        if(time <= 120 && easyGame.getTable().getCards().get(2).isTurned()) {
            card3.setImage(new Image("file:configImages/turnedCardEntered.png"));
        }
    }
    @FXML
    void card3Exited(MouseEvent event) {
        if(time <= 120 && easyGame.getTable().getCards().get(2).isTurned()) {
            card3.setImage(new Image("file:configImages/turnedCard.png"));
        }
    }


    @FXML
    void card4Clicked(MouseEvent event) throws InterruptedException {
        if (cards < 2 && easyGame.getTable().getCards().get(3).isTurned() && time <= 120) {
            card4.setImage(new Image("file:images/" + easyGame.getTable().getCards().get(3).getId() + ".png"));
            easyGame.getTable().turnCardFalse(3);
            addCards(3);
        }
    }
    @FXML
    void card4Entered(MouseEvent event) {
        if(time <= 120 && easyGame.getTable().getCards().get(3).isTurned()) {
            card4.setImage(new Image("file:configImages/turnedCardEntered.png"));
        }
    }
    @FXML
    void card4Exited(MouseEvent event) {
        if(time <= 120 && easyGame.getTable().getCards().get(3).isTurned()) {
            card4.setImage(new Image("file:configImages/turnedCard.png"));
        }
    }


    @FXML
    void card5Clicked(MouseEvent event) throws InterruptedException {
        if (cards < 2 && easyGame.getTable().getCards().get(4).isTurned() && time <= 120) {
            card5.setImage(new Image("file:images/" + easyGame.getTable().getCards().get(4).getId() + ".png"));
            easyGame.getTable().turnCardFalse(4);
            addCards(4);
        }
    }
    @FXML
    void card5Entered(MouseEvent event) {
        if(time <= 120 && easyGame.getTable().getCards().get(4).isTurned()) {
            card5.setImage(new Image("file:configImages/turnedCardEntered.png"));
        }
    }
    @FXML
    void card5Exited(MouseEvent event) {
        if(time <= 120 && easyGame.getTable().getCards().get(4).isTurned()) {
            card5.setImage(new Image("file:configImages/turnedCard.png"));
        }
    }


    @FXML
    void card6Clicked(MouseEvent event) throws InterruptedException {
        if (cards < 2 && easyGame.getTable().getCards().get(5).isTurned() && time <= 120) {
            card6.setImage(new Image("file:images/" + easyGame.getTable().getCards().get(5).getId() + ".png"));
            easyGame.getTable().turnCardFalse(5);
            addCards(5);
        }
    }
    @FXML
    void card6Entered(MouseEvent event) {
        if(time <= 120 && easyGame.getTable().getCards().get(5).isTurned()) {
            card6.setImage(new Image("file:configImages/turnedCardEntered.png"));
        }
    }
    @FXML
    void card6Exited(MouseEvent event) {
        if(time <= 120 && easyGame.getTable().getCards().get(5).isTurned()) {
            card6.setImage(new Image("file:configImages/turnedCard.png"));
        }
    }


    @FXML
    void card7Clicked(MouseEvent event) throws InterruptedException {
        if (cards < 2 && easyGame.getTable().getCards().get(6).isTurned() && time <= 120) {
            card7.setImage(new Image("file:images/" + easyGame.getTable().getCards().get(6).getId() + ".png"));
            easyGame.getTable().turnCardFalse(6);
            addCards(6);
        }
    }
    @FXML
    void card7Entered(MouseEvent event) {
        if(time <= 120 && easyGame.getTable().getCards().get(6).isTurned()) {
            card7.setImage(new Image("file:configImages/turnedCardEntered.png"));
        }
    }
    @FXML
    void card7Exited(MouseEvent event) throws InterruptedException {
        if(time <= 120 && easyGame.getTable().getCards().get(6).isTurned()) {
            card7.setImage(new Image("file:configImages/turnedCard.png"));
        }
    }


    @FXML
    void card8Clicked(MouseEvent event) throws InterruptedException {
        if (cards < 2 && easyGame.getTable().getCards().get(7).isTurned() && time <= 120) {
            card8.setImage(new Image("file:images/" + easyGame.getTable().getCards().get(7).getId() + ".png"));
            easyGame.getTable().turnCardFalse(7);
            addCards(7);
        }
    }
    @FXML
    void card8Entered(MouseEvent event) {
        if(time <= 120 && easyGame.getTable().getCards().get(7).isTurned()) {
            card8.setImage(new Image("file:configImages/turnedCardEntered.png"));
        }
    }
    @FXML
    void card8Exited(MouseEvent event) {
        if(time <= 120 && easyGame.getTable().getCards().get(7).isTurned()) {
            card8.setImage(new Image("file:configImages/turnedCard.png"));
        }
    }


    @FXML
    void card9Clicked(MouseEvent event) throws InterruptedException {
        if (cards < 2 && easyGame.getTable().getCards().get(8).isTurned() && time <= 120) {
            card9.setImage(new Image("file:images/" + easyGame.getTable().getCards().get(8).getId() + ".png"));
            easyGame.getTable().turnCardFalse(8);
            addCards(8);
        }
    }
    @FXML
    void card9Entered(MouseEvent event) {
        if(time <= 120 && easyGame.getTable().getCards().get(8).isTurned()) {
            card9.setImage(new Image("file:configImages/turnedCardEntered.png"));
        }
    }
    @FXML
    void card9Exited(MouseEvent event) {
        if(time <= 120 && easyGame.getTable().getCards().get(8).isTurned()) {
            card9.setImage(new Image("file:configImages/turnedCard.png"));
        }
    }


    @FXML
    void card10Clicked(MouseEvent event) throws InterruptedException {
        if (cards < 2 && easyGame.getTable().getCards().get(9).isTurned() && time <= 120) {
            card10.setImage(new Image("file:images/" + easyGame.getTable().getCards().get(9).getId() + ".png"));
            easyGame.getTable().turnCardFalse(9);
            addCards(9);
        }
    }
    @FXML
    void card10Entered(MouseEvent event) {
        if(time <= 120 && easyGame.getTable().getCards().get(9).isTurned()) {
            card10.setImage(new Image("file:configImages/turnedCardEntered.png"));
        }
    }
    @FXML
    void card10Exited(MouseEvent event) {
        if(time <= 120 && easyGame.getTable().getCards().get(9).isTurned()) {
            card10.setImage(new Image("file:configImages/turnedCard.png"));
        }
    }


    @FXML
    void card11Clicked(MouseEvent event) throws InterruptedException {
        if (cards < 2 && easyGame.getTable().getCards().get(10).isTurned() && time <= 120) {
            card11.setImage(new Image("file:images/" + easyGame.getTable().getCards().get(10).getId() + ".png"));
            easyGame.getTable().turnCardFalse(10);
            addCards(10);
        }
    }
    @FXML
    void card11Entered(MouseEvent event) {
        if(time <= 120 && easyGame.getTable().getCards().get(10).isTurned()) {
            card11.setImage(new Image("file:configImages/turnedCardEntered.png"));
        }
    }
    @FXML
    void card11Exited(MouseEvent event) {
        if(time <= 120 && easyGame.getTable().getCards().get(10).isTurned()) {
            card11.setImage(new Image("file:configImages/turnedCard.png"));
        }
    }


    @FXML
    void card12Clicked(MouseEvent event) throws InterruptedException {
        if (cards < 2 && easyGame.getTable().getCards().get(11).isTurned() && time <= 120) {
            card12.setImage(new Image("file:images/" + easyGame.getTable().getCards().get(11).getId() + ".png"));
            easyGame.getTable().turnCardFalse(11);
            addCards(11);
        }
    }
    @FXML
    void card12Entered(MouseEvent event) {
        if(time <= 120 && easyGame.getTable().getCards().get(11).isTurned()) {
            card12.setImage(new Image("file:configImages/turnedCardEntered.png"));
        }
    }
    @FXML
    void card12Exited(MouseEvent event) {
        if(time <= 120 && easyGame.getTable().getCards().get(11).isTurned()) {
            card12.setImage(new Image("file:configImages/turnedCard.png"));
        }
    }


    @FXML
    void card13Clicked(MouseEvent event) throws InterruptedException {
        if (cards < 2 && easyGame.getTable().getCards().get(12).isTurned() && time <= 120) {
            card13.setImage(new Image("file:images/" + easyGame.getTable().getCards().get(12).getId() + ".png"));
            easyGame.getTable().turnCardFalse(12);
            addCards(12);
        }
    }
    @FXML
    void card13Entered(MouseEvent event) {
        if(time <= 120 && easyGame.getTable().getCards().get(12).isTurned()) {
            card13.setImage(new Image("file:configImages/turnedCardEntered.png"));
        }
    }
    @FXML
    void card13Exited(MouseEvent event) {
        if(time <= 120 && easyGame.getTable().getCards().get(12).isTurned()) {
            card13.setImage(new Image("file:configImages/turnedCard.png"));
        }
    }


    @FXML
    void card14Clicked(MouseEvent event) throws InterruptedException {
        if (cards < 2 && easyGame.getTable().getCards().get(13).isTurned() && time <= 120) {
            card14.setImage(new Image("file:images/" + easyGame.getTable().getCards().get(13).getId() + ".png"));
            easyGame.getTable().turnCardFalse(13);
            addCards(13);
        }
    }
    @FXML
    void card14Entered(MouseEvent event) {
        if(time <= 120 && easyGame.getTable().getCards().get(13).isTurned()) {
            card14.setImage(new Image("file:configImages/turnedCardEntered.png"));
        }
    }
    @FXML
    void card14Exited(MouseEvent event) {
        if(time <= 120 && easyGame.getTable().getCards().get(13).isTurned()) {
            card14.setImage(new Image("file:configImages/turnedCard.png"));
        }
    }


    @FXML
    void card15Clicked(MouseEvent event) throws InterruptedException {
        if (cards < 2 && easyGame.getTable().getCards().get(14).isTurned() && time <= 120) {
            card15.setImage(new Image("file:images/" + easyGame.getTable().getCards().get(14).getId() + ".png"));
            easyGame.getTable().turnCardFalse(14);
            addCards(14);
        }
    }
    @FXML
    void card15Entered(MouseEvent event) {
        if(time <= 120 && easyGame.getTable().getCards().get(14).isTurned()) {
            card15.setImage(new Image("file:configImages/turnedCardEntered.png"));
        }
    }
    @FXML
    void card15Exited(MouseEvent event) {
        if(time <= 120 && easyGame.getTable().getCards().get(14).isTurned()) {
            card15.setImage(new Image("file:configImages/turnedCard.png"));
        }
    }


    @FXML
    void card16Clicked(MouseEvent event) throws InterruptedException {
        if (cards < 2 && easyGame.getTable().getCards().get(15).isTurned() && time <= 120) {
            card16.setImage(new Image("file:images/" + easyGame.getTable().getCards().get(15).getId() + ".png"));
            easyGame.getTable().turnCardFalse(15);
            addCards(15);
        }
    }
    @FXML
    void card16Entered(MouseEvent event) {
        if(time <= 120 && easyGame.getTable().getCards().get(15).isTurned()) {
            card16.setImage(new Image("file:configImages/turnedCardEntered.png"));
        }
    }
    @FXML
    void card16Exited(MouseEvent event) {
        if(time <= 120 && easyGame.getTable().getCards().get(15).isTurned()) {
            card16.setImage(new Image("file:configImages/turnedCard.png"));
        }
    }


    @FXML
    void card17Clicked(MouseEvent event) throws InterruptedException {
        if (cards < 2 && easyGame.getTable().getCards().get(16).isTurned() && time <= 120) {
            card17.setImage(new Image("file:images/" + easyGame.getTable().getCards().get(16).getId() + ".png"));
            easyGame.getTable().turnCardFalse(16);
            addCards(16);
        }
    }
    @FXML
    void card17Entered(MouseEvent event) {
        if(time <= 120 && easyGame.getTable().getCards().get(16).isTurned()) {
            card17.setImage(new Image("file:configImages/turnedCardEntered.png"));
        }
    }
    @FXML
    void card17Exited(MouseEvent event) {
        if(time <= 120 && easyGame.getTable().getCards().get(16).isTurned()) {
            card17.setImage(new Image("file:configImages/turnedCard.png"));
        }
    }


    @FXML
    void card18Clicked(MouseEvent event) throws InterruptedException {
        if (cards < 2 && easyGame.getTable().getCards().get(17).isTurned() && time <= 120) {
            card18.setImage(new Image("file:images/" + easyGame.getTable().getCards().get(17).getId() + ".png"));
            easyGame.getTable().turnCardFalse(17);
            addCards(17);
        }
    }
    @FXML
    void card18Entered(MouseEvent event) {

        if(time <= 120 && easyGame.getTable().getCards().get(17).isTurned()) {
            card18.setImage(new Image("file:configImages/turnedCardEntered.png"));
        }
    }
    @FXML
    void card18Exited(MouseEvent event) {
        if(time <= 120 && easyGame.getTable().getCards().get(17).isTurned()) {
            card18.setImage(new Image("file:configImages/turnedCard.png"));
        }
    }


    @FXML
    void card19Clicked(MouseEvent event) throws InterruptedException {
        if (cards < 2 && easyGame.getTable().getCards().get(18).isTurned() && time <= 120) {
            card19.setImage(new Image("file:images/" + easyGame.getTable().getCards().get(18).getId() + ".png"));
            easyGame.getTable().turnCardFalse(18);
            addCards(18);
        }
    }
    @FXML
    void card19Entered(MouseEvent event) {
        if(time <= 120 && easyGame.getTable().getCards().get(18).isTurned()) {
            card19.setImage(new Image("file:configImages/turnedCardEntered.png"));
        }
    }
    @FXML
    void card19Exited(MouseEvent event) {
        if(time <= 120 && easyGame.getTable().getCards().get(18).isTurned()) {
            card19.setImage(new Image("file:configImages/turnedCard.png"));
        }
    }


    @FXML
    void card20Clicked(MouseEvent event) throws InterruptedException {
        if (cards < 2 && easyGame.getTable().getCards().get(19).isTurned() && time <= 120) {
            card20.setImage(new Image("file:images/" + easyGame.getTable().getCards().get(19).getId() + ".png"));
            easyGame.getTable().turnCardFalse(19);
            addCards(19);
        }

    }
    @FXML
    void card20Entered(MouseEvent event) {
        if(time <= 120 && easyGame.getTable().getCards().get(19).isTurned()) {
            card20.setImage(new Image("file:configImages/turnedCardEntered.png"));
        }
    }
    @FXML
    void card20Exited(MouseEvent event) {
        if(time <= 120 && easyGame.getTable().getCards().get(19).isTurned()) {
            card20.setImage(new Image("file:configImages/turnedCard.png"));
        }
    }

    /**
     * Getter of time, is static because need to switch to another screen
     * @return time
     */
    public static  int getTime() {
        return time;
    }

    /**
     * Getter of points, is static because need to switch to another screen
     * @return points
     */
    public static  int getPoints() {
        return points;
    }

    /**
     * Setter of easy
     * @param easy new easy
     */
    public static void setEasy(boolean easy) {
        EasyController.easy = easy;
    }

    /**
     * Getter of easy, is static because need to switch to another screen
     * @return easy
     */
    public static boolean isEasy() {
        return easy;
    }

    /**
     * add the card to check with another one
     * @param numberCard number of card
     * @throws InterruptedException for thread sleep
     */
    public void addCards(int numberCard) throws InterruptedException {
        Thread.sleep(400);
        numberOfCards.add(numberCard);
        cards++;

        if(firstSelectedCard) {
            firstSelectedCardId = easyGame.getTable().getCards().get(numberCard).getId();
            secondSelectedCard = true;
        } else {
            secondSelectedCardId = easyGame.getTable().getCards().get(numberCard).getId();
            firstSelectedCard = true;
        }

    }

    /**
     * Set image side of card true or false.
     * @param numberCard number of card.
     * @param side side of card.
     */
    public void setCardSide(int numberCard, boolean side){
        if(numberCard == 0){
            if(side){
                easyGame.getTable().turnCardTrue(0);
                card1.setImage(new Image("file:configImages/turnedCard.png"));
            } else {
                card1.setImage(new Image("file:images/" + easyGame.getTable().getCards().get(0).getId() + ".png"));
            }
        }
        if(numberCard == 1){
            if(side){
                easyGame.getTable().turnCardTrue(1);
                card2.setImage(new Image("file:configImages/turnedCard.png"));
            } else {
                card2.setImage(new Image("file:images/" + easyGame.getTable().getCards().get(1).getId() + ".png"));

            }
        }
        if(numberCard == 2){
            if(side){
                easyGame.getTable().turnCardTrue(2);
                card3.setImage(new Image("file:configImages/turnedCard.png"));
            } else {
                card3.setImage(new Image("file:images/" + easyGame.getTable().getCards().get(2).getId() + ".png"));

            }
        }
        if(numberCard == 3){
            if(side){
                easyGame.getTable().turnCardTrue(3);
                card4.setImage(new Image("file:configImages/turnedCard.png"));
            } else {
                card4.setImage(new Image("file:images/" + easyGame.getTable().getCards().get(3).getId() + ".png"));

            }
        }
        if(numberCard == 4){
            if(side){
                easyGame.getTable().turnCardTrue(4);
                card5.setImage(new Image("file:configImages/turnedCard.png"));
            } else {
                card5.setImage(new Image("file:images/" + easyGame.getTable().getCards().get(4).getId() + ".png"));

            }
        }
        if(numberCard == 5){
            if(side){
                easyGame.getTable().turnCardTrue(5);
                card6.setImage(new Image("file:configImages/turnedCard.png"));
            } else {
                card6.setImage(new Image("file:images/" + easyGame.getTable().getCards().get(5).getId() + ".png"));
            }
        }
        if(numberCard == 6){
            if(side){
                easyGame.getTable().turnCardTrue(6);
                card7.setImage(new Image("file:configImages/turnedCard.png"));
            } else {
                card7.setImage(new Image("file:images/" + easyGame.getTable().getCards().get(6).getId() + ".png"));
            }
        }
        if(numberCard == 7){
            if(side){
                easyGame.getTable().turnCardTrue(7);
                card8.setImage(new Image("file:configImages/turnedCard.png"));
            } else {
                card8.setImage(new Image("file:images/" + easyGame.getTable().getCards().get(7).getId() + ".png"));

            }
        }
        if(numberCard == 8){
            if(side){
                easyGame.getTable().turnCardTrue(8);
                card9.setImage(new Image("file:configImages/turnedCard.png"));
            } else {
                card9.setImage(new Image("file:images/" + easyGame.getTable().getCards().get(8).getId() + ".png"));

            }
        }
        if(numberCard == 9){
            if(side){
                easyGame.getTable().turnCardTrue(9);
                card10.setImage(new Image("file:configImages/turnedCard.png"));
            } else {
                card10.setImage(new Image("file:images/" + easyGame.getTable().getCards().get(9).getId() + ".png"));

            }
        }
        if(numberCard == 10){
            if(side){
                easyGame.getTable().turnCardTrue(10);
                card11.setImage(new Image("file:configImages/turnedCard.png"));
            } else {
                card11.setImage(new Image("file:images/" + easyGame.getTable().getCards().get(10).getId() + ".png"));

            }
        }
        if(numberCard == 11){
            if(side){
                easyGame.getTable().turnCardTrue(11);
                card12.setImage(new Image("file:configImages/turnedCard.png"));
            } else {
                card12.setImage(new Image("file:images/" + easyGame.getTable().getCards().get(11).getId() + ".png"));

            }
        }
        if(numberCard == 12){
            if(side){
                easyGame.getTable().turnCardTrue(12);
                card13.setImage(new Image("file:configImages/turnedCard.png"));
            } else {
                card13.setImage(new Image("file:images/" + easyGame.getTable().getCards().get(12).getId() + ".png"));

            }
        }
        if(numberCard == 13){
            if(side){
                easyGame.getTable().turnCardTrue(13);
                card14.setImage(new Image("file:configImages/turnedCard.png"));
            } else {
                card14.setImage(new Image("file:images/" + easyGame.getTable().getCards().get(13).getId() + ".png"));

            }
        }
        if(numberCard == 14){
            if(side){
                easyGame.getTable().turnCardTrue(14);
                card15.setImage(new Image("file:configImages/turnedCard.png"));
            } else {
                card15.setImage(new Image("file:images/" + easyGame.getTable().getCards().get(14).getId() + ".png"));

            }
        }
        if(numberCard == 15){
            if(side){
                easyGame.getTable().turnCardTrue(15);
                card16.setImage(new Image("file:configImages/turnedCard.png"));
            } else {
                card16.setImage(new Image("file:images/" + easyGame.getTable().getCards().get(15).getId() + ".png"));

            }
        }
        if(numberCard == 16){
            if(side){
                easyGame.getTable().turnCardTrue(16);
                card17.setImage(new Image("file:configImages/turnedCard.png"));
            } else {
                card17.setImage(new Image("file:images/" + easyGame.getTable().getCards().get(16).getId() + ".png"));

            }
        }
        if(numberCard == 17){
            if(side){
                easyGame.getTable().turnCardTrue(17);
                card18.setImage(new Image("file:configImages/turnedCard.png"));
            } else {
                card18.setImage(new Image("file:images/" + easyGame.getTable().getCards().get(17).getId() + ".png"));

            }
        }
        if(numberCard == 18){
            if(side){
                easyGame.getTable().turnCardTrue(18);
                card19.setImage(new Image("file:configImages/turnedCard.png"));
            } else {
                card19.setImage(new Image("file:images/" + easyGame.getTable().getCards().get(18).getId() + ".png"));
            }
        }
        if(numberCard == 19){
            if(side){
                easyGame.getTable().turnCardTrue(19);
                card20.setImage(new Image("file:configImages/turnedCard.png"));
            } else {
                card20.setImage(new Image("file:images/" + easyGame.getTable().getCards().get(19).getId() + ".png"));

            }
        }
    }

    /**
     * Run the timer and check if the game is end.
     */
    public void runTime(){
        Timer tm = new Timer();
        TimerTask task = new TimerTask(){
            @Override
            public void run(){
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        time--;
                        int seg = time % 60;
                        int min = time / 60;
                        min %=  60;

                        if(time <= 120) {
                            minutes.setText(String.format("%02d", min));
                            seconds.setText(String.format("%02d", seg));
                        }

                        checkCards();

                        if(time == 0 || easyGame.getPlayer().getPoints() == 10){
                            music.pause();
                            tm.cancel();
                            if(time == 0) {
                                minutes.setText("00");
                                seconds.setText("00");
                            } else {
                                minutes.setText(String.format("%02d", min));
                                seconds.setText(String.format("%02d", seg));
                            }

                            points = easyGame.getPlayer().getPoints();
                            try {
                                goToEndGameControl();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }

                        }
                    }});
            }
        };
        tm.scheduleAtFixedRate(task,1000,1000);
    }

    /**
     * Checks if the two selected cards are the same or not
     */
    public void checkCards(){
        if(cards <= 2 && (firstSelectedCard && secondSelectedCard)){
            if(firstSelectedCardId == secondSelectedCardId) {
                resetSelectedCards(false);
            } else{
                differentCardsDelay();
            }
        }
    }

    /**
     * reset all attributes
     */
    public void startGame(){
        points = 0;
        time = 126;
        cards = 0;
        numberOfCards = new ArrayList<>();
        easyGame = new Game(Difficulty.EASY);
        firstSelectedCard = false;
        secondSelectedCard = false;
        firstSelectedCardId = -1;
        secondSelectedCardId = -1;
    }

    /**
     * Select a random music
     */
    public void randomMusic(){
        Random random = new Random();
        int randomNumber = random.nextInt(4) + 1;
        switch (randomNumber){
            case 1:
                music = new MediaPlayer(new Media(Paths.get("audio/distressSignal.mp3").toUri().toString()));
                music.setVolume(0.02);
                music.play();
                break;
            case 2:
                music = new MediaPlayer(new Media(Paths.get("audio/escape.mp3").toUri().toString()));
                music.setVolume(0.02);
                music.play();
                break;
            case 3:
                music = new MediaPlayer(new Media(Paths.get("audio/oceaan.mp3").toUri().toString()));
                music.setVolume(0.02);
                music.play();
                break;
            case 4:
                music = new MediaPlayer(new Media(Paths.get("audio/onTheWayOut.mp3").toUri().toString()));
                music.setVolume(0.02);
                music.play();
        }


    }

    /**
     * Set the image of cards
     * @param image true if the side is front, false if the side is back
     */
    public void showCards(boolean image){
        card1.setImage(new Image(easyGame.getTable().getCards().get(0).getCardSide(image)));
        card2.setImage(new Image(easyGame.getTable().getCards().get(1).getCardSide(image)));
        card3.setImage(new Image(easyGame.getTable().getCards().get(2).getCardSide(image)));
        card4.setImage(new Image(easyGame.getTable().getCards().get(3).getCardSide(image)));
        card5.setImage(new Image(easyGame.getTable().getCards().get(4).getCardSide(image)));
        card6.setImage(new Image(easyGame.getTable().getCards().get(5).getCardSide(image)));
        card7.setImage(new Image(easyGame.getTable().getCards().get(6).getCardSide(image)));
        card8.setImage(new Image(easyGame.getTable().getCards().get(7).getCardSide(image)));
        card9.setImage(new Image(easyGame.getTable().getCards().get(8).getCardSide(image)));
        card10.setImage(new Image(easyGame.getTable().getCards().get(9).getCardSide(image)));
        card11.setImage(new Image(easyGame.getTable().getCards().get(10).getCardSide(image)));
        card12.setImage(new Image(easyGame.getTable().getCards().get(11).getCardSide(image)));
        card13.setImage(new Image(easyGame.getTable().getCards().get(12).getCardSide(image)));
        card14.setImage(new Image(easyGame.getTable().getCards().get(13).getCardSide(image)));
        card15.setImage(new Image(easyGame.getTable().getCards().get(14).getCardSide(image)));
        card16.setImage(new Image(easyGame.getTable().getCards().get(15).getCardSide(image)));
        card17.setImage(new Image(easyGame.getTable().getCards().get(16).getCardSide(image)));
        card18.setImage(new Image(easyGame.getTable().getCards().get(17).getCardSide(image)));
        card19.setImage(new Image(easyGame.getTable().getCards().get(18).getCardSide(image)));
        card20.setImage(new Image(easyGame.getTable().getCards().get(19).getCardSide(image)));

    }

    /**
     * Show the cards for 5 seconds
     */
    public void showInitialImages(){
        Timer tm = new Timer();
        TimerTask task = new TimerTask(){
            @Override
            public void run(){
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        showCards(true);
                    }});
            }
        };
        tm.scheduleAtFixedRate(task,5000,180000);
    }

    /**
     * Reset the two selected cards
     * @param rightCards that will be check if the cards are the same
     */
    public void resetSelectedCards(boolean rightCards){
        if(!rightCards) {
            easyGame.getPlayer().setPoints(easyGame.getPlayer().getPoints() + 1);
        }
        cards = 0;
        firstSelectedCard = false;
        secondSelectedCard = false;
        setCardSide(numberOfCards.get(0),rightCards);
        setCardSide(numberOfCards.get(1),rightCards);
        firstSelectedCardId = -1;
        secondSelectedCardId = -1;
        numberOfCards.remove(0);
        numberOfCards.remove(0);

    }

    /**
     * Delay of different cards
     */
    public void differentCardsDelay(){
        Timer tm = new Timer();
        TimerTask task = new TimerTask(){
            @Override
            public void run(){
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        resetSelectedCards(true);
                        tm.cancel();
                    }});
            }
        };
        tm.scheduleAtFixedRate(task,500,500);
    }

    /**
     * Go to end game stage
     * @throws IOException if the file does not exist
     */
    public void goToEndGameControl() throws IOException {
        if(time == 0 || easyGame.getPlayer().getPoints() >= 10){
            Stage window = (Stage) minutes.getScene().getWindow();
            window.setScene(new Scene(FXMLLoader.load(getClass().getResource("endGameScreen.fxml"))));
            window.show();
        }
    }

    /**
     * Start of easy screen
     */
    @FXML
    void initialize(){
        HardController.setHard(false);
        screenEasy.setImage(new Image("file:configImages/gameScreen.png"));
        easy = true;
        randomMusic();
        showInitialImages();
        startGame();
        showCards(false);
        minutes.setText("02");
        seconds.setText("00");
        runTime();


        assert screenEasy != null : "fx:id=\"screenEasy\" was not injected: check your FXML file 'easyScreen.fxml'.";
        assert card1 != null : "fx:id=\"card1\" was not injected: check your FXML file 'easyScreen.fxml'.";
        assert card2 != null : "fx:id=\"card2\" was not injected: check your FXML file 'easyScreen.fxml'.";
        assert card3 != null : "fx:id=\"card3\" was not injected: check your FXML file 'easyScreen.fxml'.";
        assert card4 != null : "fx:id=\"card4\" was not injected: check your FXML file 'easyScreen.fxml'.";
        assert card5 != null : "fx:id=\"card5\" was not injected: check your FXML file 'easyScreen.fxml'.";
        assert card6 != null : "fx:id=\"card6\" was not injected: check your FXML file 'easyScreen.fxml'.";
        assert card7 != null : "fx:id=\"card7\" was not injected: check your FXML file 'easyScreen.fxml'.";
        assert card8 != null : "fx:id=\"card8\" was not injected: check your FXML file 'easyScreen.fxml'.";
        assert card9 != null : "fx:id=\"card9\" was not injected: check your FXML file 'easyScreen.fxml'.";
        assert card10 != null : "fx:id=\"card10\" was not injected: check your FXML file 'easyScreen.fxml'.";
        assert card11 != null : "fx:id=\"card11\" was not injected: check your FXML file 'easyScreen.fxml'.";
        assert card12 != null : "fx:id=\"card12\" was not injected: check your FXML file 'easyScreen.fxml'.";
        assert card13 != null : "fx:id=\"card13\" was not injected: check your FXML file 'easyScreen.fxml'.";
        assert card14 != null : "fx:id=\"card14\" was not injected: check your FXML file 'easyScreen.fxml'.";
        assert card15 != null : "fx:id=\"card15\" was not injected: check your FXML file 'easyScreen.fxml'.";
        assert card16 != null : "fx:id=\"card16\" was not injected: check your FXML file 'easyScreen.fxml'.";
        assert card17 != null : "fx:id=\"card17\" was not injected: check your FXML file 'easyScreen.fxml'.";
        assert card18 != null : "fx:id=\"card18\" was not injected: check your FXML file 'easyScreen.fxml'.";
        assert card19 != null : "fx:id=\"card19\" was not injected: check your FXML file 'easyScreen.fxml'.";
        assert card20 != null : "fx:id=\"card20\" was not injected: check your FXML file 'easyScreen.fxml'.";
        assert minutes != null : "fx:id=\"minutes\" was not injected: check your FXML file 'easyScreen.fxml'.";
        assert seconds != null : "fx:id=\"seconds\" was not injected: check your FXML file 'easyScreen.fxml'.";

    }
}
