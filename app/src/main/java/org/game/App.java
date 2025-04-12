package org.game;

import org.game.components.World;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
 
public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");
        World world = new World();

        BorderPane root = new BorderPane();
        root.setCenter(world);
        primaryStage.setScene(new Scene(root, 720, 1080));
        primaryStage.show();
    }
}