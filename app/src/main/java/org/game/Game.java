package org.game;

import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import org.game.components.Player;

/* NOTES
 * 
 */

public class Game extends JPanel implements KeyListener {
    public Player player;
    public Game() {
        player = new Player();

        addKeyListener(this);
        setFocusable(true);
        requestFocusInWindow();
    }

    public void update() {

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        player.draw(g);

        Toolkit.getDefaultToolkit().sync();
    }

    @Override
    public void keyPressed(KeyEvent arg0) {
        int keyCode = arg0.getKeyCode();
        player.move(keyCode);
        System.out.println(keyCode);

    }

    @Override
    public void keyReleased(KeyEvent arg0) {
        int keyCode = arg0.getKeyCode();
    }

    @Override
    public void keyTyped(KeyEvent arg0) {
        int keyCode = arg0.getKeyCode();
    }
    
}
