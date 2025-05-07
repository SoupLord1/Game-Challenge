package org.game;


import org.game.components.World;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
 
public class App extends Application {

    World world;
    
    public static void main(String[] args) {
        launch(args);
    }
    
    public Scene scene(){
        
        

        BorderPane root = new BorderPane();
        root.setPrefSize(1080, 1080);
    
        AnimationTimer timer = new AnimationTimer() {

            @Override
            public void handle(long now) {
                world.update();
            }
        };



        timer.start();

        Scene parent = new Scene(root);

       parent.addEventHandler(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>() {

        @Override
        public void handle(KeyEvent event) {
            world.keyPressedHandler(event);
        }
       });

       parent.addEventHandler(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {

        @Override
        public void handle(KeyEvent event) {
            world.keyReleasedHandler(event);
            
        }
       });

        world = new World(parent);

        root.getChildren().add(world);


        return parent;


    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Game");
        primaryStage.setScene(scene());
        primaryStage.show();
    }
}