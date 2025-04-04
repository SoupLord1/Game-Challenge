package org.game.components;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

public class Player {
    int size = 50;
    int[] positon = {1,2};
    int speed = 50;
    MoveEvent moveEvent = new MoveEvent();
    
    public void move(KeyEvent keyEvent, int repeatDelay) throws InterruptedException {
        int keyCode = keyEvent.getKeyCode();
        if (moveEvent.eventCode != keyCode) {
            moveEvent.startTime = repeatDelay;
        }
        moveEvent.eventCode = keyCode;
        System.out.println(keyCode);
        System.out.println(KeyEvent.VK_W);

        if (keyCode == KeyEvent.VK_W && keyEvent.getID() == KeyEvent.KEY_PRESSED) {
            if (System.currentTimeMillis() - moveEvent.startTime >= repeatDelay) {
                positon[1] -= speed;
                moveEvent.startTime = System.currentTimeMillis();
            }
        }
        
        if (keyCode == KeyEvent.VK_S && keyEvent.getID() == KeyEvent.KEY_PRESSED) {
            
            if (System.currentTimeMillis() - moveEvent.startTime >= repeatDelay) {
                positon[1] += speed;
                moveEvent.startTime = System.currentTimeMillis();
            }
        }

        if (keyCode == KeyEvent.VK_A && keyEvent.getID() == KeyEvent.KEY_PRESSED) {
            if (System.currentTimeMillis() - moveEvent.startTime >= repeatDelay) {
                positon[0] -= speed;
                moveEvent.startTime = System.currentTimeMillis();
            }
        }

        if (keyCode == KeyEvent.VK_D && keyEvent.getID() == KeyEvent.KEY_PRESSED) {
            
            if (System.currentTimeMillis() - moveEvent.startTime >= repeatDelay) {
                positon[0] += speed;
                moveEvent.startTime = System.currentTimeMillis();
            }
        }
    }
    
    public void draw(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(positon[0], positon[1], size, size);
    }

}

class MoveEvent {
    int eventCode = -1;
    long startTime;
}
