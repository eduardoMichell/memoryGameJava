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


public class GameStartController {
    private MediaPlayer sound;
    private MediaPlayer music = new MediaPlayer(new Media(Paths.get("audio/resonance.mp3").toUri().toString()));

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView initialScreen;

    @FXML
    private ImageView playButton;

    @FXML
    private ImageView exitButton;

    /**
     * When click on the exit button, shut down the game, when the mouse enter on the exit button, exchange the
     * image for a larger, when the mouse comes out of the exit button, exchange the image for a small
     */
    @FXML
    void exitButtonClick(MouseEvent event) {
        sound = new MediaPlayer(new Media(Paths.get("audio/buttonClicked.wav").toUri().toString()));
        sound.setVolume(0.03);
        sound.play();

        Stage stage = (Stage) exitButton.getScene().getWindow();
        stage.close();
        System. exit(-1);
    }
    @FXML
    void exitButtonEntered(MouseEvent event) {
        exitButton.setImage(new Image("file:configImages/exitEntered.png"));
        sound = new MediaPlayer(new Media(Paths.get("audio/buttonEntered.wav").toUri().toString()));
        sound.setVolume(0.03);
        sound.play();
    }
    @FXML
    void exitButtonExited(MouseEvent event) {
        exitButton.setImage(new Image("file:configImages/exit.png"));
    }


    /**
     * When click on the play button, go to difficulty screen, when the mouse enter on the play button, exchange the
     * image for a larger, when the mouse comes out of the play button, exchange the image for a small
     */
    @FXML
    void playButtonClick(MouseEvent event) throws IOException {
        sound = new MediaPlayer(new Media(Paths.get("audio/buttonClicked.wav").toUri().toString()));
        sound.setVolume(0.03);
        sound.play();

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("difficultyScreen.fxml"))));
        music.pause();
        window.show();

    }
    @FXML
    void playButtonEntered(MouseEvent event) {
        playButton.setImage(new Image("file:configImages/playButtonEntered.png"));
        sound = new MediaPlayer(new Media(Paths.get("audio/buttonEntered.wav").toUri().toString()));
        sound.setVolume(0.03);
        sound.play();
    }
    @FXML
    void playButtonExited(MouseEvent event) {
        playButton.setImage(new Image("file:configImages/playButton.png"));
    }

    @FXML
    void initialize() {
        initialScreen.setImage(new Image("file:configImages/tittleGame.png"));
        exitButton.setImage(new Image("file:configImages/exit.png"));
        playButton.setImage(new Image("file:configImages/playButton.png"));
        music.setVolume(0.03);
        music.play();
        assert initialScreen != null : "fx:id=\"initialScreen\" was not injected: check your FXML file 'gameStartScreen.fxml'.";
        assert playButton != null : "fx:id=\"playButton\" was not injected: check your FXML file 'gameStartScreen.fxml'.";
        assert exitButton != null : "fx:id=\"exitButton\" was not injected: check your FXML file 'gameStartScreen.fxml'.";

    }

}


