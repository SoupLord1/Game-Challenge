package org.game.components;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.game.components.Tile.TileLayer;

import javafx.collections.ObservableList;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;

public class World extends Pane {
    public Player player = new Player();
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public World() { 
        TileLayer testTileSurface = null;
        try {
            testTileSurface = new TileLayer(new Image(new FileInputStream("src/main/java/org/game/assets/images/tiles/stone1.png"), 128, 128, true, false), null, 0);
        } catch (FileNotFoundException e) {
        }
        ObservableList worldNodes = this.getChildren();
        
        worldNodes.add(testTileSurface.imageView);
        worldNodes.add(player.imageView);
        setVisible(true);
        this.setStyle("-fx-background-color: white");



        
        
    }

    public void update() {
        player.imageView.setX(player.position[0]);
        player.imageView.setY(player.position[1]);
    }


}
