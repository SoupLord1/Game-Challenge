package org.game;

import java.io.FileNotFoundException;

import org.game.components.World;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
 
public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    public Scene scene(){
        World world = new World();
        

        BorderPane root = new BorderPane();
        root.setPrefSize(1080, 1080);
        root.setCenter(world);

        AnimationTimer timer = new AnimationTimer() {

            @Override
            public void handle(long now) {
                world.update();
            }
        };



        timer.start();

        Scene parent = new Scene(root);

        parent.setOnKeyPressed(e -> {
            world.player.move(e);
        });

        return parent;


    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Game");
        primaryStage.setScene(scene());
        primaryStage.show();
    }
}