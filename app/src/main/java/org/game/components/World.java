package org.game.components;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;

public class World extends JPanel {
    Player player;
    public World() {
        player = new Player(); 
        this.setBackground(Color.WHITE);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        player.draw(g);

        Toolkit.getDefaultToolkit().sync();
    }
    public void update() {

    }
    public void keyEventHandle(KeyEvent keyEvent) throws InterruptedException {
        player.move(keyEvent, 500);
    }
}
