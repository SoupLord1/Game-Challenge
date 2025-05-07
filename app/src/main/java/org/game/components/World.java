package org.game.components;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import org.game.components.player.Player;
import org.game.components.tile.TileLayer;

import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;

public class World extends Pane {
    public Player player;
    public HashMap<KeyCode, Boolean> keysHeld = new HashMap<KeyCode, Boolean>();
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public World(Scene scene) { 

        player = new Player(scene);

        keysHeld.put(KeyCode.W, false);
        keysHeld.put(KeyCode.S, false);
        keysHeld.put(KeyCode.A, false);
        keysHeld.put(KeyCode.D, false);

        TileLayer testTileSurface = null;
        try {
            testTileSurface = new TileLayer(new Image(new FileInputStream("assets/images/tiles/stone1.png"), 128, 128, true, false), null, 0);
        } catch (FileNotFoundException e) {
        }
        ObservableList worldNodes = this.getChildren();
        
        worldNodes.add(testTileSurface.imageView);
        worldNodes.add(player.imageView);
        setVisible(true);
        this.setStyle("-fx-background-color: white");
    }

    public void update() {
        player.update(this);
    }


    public void keyPressedHandler(KeyEvent event) {
        keysHeld.replace(event.getCode(), true);
    }

    public void keyReleasedHandler(KeyEvent event) {
        keysHeld.replace(event.getCode(), false);
    }

}
