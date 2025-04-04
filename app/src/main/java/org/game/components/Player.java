package org.game.components;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

public class Player {
    int size = 50;
    int[] positon = {1,2};
    int speed = 50;
    
    public void move(int keyCode) {

        if (keyCode == KeyEvent.VK_W) {
            positon[1] -= speed;
        }

        if (keyCode == KeyEvent.VK_S) {
            positon[1] += speed;
        }

        if (keyCode == KeyEvent.VK_A) {
            positon[0] -= speed;
        }

        if (keyCode == KeyEvent.VK_D) {
            positon[0] += speed;
        }
    }
    
    public void draw(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(positon[0], positon[1], size, size);
    }
}
