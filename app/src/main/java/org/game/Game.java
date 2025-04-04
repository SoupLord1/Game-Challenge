package org.game;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import org.game.components.World;

/* NOTES
 *
 * - IMPORTANT
 * # Please run './gradlew clean' to clear the temp files before pushing 
 * - END
 * 
 * 
 */

public class Game extends JPanel implements KeyListener {
    World world;
    public Game() {
        world = new World();
        addKeyListener(this);
        setFocusable(true);
        requestFocusInWindow();
        setLayout(new BorderLayout());
        add(world, BorderLayout.CENTER);
        setVisible(true);
    }

    public void update() {
        world.update();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Toolkit.getDefaultToolkit().sync();
    }

    @Override
    public void keyPressed(KeyEvent arg0) {
        try {
            world.keyEventHandle(arg0);
        } 
        catch (Exception e) {
            // TODO Auto-generated catch block
        }

    }

    @Override
    public void keyReleased(KeyEvent arg0) {
        try {
            world.keyEventHandle(arg0);
        } catch (Exception e) {
            // TODO Auto-generated catch block
        }
    }

    @Override
    public void keyTyped(KeyEvent arg0) {
        //No Implementation needed
    }
    
}
