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

public class HardController {
    private static boolean hard = false;
    private static int points;
    private static int time;
    private int cards;
    private ArrayList<Integer> numberOfCards;
    private Game hardGame;
    private boolean firstSelectedCard, secondSelectedCard;
    private int firstSelectedCardId, secondSelectedCardId;
    private MediaPlayer music;


    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    private ImageView hardScreen;
    @FXML
    private Text minutes;
    @FXML
    private Text seconds;

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
    private ImageView card21;
    @FXML
    private ImageView card22;
    @FXML
    private ImageView card23;
    @FXML
    private ImageView card24;
    @FXML
    private ImageView card25;
    @FXML
    private ImageView card26;
    @FXML
    private ImageView card27;
    @FXML
    private ImageView card28;
    @FXML
    private ImageView card29;
    @FXML
    private ImageView card30;


    /**
     * The action of all card methods is the same, when clicked, turn the image and add Card for check with the other.
     * When entered, turn the image to a larger one and when exited, turn the image to a smaller one.
     */
    @FXML
    void card1Clicked(MouseEvent event) throws InterruptedException {
        if(cards < 2 && hardGame.getTable().getCards().get(0).isTurned() && time <= 90) {
            card1.setImage(new Image("file:images/" + hardGame.getTable().getCards().get(0).getId() + ".png"));
            hardGame.getTable().turnCardFalse(0);
            addCards(0);
        }
    }
    @FXML
    void card1Entered(MouseEvent event) {
        if(time <= 90 && hardGame.getTable().getCards().get(0).isTurned()) {
            card1.setImage(new Image("file:configImages/turnedCardEntered.png"));
        }
    }
    @FXML
    void card1Exited(MouseEvent event) {
        if(time <= 90 && hardGame.getTable().getCards().get(0).isTurned()) {
            card1.setImage(new Image("file:configImages/turnedCard.png"));

        }
    }


    @FXML
    void card2Clicked(MouseEvent event) throws InterruptedException {
        if(cards < 2 && hardGame.getTable().getCards().get(1).isTurned() && time <= 90) {
            card2.setImage(new Image("file:images/" + hardGame.getTable().getCards().get(1).getId() + ".png"));
            hardGame.getTable().turnCardFalse(1);
            addCards(1);
        }
    }
    @FXML
    void card2Entered(MouseEvent event) {
        if(time <= 90 && hardGame.getTable().getCards().get(1).isTurned()) {
            card2.setImage(new Image("file:configImages/turnedCardEntered.png"));
        }
    }
    @FXML
    void card2Exited(MouseEvent event) {
        if(time <= 90 && hardGame.getTable().getCards().get(1).isTurned()) {
            card2.setImage(new Image("file:configImages/turnedCard.png"));
        }
    }


    @FXML
    void card3Clicked(MouseEvent event) throws InterruptedException {
        if(cards < 2 && hardGame.getTable().getCards().get(2).isTurned() && time <= 90) {
            card3.setImage(new Image("file:images/" + hardGame.getTable().getCards().get(2).getId() + ".png"));
            hardGame.getTable().turnCardFalse(2);
            addCards(2);
        }
    }
    @FXML
    void card3Entered(MouseEvent event) {
        if(time <= 90 && hardGame.getTable().getCards().get(2).isTurned()) {
            card3.setImage(new Image("file:configImages/turnedCardEntered.png"));
        }
    }
    @FXML
    void card3Exited(MouseEvent event) {
        if(time <= 90 && hardGame.getTable().getCards().get(2).isTurned()) {
            card3.setImage(new Image("file:configImages/turnedCard.png"));
        }
    }


    @FXML
    void card4Clicked(MouseEvent event) throws InterruptedException {
        if(cards < 2 && hardGame.getTable().getCards().get(3).isTurned() && time <= 90) {
            card4.setImage(new Image("file:images/" + hardGame.getTable().getCards().get(3).getId() + ".png"));
            hardGame.getTable().turnCardFalse(3);
            addCards(3);
        }
    }
    @FXML
    void card4Entered(MouseEvent event) {
        if(time <= 90 && hardGame.getTable().getCards().get(3).isTurned()) {
            card4.setImage(new Image("file:configImages/turnedCardEntered.png"));
        }
    }
    @FXML
    void card4Exited(MouseEvent event) {
        if(time <= 90 && hardGame.getTable().getCards().get(3).isTurned()) {
            card4.setImage(new Image("file:configImages/turnedCard.png"));
        }
    }


    @FXML
    void card5Clicked(MouseEvent event) throws InterruptedException {
        if(cards < 2 && hardGame.getTable().getCards().get(4).isTurned() && time <= 90) {
            card5.setImage(new Image("file:images/" + hardGame.getTable().getCards().get(4).getId() + ".png"));
            hardGame.getTable().turnCardFalse(4);
            addCards(4);
        }
    }
    @FXML
    void card5Entered(MouseEvent event) {
        if(time <= 90 && hardGame.getTable().getCards().get(4).isTurned()) {
            card5.setImage(new Image("file:configImages/turnedCardEntered.png"));
        }
    }
    @FXML
    void card5Exited(MouseEvent event) {
        if(time <= 90 && hardGame.getTable().getCards().get(4).isTurned()) {
            card5.setImage(new Image("file:configImages/turnedCard.png"));
        }
    }


    @FXML
    void card6Clicked(MouseEvent event) throws InterruptedException {
        if(cards < 2 && hardGame.getTable().getCards().get(5).isTurned() && time <= 90) {
            card6.setImage(new Image("file:images/" + hardGame.getTable().getCards().get(5).getId() + ".png"));
            hardGame.getTable().turnCardFalse(5);
            addCards(5);
        }
    }
    @FXML
    void card6Entered(MouseEvent event) {
        if(time <= 90 && hardGame.getTable().getCards().get(5).isTurned()) {
            card6.setImage(new Image("file:configImages/turnedCardEntered.png"));
        }
    }
    @FXML
    void card6Exited(MouseEvent event) {
        if(time <= 90 && hardGame.getTable().getCards().get(5).isTurned()) {
            card6.setImage(new Image("file:configImages/turnedCard.png"));
        }
    }


    @FXML
    void card7Clicked(MouseEvent event) throws InterruptedException {
        if(cards < 2 && hardGame.getTable().getCards().get(6).isTurned() && time <= 90) {
            card7.setImage(new Image("file:images/" + hardGame.getTable().getCards().get(6).getId() + ".png"));
            hardGame.getTable().turnCardFalse(6);
            addCards(6);
        }
    }
    @FXML
    void card7Entered(MouseEvent event) {
        if(time <= 90 && hardGame.getTable().getCards().get(6).isTurned()) {
            card7.setImage(new Image("file:configImages/turnedCardEntered.png"));
        }
    }
    @FXML
    void card7Exited(MouseEvent event) {
        if(time <= 90 && hardGame.getTable().getCards().get(6).isTurned()) {
            card7.setImage(new Image("file:configImages/turnedCard.png"));
        }
    }


    @FXML
    void card8Clicked(MouseEvent event) throws InterruptedException {
        if(cards < 2 && hardGame.getTable().getCards().get(7).isTurned() && time <= 90) {
            card8.setImage(new Image("file:images/" + hardGame.getTable().getCards().get(7).getId() + ".png"));
            hardGame.getTable().turnCardFalse(7);
            addCards(7);
        }
    }
    @FXML
    void card8Entered(MouseEvent event) {
        if(time <= 90 && hardGame.getTable().getCards().get(7).isTurned()) {
            card8.setImage(new Image("file:configImages/turnedCardEntered.png"));
        }
    }
    @FXML
    void card8Exited(MouseEvent event) {
        if(time <= 90 && hardGame.getTable().getCards().get(7).isTurned()) {
            card8.setImage(new Image("file:configImages/turnedCard.png"));
        }
    }


    @FXML
    void card9Clicked(MouseEvent event) throws InterruptedException {
        if(cards < 2 && hardGame.getTable().getCards().get(8).isTurned() && time <= 90) {
            card9.setImage(new Image("file:images/" + hardGame.getTable().getCards().get(8).getId() + ".png"));
            hardGame.getTable().turnCardFalse(8);
            addCards(8);
        }
    }
    @FXML
    void card9Entered(MouseEvent event) {
        if(time <= 90 && hardGame.getTable().getCards().get(8).isTurned()) {
            card9.setImage(new Image("file:configImages/turnedCardEntered.png"));
        }
    }
    @FXML
    void card9Exited(MouseEvent event) {
        if(time <= 90 && hardGame.getTable().getCards().get(8).isTurned()) {
            card9.setImage(new Image("file:configImages/turnedCard.png"));
        }
    }


    @FXML
    void card10Clicked(MouseEvent event) throws InterruptedException {
        if(cards < 2 && hardGame.getTable().getCards().get(9).isTurned() && time <= 90) {
            card10.setImage(new Image("file:images/" + hardGame.getTable().getCards().get(9).getId() + ".png"));
            hardGame.getTable().turnCardFalse(9);
            addCards(9);
        }
    }
    @FXML
    void card10Entered(MouseEvent event) {
        if(time <= 90 && hardGame.getTable().getCards().get(9).isTurned()) {
            card10.setImage(new Image("file:configImages/turnedCardEntered.png"));
        }
    }
    @FXML
    void card10Exited(MouseEvent event) {
        if(time <= 90 && hardGame.getTable().getCards().get(9).isTurned()) {
            card10.setImage(new Image("file:configImages/turnedCard.png"));
        }
    }


    @FXML
    void card11Clicked(MouseEvent event) throws InterruptedException {
        if(cards < 2 && hardGame.getTable().getCards().get(10).isTurned() && time <= 90) {
            card11.setImage(new Image("file:images/" + hardGame.getTable().getCards().get(10).getId() + ".png"));
            hardGame.getTable().turnCardFalse(10);
            addCards(10);
        }
    }
    @FXML
    void card11Entered(MouseEvent event) {
        if(time <= 90 && hardGame.getTable().getCards().get(10).isTurned()) {
            card11.setImage(new Image("file:configImages/turnedCardEntered.png"));
        }
    }
    @FXML
    void card11Exited(MouseEvent event) {
        if(time <= 90 && hardGame.getTable().getCards().get(10).isTurned()) {
            card11.setImage(new Image("file:configImages/turnedCard.png"));
        }
    }


    @FXML
    void card12Clicked(MouseEvent event) throws InterruptedException {
        if(cards < 2 && hardGame.getTable().getCards().get(11).isTurned() && time <= 90) {
            card12.setImage(new Image("file:images/" + hardGame.getTable().getCards().get(11).getId() + ".png"));
            hardGame.getTable().turnCardFalse(11);
            addCards(11);
        }
    }
    @FXML
    void card12Entered(MouseEvent event) {
        if(time <= 90 && hardGame.getTable().getCards().get(11).isTurned()) {
            card12.setImage(new Image("file:configImages/turnedCardEntered.png"));
        }
    }
    @FXML
    void card12Exited(MouseEvent event) {
        if(time <= 90 && hardGame.getTable().getCards().get(11).isTurned()) {
            card12.setImage(new Image("file:configImages/turnedCard.png"));
        }
    }


    @FXML
    void card13Clicked(MouseEvent event) throws InterruptedException {
        if(cards < 2 && hardGame.getTable().getCards().get(12).isTurned() && time <= 90) {
            card13.setImage(new Image("file:images/" + hardGame.getTable().getCards().get(12).getId() + ".png"));
            hardGame.getTable().turnCardFalse(12);
            addCards(12);
        }
    }
    @FXML
    void card13Entered(MouseEvent event) {
        if(time <= 90 && hardGame.getTable().getCards().get(12).isTurned()) {
            card13.setImage(new Image("file:configImages/turnedCardEntered.png"));
        }
    }
    @FXML
    void card13Exited(MouseEvent event) {
        if(time <= 90 && hardGame.getTable().getCards().get(12).isTurned()) {
            card13.setImage(new Image("file:configImages/turnedCard.png"));
        }
    }


    @FXML
    void card14Clicked(MouseEvent event) throws InterruptedException {
        if(cards < 2 && hardGame.getTable().getCards().get(13).isTurned() && time <= 90) {
            card14.setImage(new Image("file:images/" + hardGame.getTable().getCards().get(13).getId() + ".png"));
            hardGame.getTable().turnCardFalse(13);
            addCards(13);
        }
    }
    @FXML
    void card14Entered(MouseEvent event) {
        if(time <= 90 && hardGame.getTable().getCards().get(13).isTurned()) {
            card14.setImage(new Image("file:configImages/turnedCardEntered.png"));
        }
    }
    @FXML
    void card14Exited(MouseEvent event) {
        if(time <= 90 && hardGame.getTable().getCards().get(13).isTurned()) {
            card14.setImage(new Image("file:configImages/turnedCard.png"));
        }
    }


    @FXML
    void card15Clicked(MouseEvent event) throws InterruptedException {
        if(cards < 2 && hardGame.getTable().getCards().get(14).isTurned() && time <= 90) {
            card15.setImage(new Image("file:images/" + hardGame.getTable().getCards().get(14).getId() + ".png"));
            hardGame.getTable().turnCardFalse(14);
            addCards(14);
        }
    }
    @FXML
    void card15Entered(MouseEvent event) {
        if(time <= 90 && hardGame.getTable().getCards().get(14).isTurned()) {
            card15.setImage(new Image("file:configImages/turnedCardEntered.png"));
        }
    }
    @FXML
    void card15Exited(MouseEvent event) {
        if(time <= 90 && hardGame.getTable().getCards().get(14).isTurned()) {
            card15.setImage(new Image("file:configImages/turnedCard.png"));
        }
    }


    @FXML
    void card16Clicked(MouseEvent event) throws InterruptedException {
        if(cards < 2 && hardGame.getTable().getCards().get(15).isTurned() && time <= 90) {
            card16.setImage(new Image("file:images/" + hardGame.getTable().getCards().get(15).getId() + ".png"));
            hardGame.getTable().turnCardFalse(15);
            addCards(15);
        }
    }
    @FXML
    void card16Entered(MouseEvent event) {
        if(time <= 90 && hardGame.getTable().getCards().get(15).isTurned()) {
            card16.setImage(new Image("file:configImages/turnedCardEntered.png"));
        }
    }
    @FXML
    void card16Exited(MouseEvent event) {
        if(time <= 90 && hardGame.getTable().getCards().get(15).isTurned()) {
            card16.setImage(new Image("file:configImages/turnedCard.png"));
        }
    }


    @FXML
    void card17Clicked(MouseEvent event) throws InterruptedException {
        if(cards < 2 && hardGame.getTable().getCards().get(16).isTurned() && time <= 90) {
            card17.setImage(new Image("file:images/" + hardGame.getTable().getCards().get(16).getId() + ".png"));
            hardGame.getTable().turnCardFalse(16);
            addCards(16);
        }
    }
    @FXML
    void card17Entered(MouseEvent event) {
        if(time <= 90 && hardGame.getTable().getCards().get(16).isTurned()) {
            card17.setImage(new Image("file:configImages/turnedCardEntered.png"));
        }
    }
    @FXML
    void card17Exited(MouseEvent event) {
        if(time <= 90 && hardGame.getTable().getCards().get(16).isTurned()) {
            card17.setImage(new Image("file:configImages/turnedCard.png"));
        }
    }


    @FXML
    void card18Clicked(MouseEvent event) throws InterruptedException {
        if(cards < 2 && hardGame.getTable().getCards().get(17).isTurned() && time <= 90) {
            card18.setImage(new Image("file:images/" + hardGame.getTable().getCards().get(17).getId() + ".png"));
            hardGame.getTable().turnCardFalse(17);
            addCards(17);
        }
    }
    @FXML
    void card18Entered(MouseEvent event) {
        if(time <= 90 && hardGame.getTable().getCards().get(17).isTurned()) {
            card18.setImage(new Image("file:configImages/turnedCardEntered.png"));
        }
    }
    @FXML
    void card18Exited(MouseEvent event) {
        if(time <= 90 && hardGame.getTable().getCards().get(17).isTurned()) {
            card18.setImage(new Image("file:configImages/turnedCard.png"));
        }
    }


    @FXML
    void card19Clicked(MouseEvent event) throws InterruptedException {
        if(cards < 2 && hardGame.getTable().getCards().get(18).isTurned() && time <= 90) {
            card19.setImage(new Image("file:images/" + hardGame.getTable().getCards().get(18).getId() + ".png"));
            hardGame.getTable().turnCardFalse(18);
            addCards(18);
        }
    }
    @FXML
    void card19Entered(MouseEvent event) {
        if(time <= 90 && hardGame.getTable().getCards().get(18).isTurned()) {
            card19.setImage(new Image("file:configImages/turnedCardEntered.png"));
        }
    }
    @FXML
    void card19Exited(MouseEvent event) {
        if(time <= 90 && hardGame.getTable().getCards().get(18).isTurned()) {
            card19.setImage(new Image("file:configImages/turnedCard.png"));
        }
    }


    @FXML
    void card20Clicked(MouseEvent event) throws InterruptedException {
        if(cards < 2 && hardGame.getTable().getCards().get(19).isTurned() && time <= 90) {
            card20.setImage(new Image("file:images/" + hardGame.getTable().getCards().get(19).getId() + ".png"));
            hardGame.getTable().turnCardFalse(19);
            addCards(19);
        }
    }
    @FXML
    void card20Entered(MouseEvent event) {
        if(time <= 90 && hardGame.getTable().getCards().get(19).isTurned()) {
            card20.setImage(new Image("file:configImages/turnedCardEntered.png"));
        }
    }
    @FXML
    void card20Exited(MouseEvent event) {
        if(time <= 90 && hardGame.getTable().getCards().get(19).isTurned()) {
            card20.setImage(new Image("file:configImages/turnedCard.png"));
        }
    }


    @FXML
    void card21Clicked(MouseEvent event) throws InterruptedException {
        if(cards < 2 && hardGame.getTable().getCards().get(20).isTurned() && time <= 90) {
            card21.setImage(new Image("file:images/" + hardGame.getTable().getCards().get(20).getId() + ".png"));
            hardGame.getTable().turnCardFalse(20);
            addCards(20);
        }
    }
    @FXML
    void card21Entered(MouseEvent event) {
        if(time <= 90 && hardGame.getTable().getCards().get(20).isTurned()) {
            card21.setImage(new Image("file:configImages/turnedCardEntered.png"));
        }
    }
    @FXML
    void card21Exited(MouseEvent event) {
        if(time <= 90 && hardGame.getTable().getCards().get(20).isTurned()) {
            card21.setImage(new Image("file:configImages/turnedCard.png"));
        }
    }


    @FXML
    void card22Clicked(MouseEvent event) throws InterruptedException {
        if(cards < 2 && hardGame.getTable().getCards().get(21).isTurned() && time <= 90) {
            card22.setImage(new Image("file:images/" + hardGame.getTable().getCards().get(21).getId() + ".png"));
            hardGame.getTable().turnCardFalse(21);
            addCards(21);
        }
    }
    @FXML
    void card22Entered(MouseEvent event) {
        if(time <= 90 && hardGame.getTable().getCards().get(21).isTurned()) {
            card22.setImage(new Image("file:configImages/turnedCardEntered.png"));
        }
    }
    @FXML
    void card22Exited(MouseEvent event) {
        if(time <= 90 && hardGame.getTable().getCards().get(21).isTurned()) {
            card22.setImage(new Image("file:configImages/turnedCard.png"));
        }
    }


    @FXML
    void card23Clicked(MouseEvent event) throws InterruptedException {
        if(cards < 2 && hardGame.getTable().getCards().get(22).isTurned() && time <= 90) {
            card23.setImage(new Image("file:images/" + hardGame.getTable().getCards().get(22).getId() + ".png"));
            hardGame.getTable().turnCardFalse(22);
            addCards(22);
        }
    }
    @FXML
    void card23Entered(MouseEvent event) {
        if(time <= 90 && hardGame.getTable().getCards().get(22).isTurned()) {
            card23.setImage(new Image("file:configImages/turnedCardEntered.png"));
        }
    }
    @FXML
    void card23Exited(MouseEvent event) {
        if(time <= 90 && hardGame.getTable().getCards().get(22).isTurned()) {
            card23.setImage(new Image("file:configImages/turnedCard.png"));
        }
    }


    @FXML
    void card24Clicked(MouseEvent event) throws InterruptedException {
        if(cards < 2 && hardGame.getTable().getCards().get(23).isTurned() && time <= 90) {
            card24.setImage(new Image("file:images/" + hardGame.getTable().getCards().get(23).getId() + ".png"));
            hardGame.getTable().turnCardFalse(23);
            addCards(23);
        }
    }
    @FXML
    void card24Entered(MouseEvent event) {
        if(time <= 90 && hardGame.getTable().getCards().get(23).isTurned()) {
            card24.setImage(new Image("file:configImages/turnedCardEntered.png"));
        }
    }
    @FXML
    void card24Exited(MouseEvent event) {
        if(time <= 90 && hardGame.getTable().getCards().get(23).isTurned()) {
            card24.setImage(new Image("file:configImages/turnedCard.png"));
        }
    }


    @FXML
    void card25Clicked(MouseEvent event) throws InterruptedException {
        if(cards < 2 && hardGame.getTable().getCards().get(24).isTurned() && time <= 90) {
            card25.setImage(new Image("file:images/" + hardGame.getTable().getCards().get(24).getId() + ".png"));
            hardGame.getTable().turnCardFalse(24);
            addCards(24);
        }
    }
    @FXML
    void card25Entered(MouseEvent event) {
        if(time <= 90 && hardGame.getTable().getCards().get(24).isTurned()) {
            card25.setImage(new Image("file:configImages/turnedCardEntered.png"));
        }
    }
    @FXML
    void card25Exited(MouseEvent event) {
        if(time <= 90 && hardGame.getTable().getCards().get(24).isTurned()) {
            card25.setImage(new Image("file:configImages/turnedCard.png"));
        }
    }


    @FXML
    void card26Clicked(MouseEvent event) throws InterruptedException {
        if(cards < 2 && hardGame.getTable().getCards().get(25).isTurned() && time <= 90) {
            card26.setImage(new Image("file:images/" + hardGame.getTable().getCards().get(25).getId() + ".png"));
            hardGame.getTable().turnCardFalse(25);
            addCards(25);
        }
    }
    @FXML
    void card26Entered(MouseEvent event) {
        if(time <= 90 && hardGame.getTable().getCards().get(25).isTurned()) {
            card26.setImage(new Image("file:configImages/turnedCardEntered.png"));
        }
    }
    @FXML
    void card26Exited(MouseEvent event) {
        if(time <= 90 && hardGame.getTable().getCards().get(25).isTurned()) {
            card26.setImage(new Image("file:configImages/turnedCard.png"));
        }
    }


    @FXML
    void card27Clicked(MouseEvent event) throws InterruptedException {
        if(cards < 2 && hardGame.getTable().getCards().get(26).isTurned() && time <= 90) {
            card27.setImage(new Image("file:images/" + hardGame.getTable().getCards().get(26).getId() + ".png"));
            hardGame.getTable().turnCardFalse(26);
            addCards(26);
        }
    }
    @FXML
    void card27Entered(MouseEvent event) {
        if(time <= 90 && hardGame.getTable().getCards().get(26).isTurned()) {
            card27.setImage(new Image("file:configImages/turnedCardEntered.png"));
        }
    }
    @FXML
    void card27Exited(MouseEvent event) {
        if(time <= 90 && hardGame.getTable().getCards().get(26).isTurned()) {
            card27.setImage(new Image("file:configImages/turnedCard.png"));
        }
    }


    @FXML
    void card28Clicked(MouseEvent event) throws InterruptedException {
        if(cards < 2 && hardGame.getTable().getCards().get(27).isTurned() && time <= 90) {
            card28.setImage(new Image("file:images/" + hardGame.getTable().getCards().get(27).getId() + ".png"));
            hardGame.getTable().turnCardFalse(27);
            addCards(27);
        }
    }
    @FXML
    void card28Entered(MouseEvent event) {
        if(time <= 90 && hardGame.getTable().getCards().get(27).isTurned()) {
            card28.setImage(new Image("file:configImages/turnedCardEntered.png"));
        }
    }
    @FXML
    void card28Exited(MouseEvent event) {
        if(time <= 90 && hardGame.getTable().getCards().get(27).isTurned()) {
            card28.setImage(new Image("file:configImages/turnedCard.png"));
        }
    }


    @FXML
    void card29Clicked(MouseEvent event) throws InterruptedException {
        if(cards < 2 && hardGame.getTable().getCards().get(28).isTurned() && time <= 90) {
            card29.setImage(new Image("file:images/" + hardGame.getTable().getCards().get(28).getId() + ".png"));
            hardGame.getTable().turnCardFalse(28);
            addCards(28);
        }
    }
    @FXML
    void card29Entered(MouseEvent event) {
        if(time <= 90 && hardGame.getTable().getCards().get(28).isTurned()) {
            card29.setImage(new Image("file:configImages/turnedCardEntered.png"));
        }
    }
    @FXML
    void card29Exited(MouseEvent event) {
        if(time <= 90 && hardGame.getTable().getCards().get(28).isTurned()) {
            card29.setImage(new Image("file:configImages/turnedCard.png"));
        }
    }


    @FXML
    void card30Clicked(MouseEvent event) throws InterruptedException {
        if(cards < 2 && hardGame.getTable().getCards().get(29).isTurned() && time <= 90) {
            card30.setImage(new Image("file:images/" + hardGame.getTable().getCards().get(29).getId() + ".png"));
            hardGame.getTable().turnCardFalse(29);
            addCards(29);
        }
    }
    @FXML
    void card30Entered(MouseEvent event) {
        if(time <= 90 && hardGame.getTable().getCards().get(29).isTurned()) {
            card30.setImage(new Image("file:configImages/turnedCardEntered.png"));
        }
    }
    @FXML
    void card30Exited(MouseEvent event) {
        if(time <= 90 && hardGame.getTable().getCards().get(29).isTurned()) {
            card30.setImage(new Image("file:configImages/turnedCard.png"));
        }
    }


    /**
     * Set the image of cards
     * @param image true if the side is front, false if the side is back
     */
    public void showCards(boolean image){
        card1.setImage(new Image(hardGame.getTable().getCards().get(0).getCardSide(image)));
        card2.setImage(new Image(hardGame.getTable().getCards().get(1).getCardSide(image)));
        card3.setImage(new Image(hardGame.getTable().getCards().get(2).getCardSide(image)));
        card4.setImage(new Image(hardGame.getTable().getCards().get(3).getCardSide(image)));
        card5.setImage(new Image(hardGame.getTable().getCards().get(4).getCardSide(image)));
        card6.setImage(new Image(hardGame.getTable().getCards().get(5).getCardSide(image)));
        card7.setImage(new Image(hardGame.getTable().getCards().get(6).getCardSide(image)));
        card8.setImage(new Image(hardGame.getTable().getCards().get(7).getCardSide(image)));
        card9.setImage(new Image(hardGame.getTable().getCards().get(8).getCardSide(image)));
        card10.setImage(new Image(hardGame.getTable().getCards().get(9).getCardSide(image)));
        card11.setImage(new Image(hardGame.getTable().getCards().get(10).getCardSide(image)));
        card12.setImage(new Image(hardGame.getTable().getCards().get(11).getCardSide(image)));
        card13.setImage(new Image(hardGame.getTable().getCards().get(12).getCardSide(image)));
        card14.setImage(new Image(hardGame.getTable().getCards().get(13).getCardSide(image)));
        card15.setImage(new Image(hardGame.getTable().getCards().get(14).getCardSide(image)));
        card16.setImage(new Image(hardGame.getTable().getCards().get(15).getCardSide(image)));
        card17.setImage(new Image(hardGame.getTable().getCards().get(16).getCardSide(image)));
        card18.setImage(new Image(hardGame.getTable().getCards().get(17).getCardSide(image)));
        card19.setImage(new Image(hardGame.getTable().getCards().get(18).getCardSide(image)));
        card20.setImage(new Image(hardGame.getTable().getCards().get(19).getCardSide(image)));
        card21.setImage(new Image(hardGame.getTable().getCards().get(20).getCardSide(image)));
        card22.setImage(new Image(hardGame.getTable().getCards().get(21).getCardSide(image)));
        card23.setImage(new Image(hardGame.getTable().getCards().get(22).getCardSide(image)));
        card24.setImage(new Image(hardGame.getTable().getCards().get(23).getCardSide(image)));
        card25.setImage(new Image(hardGame.getTable().getCards().get(24).getCardSide(image)));
        card26.setImage(new Image(hardGame.getTable().getCards().get(25).getCardSide(image)));
        card27.setImage(new Image(hardGame.getTable().getCards().get(26).getCardSide(image)));
        card28.setImage(new Image(hardGame.getTable().getCards().get(27).getCardSide(image)));
        card29.setImage(new Image(hardGame.getTable().getCards().get(28).getCardSide(image)));
        card30.setImage(new Image(hardGame.getTable().getCards().get(29).getCardSide(image)));

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
     * reset all attributes
     */
    public void startGame(){
        points = 0;
        time = 96;
        cards = 0;
        numberOfCards = new ArrayList<>();
        hardGame = new Game(Difficulty.HARD);
        firstSelectedCard = false;
        secondSelectedCard = false;
        firstSelectedCardId = -1;
        secondSelectedCardId = -1;

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

                        if(time <= 90) {
                            minutes.setText(String.format("%02d", min));
                            seconds.setText(String.format("%02d", seg));
                        }

                        checkCards();

                        if(time == 0 || hardGame.getPlayer().getPoints() == 15){
                            time = time;
                            music.pause();
                            tm.cancel();
                            if(time == 0) {
                                minutes.setText("00");
                                seconds.setText("00");
                            } else {
                                minutes.setText(String.format("%02d", min));
                                seconds.setText(String.format("%02d", seg));
                            }

                            points = hardGame.getPlayer().getPoints();
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
     * Reset the two selected cards
     * @param rightCards that will be check if the cards are the same
     */
    public void resetSelectedCards(boolean rightCards){
        if(!rightCards) {
            hardGame.getPlayer().setPoints(hardGame.getPlayer().getPoints() + 1);
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
     * add the card to check with another one
     * @param numberCard number of card
     * @throws InterruptedException for thread sleep
     */
    public void addCards(int numberCard) throws InterruptedException {
        Thread.sleep(400);
        numberOfCards.add(numberCard);
        cards++;

        if(firstSelectedCard) {
            firstSelectedCardId = hardGame.getTable().getCards().get(numberCard).getId();
            secondSelectedCard = true;
        } else {
            secondSelectedCardId = hardGame.getTable().getCards().get(numberCard).getId();
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
                hardGame.getTable().turnCardTrue(0);
                card1.setImage(new Image("file:configImages/turnedCard.png"));
            } else {
                card1.setImage(new Image("file:images/" + hardGame.getTable().getCards().get(0).getId() + ".png"));
            }
        }
        if(numberCard == 1){
            if(side){
                hardGame.getTable().turnCardTrue(1);
                card2.setImage(new Image("file:configImages/turnedCard.png"));
            } else {
                card2.setImage(new Image("file:images/" + hardGame.getTable().getCards().get(1).getId() + ".png"));

            }
        }
        if(numberCard == 2){
            if(side){
                hardGame.getTable().turnCardTrue(2);
                card3.setImage(new Image("file:configImages/turnedCard.png"));
            } else {
                card3.setImage(new Image("file:images/" + hardGame.getTable().getCards().get(2).getId() + ".png"));

            }
        }
        if(numberCard == 3){
            if(side){
                hardGame.getTable().turnCardTrue(3);
                card4.setImage(new Image("file:configImages/turnedCard.png"));
            } else {
                card4.setImage(new Image("file:images/" + hardGame.getTable().getCards().get(3).getId() + ".png"));

            }
        }
        if(numberCard == 4){
            if(side){
                hardGame.getTable().turnCardTrue(4);
                card5.setImage(new Image("file:configImages/turnedCard.png"));
            } else {
                card5.setImage(new Image("file:images/" + hardGame.getTable().getCards().get(4).getId() + ".png"));

            }
        }
        if(numberCard == 5){
            if(side){
                hardGame.getTable().turnCardTrue(5);
                card6.setImage(new Image("file:configImages/turnedCard.png"));
            } else {
                card6.setImage(new Image("file:images/" + hardGame.getTable().getCards().get(5).getId() + ".png"));
            }
        }
        if(numberCard == 6){
            if(side){
                hardGame.getTable().turnCardTrue(6);
                card7.setImage(new Image("file:configImages/turnedCard.png"));
            } else {
                card7.setImage(new Image("file:images/" + hardGame.getTable().getCards().get(6).getId() + ".png"));
            }
        }
        if(numberCard == 7){
            if(side){
                hardGame.getTable().turnCardTrue(7);
                card8.setImage(new Image("file:configImages/turnedCard.png"));
            } else {
                card8.setImage(new Image("file:images/" + hardGame.getTable().getCards().get(7).getId() + ".png"));

            }
        }
        if(numberCard == 8){
            if(side){
                hardGame.getTable().turnCardTrue(8);
                card9.setImage(new Image("file:configImages/turnedCard.png"));
            } else {
                card9.setImage(new Image("file:images/" + hardGame.getTable().getCards().get(8).getId() + ".png"));

            }
        }
        if(numberCard == 9){
            if(side){
                hardGame.getTable().turnCardTrue(9);
                card10.setImage(new Image("file:configImages/turnedCard.png"));
            } else {
                card10.setImage(new Image("file:images/" + hardGame.getTable().getCards().get(9).getId() + ".png"));

            }
        }
        if(numberCard == 10){
            if(side){
                hardGame.getTable().turnCardTrue(10);
                card11.setImage(new Image("file:configImages/turnedCard.png"));
            } else {
                card11.setImage(new Image("file:images/" + hardGame.getTable().getCards().get(10).getId() + ".png"));

            }
        }
        if(numberCard == 11){
            if(side){
                hardGame.getTable().turnCardTrue(11);
                card12.setImage(new Image("file:configImages/turnedCard.png"));
            } else {
                card12.setImage(new Image("file:images/" + hardGame.getTable().getCards().get(11).getId() + ".png"));

            }
        }
        if(numberCard == 12){
            if(side){
                hardGame.getTable().turnCardTrue(12);
                card13.setImage(new Image("file:configImages/turnedCard.png"));
            } else {
                card13.setImage(new Image("file:images/" + hardGame.getTable().getCards().get(12).getId() + ".png"));

            }
        }
        if(numberCard == 13){
            if(side){
                hardGame.getTable().turnCardTrue(13);
                card14.setImage(new Image("file:configImages/turnedCard.png"));
            } else {
                card14.setImage(new Image("file:images/" + hardGame.getTable().getCards().get(13).getId() + ".png"));

            }
        }
        if(numberCard == 14){
            if(side){
                hardGame.getTable().turnCardTrue(14);
                card15.setImage(new Image("file:configImages/turnedCard.png"));
            } else {
                card15.setImage(new Image("file:images/" + hardGame.getTable().getCards().get(14).getId() + ".png"));

            }
        }
        if(numberCard == 15){
            if(side){
                hardGame.getTable().turnCardTrue(15);
                card16.setImage(new Image("file:configImages/turnedCard.png"));
            } else {
                card16.setImage(new Image("file:images/" + hardGame.getTable().getCards().get(15).getId() + ".png"));

            }
        }
        if(numberCard == 16){
            if(side){
                hardGame.getTable().turnCardTrue(16);
                card17.setImage(new Image("file:configImages/turnedCard.png"));
            } else {
                card17.setImage(new Image("file:images/" + hardGame.getTable().getCards().get(16).getId() + ".png"));

            }
        }
        if(numberCard == 17){
            if(side){
                hardGame.getTable().turnCardTrue(17);
                card18.setImage(new Image("file:configImages/turnedCard.png"));
            } else {
                card18.setImage(new Image("file:images/" + hardGame.getTable().getCards().get(17).getId() + ".png"));

            }
        }
        if(numberCard == 18){
            if(side){
                hardGame.getTable().turnCardTrue(18);
                card19.setImage(new Image("file:configImages/turnedCard.png"));
            } else {
                card19.setImage(new Image("file:images/" + hardGame.getTable().getCards().get(18).getId() + ".png"));
            }
        }
        if(numberCard == 19){
            if(side){
                hardGame.getTable().turnCardTrue(19);
                card20.setImage(new Image("file:configImages/turnedCard.png"));
            } else {
                card20.setImage(new Image("file:images/" + hardGame.getTable().getCards().get(19).getId() + ".png"));

            }
        }
        if(numberCard == 20){
            if(side){
                hardGame.getTable().turnCardTrue(20);
                card21.setImage(new Image("file:configImages/turnedCard.png"));
            } else {
                card21.setImage(new Image("file:images/" + hardGame.getTable().getCards().get(20).getId() + ".png"));

            }
        }
        if(numberCard == 21){
            if(side){
                hardGame.getTable().turnCardTrue(21);
                card22.setImage(new Image("file:configImages/turnedCard.png"));
            } else {
                card22.setImage(new Image("file:images/" + hardGame.getTable().getCards().get(21).getId() + ".png"));

            }
        }
        if(numberCard == 22){
            if(side){
                hardGame.getTable().turnCardTrue(22);
                card23.setImage(new Image("file:configImages/turnedCard.png"));
            } else {
                card23.setImage(new Image("file:images/" + hardGame.getTable().getCards().get(22).getId() + ".png"));

            }
        }
        if(numberCard == 23){
            if(side){
                hardGame.getTable().turnCardTrue(23);
                card24.setImage(new Image("file:configImages/turnedCard.png"));
            } else {
                card24.setImage(new Image("file:images/" + hardGame.getTable().getCards().get(23).getId() + ".png"));

            }
        }
        if(numberCard == 24){
            if(side){
                hardGame.getTable().turnCardTrue(24);
                card25.setImage(new Image("file:configImages/turnedCard.png"));
            } else {
                card25.setImage(new Image("file:images/" + hardGame.getTable().getCards().get(24).getId() + ".png"));

            }
        }
        if(numberCard == 25){
            if(side){
                hardGame.getTable().turnCardTrue(25);
                card26.setImage(new Image("file:configImages/turnedCard.png"));
            } else {
                card26.setImage(new Image("file:images/" + hardGame.getTable().getCards().get(25).getId() + ".png"));

            }
        }
        if(numberCard == 26){
            if(side){
                hardGame.getTable().turnCardTrue(26);
                card27.setImage(new Image("file:configImages/turnedCard.png"));
            } else {
                card27.setImage(new Image("file:images/" + hardGame.getTable().getCards().get(26).getId() + ".png"));

            }
        }
        if(numberCard == 27){
            if(side){
                hardGame.getTable().turnCardTrue(27);
                card28.setImage(new Image("file:configImages/turnedCard.png"));
            } else {
                card28.setImage(new Image("file:images/" + hardGame.getTable().getCards().get(27).getId() + ".png"));

            }
        }
        if(numberCard == 28){
            if(side){
                hardGame.getTable().turnCardTrue(28);
                card29.setImage(new Image("file:configImages/turnedCard.png"));
            } else {
                card29.setImage(new Image("file:images/" + hardGame.getTable().getCards().get(28).getId() + ".png"));

            }
        }
        if(numberCard == 29){
            if(side){
                hardGame.getTable().turnCardTrue(29);
                card30.setImage(new Image("file:configImages/turnedCard.png"));
            } else {
                card30.setImage(new Image("file:images/" + hardGame.getTable().getCards().get(29).getId() + ".png"));

            }
        }
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
        if(time == 0 || hardGame.getPlayer().getPoints() >= 15){
            Stage window = (Stage) minutes.getScene().getWindow();
            window.setScene(new Scene(FXMLLoader.load(getClass().getResource("endGameScreen.fxml"))));
            window.show();
        }
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
     * Getter of hard, is static because need to switch to another screen
     * @return hard
     */
    public static boolean isHard() {
        return hard;
    }

    /**
     * Getter of points, is static because need to switch to another screen
     * @return points
     */
    public static int getPoints() {
        return points;
    }

    /**
     * Getter of time, is static because need to switch to another screen
     * @return time
     */
    public static int getTime() {
        return time;
    }

    /**
     * Setter of hard, is static because need to switch to another screen
     * @param hard hard
     */
    public static void setHard(boolean hard) {
        HardController.hard = hard;
    }

    /**
     * Start of easy screen
     */
    @FXML
    void initialize() {
        EasyController.setEasy(false);
        hard = true;
        hardScreen.setImage(new Image("file:configImages/gameScreen.png"));
        randomMusic();

        showInitialImages();
        startGame();
        showCards(false);
        minutes.setText("01");
        seconds.setText("30");
        runTime();






        assert hardScreen != null : "fx:id=\"hardScreen\" was not injected: check your FXML file 'hardScreen.fxml'.";
        assert minutes != null : "fx:id=\"minutes\" was not injected: check your FXML file 'hardScreen.fxml'.";
        assert seconds != null : "fx:id=\"seconds\" was not injected: check your FXML file 'hardScreen.fxml'.";
        assert card1 != null : "fx:id=\"card1\" was not injected: check your FXML file 'hardScreen.fxml'.";
        assert card2 != null : "fx:id=\"card2\" was not injected: check your FXML file 'hardScreen.fxml'.";
        assert card3 != null : "fx:id=\"card3\" was not injected: check your FXML file 'hardScreen.fxml'.";
        assert card10 != null : "fx:id=\"card10\" was not injected: check your FXML file 'hardScreen.fxml'.";
        assert card17 != null : "fx:id=\"card17\" was not injected: check your FXML file 'hardScreen.fxml'.";
        assert card24 != null : "fx:id=\"card24\" was not injected: check your FXML file 'hardScreen.fxml'.";
        assert card4 != null : "fx:id=\"card4\" was not injected: check your FXML file 'hardScreen.fxml'.";
        assert card11 != null : "fx:id=\"card11\" was not injected: check your FXML file 'hardScreen.fxml'.";
        assert card18 != null : "fx:id=\"card18\" was not injected: check your FXML file 'hardScreen.fxml'.";
        assert card25 != null : "fx:id=\"card25\" was not injected: check your FXML file 'hardScreen.fxml'.";
        assert card5 != null : "fx:id=\"card5\" was not injected: check your FXML file 'hardScreen.fxml'.";
        assert card12 != null : "fx:id=\"card12\" was not injected: check your FXML file 'hardScreen.fxml'.";
        assert card19 != null : "fx:id=\"card19\" was not injected: check your FXML file 'hardScreen.fxml'.";
        assert card26 != null : "fx:id=\"card26\" was not injected: check your FXML file 'hardScreen.fxml'.";
        assert card6 != null : "fx:id=\"card6\" was not injected: check your FXML file 'hardScreen.fxml'.";
        assert card13 != null : "fx:id=\"card13\" was not injected: check your FXML file 'hardScreen.fxml'.";
        assert card20 != null : "fx:id=\"card20\" was not injected: check your FXML file 'hardScreen.fxml'.";
        assert card27 != null : "fx:id=\"card27\" was not injected: check your FXML file 'hardScreen.fxml'.";
        assert card7 != null : "fx:id=\"card7\" was not injected: check your FXML file 'hardScreen.fxml'.";
        assert card14 != null : "fx:id=\"card14\" was not injected: check your FXML file 'hardScreen.fxml'.";
        assert card21 != null : "fx:id=\"card21\" was not injected: check your FXML file 'hardScreen.fxml'.";
        assert card28 != null : "fx:id=\"card28\" was not injected: check your FXML file 'hardScreen.fxml'.";
        assert card8 != null : "fx:id=\"card8\" was not injected: check your FXML file 'hardScreen.fxml'.";
        assert card15 != null : "fx:id=\"card15\" was not injected: check your FXML file 'hardScreen.fxml'.";
        assert card22 != null : "fx:id=\"card22\" was not injected: check your FXML file 'hardScreen.fxml'.";
        assert card29 != null : "fx:id=\"card29\" was not injected: check your FXML file 'hardScreen.fxml'.";
        assert card9 != null : "fx:id=\"card9\" was not injected: check your FXML file 'hardScreen.fxml'.";
        assert card16 != null : "fx:id=\"card16\" was not injected: check your FXML file 'hardScreen.fxml'.";
        assert card23 != null : "fx:id=\"card23\" was not injected: check your FXML file 'hardScreen.fxml'.";
        assert card30 != null : "fx:id=\"card30\" was not injected: check your FXML file 'hardScreen.fxml'.";

    }
}
