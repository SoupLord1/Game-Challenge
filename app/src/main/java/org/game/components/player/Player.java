package org.game.components.player;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;

import org.game.components.World;

import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;

public class Player  {
    public Boolean canMove;
    final int canMoveTimerMax = 1;
    int canMoveTimer = 0;
    public Image texture;
    public ImageView imageView;
    public int[] position = {0,0};
    public int speed = 4;

    public Player(Scene scene) {
        try {
            texture = new Image(new FileInputStream("assets/images/player/player.png"), 128, 128, true, false);
        } catch (FileNotFoundException e) {}
        
        
        imageView = new ImageView(texture);
        canMove = true;
    }

    public void move(HashMap<KeyCode,Boolean> keysHeld) {
        if (canMove) {
            if (keysHeld.get(KeyCode.W) && keysHeld.get(KeyCode.A)) {
                position[1] -= speed;
                position[0] -= speed;
            }
            else if (keysHeld.get(KeyCode.W) && keysHeld.get(KeyCode.D)) {
                position[1] -= speed;
                position[0] += speed;
            }
            else if (keysHeld.get(KeyCode.S) && keysHeld.get(KeyCode.A)) {
                position[0] -= speed;
                position[1] += speed;
                
            }
            else if (keysHeld.get(KeyCode.S) && keysHeld.get(KeyCode.D)) {
                position[0] += speed;
                position[1] += speed;
            }
            else if (keysHeld.get(KeyCode.W)) {
                position[1] -= speed;
            }
            else if (keysHeld.get(KeyCode.S)) {
                position[1] += speed;
            }
            else if (keysHeld.get(KeyCode.A)) {
                position[0] -= speed;
            }
            else if (keysHeld.get(KeyCode.D)) {
                position[0] += speed;
            }
            canMove = false;
            canMoveTimer = canMoveTimerMax;
            return;
        }
        canMoveTimer--;
        if (canMoveTimer < 1) {
            canMove = true;
        }
    }

    public void update(World world){
        imageView.setX(position[0]);
        imageView.setY(position[1]);
        move(world.keysHeld);
    }
}

