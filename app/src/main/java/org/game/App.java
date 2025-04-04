package org.game;

import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.Timer;


public class App extends JFrame {

    public App() {
        
        setTitle("Game");
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        Game game = new Game();

        add(game);

        Timer timer = new Timer(10, (ActionEvent e) -> {
            game.update();
            game.repaint();
        });
        timer.start();
        setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new App());
    }
}