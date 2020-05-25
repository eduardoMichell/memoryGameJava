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
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class EndGameController {
    private MediaPlayer sound;
    private MediaPlayer music;
    private int gamePoints = 0;
    private int time = 0;


    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    private ImageView endgameScreen;
    @FXML
    private ImageView result1;
    @FXML
    private ImageView result2;
    @FXML
    private ImageView replay;
    @FXML
    private ImageView exit;
    @FXML
    private Text minutes;
    @FXML
    private Text seconds;
    @FXML
    private Text points;

    /**
     * When click on the exit button, shut down the game, when the mouse enter on the exit button, exchange the
     * image for a larger, when the mouse comes out of the exit button, exchange the image for a small
     */
    @FXML
    void exitClicked(MouseEvent event) {
        sound = new MediaPlayer(new Media(Paths.get("audio/buttonClicked.wav").toUri().toString()));
        sound.setVolume(0.03);
        sound.play();

        Stage stage = (Stage) exit.getScene().getWindow();
        stage.close();
        System. exit(-1);
    }
    @FXML
    void exitEntered(MouseEvent event) {
        this.exit.setImage(new Image("file:configImages/exitEntered.png"));
        sound = new MediaPlayer(new Media(Paths.get("audio/buttonEntered.wav").toUri().toString()));
        sound.setVolume(0.03);
        sound.play();
    }
    @FXML
    void exitExited(MouseEvent event) {
        this.exit.setImage(new Image("file:configImages/exit.png"));
    }

    /**
     * When click on the replay button, back to difficulty screen, when the mouse enter on the replay button, exchange the
     * image for a larger, when the mouse comes out of the replay button, exchange the image for a small
     */
    @FXML
    void replayClicked(MouseEvent event) throws IOException {
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("difficultyScreen.fxml"))));
        music.pause();
        window.show();
    }
    @FXML
    void replayEntered(MouseEvent event) {
        replay.setImage(new Image("file:configImages/replayEntered.png"));
        sound = new MediaPlayer(new Media(Paths.get("audio/buttonEntered.wav").toUri().toString()));
        sound.setVolume(0.03);
        sound.play();
    }
    @FXML
    void replayExited(MouseEvent event) {
        replay.setImage(new Image("file:configImages/replay.png"));
    }


    /**
     * Check if the game was hard or easy
     */
    public void verifyInformation(){
        if(EasyController.isEasy()){
            time = EasyController.getTime();
            gamePoints = EasyController.getPoints();
        } else {
            if(HardController.isHard()){
                time = HardController.getTime();
                gamePoints = HardController.getPoints();
            }
        }

    }

    /**
     * Calculate the used time of match
     * @return used time
     */
    public int calculateTime(){
        int usedTime = 0;
       if(EasyController.isEasy()) {
           if (time > 1) {
               usedTime = 120 - time - 1;
           } else {
               usedTime = 120;
           }
       } else {
           if(time > 1) {
               usedTime = 90 - time-1;
           } else {
               usedTime = 90;
           }
       }
       return usedTime;
    }

    /**
     * Set the information of game.
     */
    public void takeInformation(){

        int usedTime = calculateTime();

        this.points.setText(String.format("%02d", gamePoints));
        int seg = usedTime % 60;
        int min = usedTime / 60;
        min %=  60;
        this.minutes.setText(String.format("%02d", min));
        this.seconds.setText(String.format("%02d", seg));

    }

    /**
     * Print the information of game on screen
     */
    public void result(){
        if(time > 1){
            this.result1.setImage(new Image("file:configImages/winBack.png"));
            result2.setImage(new Image("file:configImages/win.png"));
            music = new MediaPlayer(new Media(Paths.get("audio/victory.mp3").toUri().toString()));
        } else {
            this.result1.setImage(new Image("file:configImages/loseBack.png"));
            result2.setImage(new Image("file:configImages/lose.png"));
            music = new MediaPlayer(new Media(Paths.get("audio/lose.mp3").toUri().toString()));

        }
        music.setVolume(0.03);
        music.play();
    }

    @FXML
    void initialize() {
        time = 0;
        gamePoints = 0;
        this.endgameScreen.setImage(new Image("file:configImages/endgame.png"));
        this.replay.setImage(new Image("file:configImages/replay.png"));
        this.exit.setImage(new Image("file:configImages/exit.png"));
        verifyInformation();
        takeInformation();
        result();

        assert endgameScreen != null : "fx:id=\"endgameScreen\" was not injected: check your FXML file 'endGameScreen.fxml'.";
        assert result1 != null : "fx:id=\"result1\" was not injected: check your FXML file 'endGameScreen.fxml'.";
        assert result2 != null : "fx:id=\"result2\" was not injected: check your FXML file 'endGameScreen.fxml'.";
        assert replay != null : "fx:id=\"replay\" was not injected: check your FXML file 'endGameScreen.fxml'.";
        assert exit != null : "fx:id=\"exit\" was not injected: check your FXML file 'endGameScreen.fxml'.";
        assert minutes != null : "fx:id=\"minutes\" was not injected: check your FXML file 'endGameScreen.fxml'.";
        assert seconds != null : "fx:id=\"seconds\" was not injected: check your FXML file 'endGameScreen.fxml'.";
        assert points != null : "fx:id=\"points\" was not injected: check your FXML file 'endGameScreen.fxml'.";

    }
}
