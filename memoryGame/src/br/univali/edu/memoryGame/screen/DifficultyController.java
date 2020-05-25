package br.univali.edu.memoryGame.screen;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;


public class DifficultyController {
    private MediaPlayer sound;
    private MediaPlayer music = new MediaPlayer(new Media(Paths.get("audio/allude.mp3").toUri().toString()));

    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    private ImageView screen2Image;
    @FXML
    private ImageView difficultyImage;
    @FXML
    private ImageView easyButton;
    @FXML
    private ImageView hardButton;

    /**
     * When click on the easy button, go to easy screen, when the mouse enter on the easy button, exchange the
     * image for a larger, when the mouse comes out of the easy button, exchange the image for a small
     */
    @FXML
    void easyButtonClick(MouseEvent event) throws IOException {
        sound = new MediaPlayer(new Media(Paths.get("audio/buttonClicked.wav").toUri().toString()));
        sound.setVolume(0.03);
        sound.play();

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("easyScreen.fxml"))));
        music.pause();
        window.show();

    }
    @FXML
    void easyButtonEntered(MouseEvent event) {
        easyButton.setImage(new Image("file:configImages/easyEntered.png"));
        sound = new MediaPlayer(new Media(Paths.get("audio/buttonEntered.wav").toUri().toString()));
        sound.setVolume(0.03);
        sound.play();
    }
    @FXML
    void easyButtonExited(MouseEvent event) {
        easyButton.setImage(new Image("file:configImages/easy.png"));

    }

    /**
     * When click on the hard button, go to hard screen, when the mouse enter on the hard button, exchange the
     * image for a larger, when the mouse comes out of the hard button, exchange the image for a small
     */
    @FXML
    void hardButtonClick(MouseEvent event) throws IOException {
        sound = new MediaPlayer(new Media(Paths.get("audio/buttonClicked.wav").toUri().toString()));
        sound.setVolume(0.03);
        sound.play();

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("hardScreen.fxml"))));
        music.pause();
        window.show();
    }
    @FXML
    void hardButtonEntered(MouseEvent event) {
        hardButton.setImage(new Image("file:configImages/hardEntered.png"));
        sound = new MediaPlayer(new Media(Paths.get("audio/buttonEntered.wav").toUri().toString()));
        sound.setVolume(0.03);
        sound.play();
    }
    @FXML
    void hardButtonExited(MouseEvent event) {
        hardButton.setImage(new Image("file:configImages/hard.png"));
    }

    @FXML
    void initialize() {
        screen2Image.setImage(new Image("file:configImages/difficultScreen.png"));
        difficultyImage.setImage(new Image("file:configImages/difficultTittle.png"));
        easyButton.setImage(new Image("file:configImages/easy.png"));
        hardButton.setImage(new Image("file:configImages/hard.png"));
        music.setVolume(0.03);
        music.play();

        assert screen2Image != null : "fx:id=\"screen2Image\" was not injected: check your FXML file 'difficultyScreen.fxml'.";
        assert difficultyImage != null : "fx:id=\"difficultyImage\" was not injected: check your FXML file 'difficultyScreen.fxml'.";
        assert easyButton != null : "fx:id=\"easyButton\" was not injected: check your FXML file 'difficultyScreen.fxml'.";
        assert hardButton != null : "fx:id=\"hardButton\" was not injected: check your FXML file 'difficultyScreen.fxml'.";

    }

}
