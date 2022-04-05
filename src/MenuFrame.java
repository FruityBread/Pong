import java.awt.*;
import javax.swing.*;

public class MenuFrame extends JFrame{

    MenuPanel menuPanel;

    MenuFrame(){
        menuPanel = new MenuPanel();
        this.add(menuPanel);
        this.setTitle("Pong Menu");
        this.setResizable(false);
        this.setBackground(Color.black);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
