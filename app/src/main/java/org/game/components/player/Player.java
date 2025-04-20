package org.game.components.player;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class Player  {
    public Image texture;
    public ImageView imageView;
    public int[] position = {0,0};
    public int speed = 4;

    public Player() {
        try {
            texture = new Image(new FileInputStream("src/main/java/org/game/assets/images/player/player.png"), 128, 128, true, false);
        } catch (FileNotFoundException e) {
        }

        
        
        imageView = new ImageView(texture);
    }

    public void move(KeyEvent event) {
        if (event.getCode() == KeyCode.D) {
            position[0] += speed;
        }
        if (event.getCode() == KeyCode.A) {
            position[0] -= speed;
        }
        if (event.getCode() == KeyCode.S) {
            position[1] += speed;
        }
        if (event.getCode() == KeyCode.W) {
            position[1] -= speed;
        }
        System.err.println("postion: "+position[0]+" "+position[1]);
    }
}
