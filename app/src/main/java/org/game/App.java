package org.game;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class App extends JFrame {

    public App() {
        
        setTitle("Game");
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        Game game = new Game();

        add(game);

        Timer timer = new Timer(5, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                game.update();
                game.repaint();
            }
        });
        timer.start();
        setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new App());
    }
}