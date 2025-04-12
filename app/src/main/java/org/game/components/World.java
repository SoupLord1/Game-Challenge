package org.game.components;

import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class World extends Pane {
    Button test;
    public World() {
        test = new Button("button");
        test.setLayoutX(10);
        test.setLayoutY(10);
        setVisible(true);
        this.setStyle("-fx-background-color: black");
        this.getChildren().add(test);
        test.setVisible(true);
        
    }

    public void update() {

    }
}
