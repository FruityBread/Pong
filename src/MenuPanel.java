import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;


public class MenuPanel extends JPanel implements Runnable {

    static final int GAME_WIDTH = 1000;
    static final int GAME_HEIGHT = (int)(GAME_WIDTH * (0.5555));
    static final Dimension SCREEN_SIZE = new Dimension(GAME_WIDTH,GAME_HEIGHT);

    Thread menuThread;

    MenuPanel() {
        this.setFocusable(true);
        this.setPreferredSize(SCREEN_SIZE);

        menuThread = new Thread(this);
        menuThread.start(); 
    }

    public void run(){
        long lastTime = System.nanoTime();
        double amountOfTicks = 60.0;
        double ns = 1000000000 / amountOfTicks; // 1 billion / 60
        double delta = 0;

        while(true) {
            long now = System.nanoTime();
            delta += (now - lastTime) / ns;
            lastTime = now;
            if(delta >= 1) {
                repaint();
                delta--;
            }
        }
    }
}
