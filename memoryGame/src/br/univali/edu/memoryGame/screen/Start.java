package br.univali.edu.memoryGame.screen;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class Start extends Application {
   
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Pane root  = FXMLLoader.load(getClass().getResource("gameStartScreen.fxml"));
        Scene scene = new Scene(root, 900,700);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Memory Game");
        primaryStage.show();
    }
}
