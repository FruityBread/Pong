package Game_Objects;

import java.awt.*;

public class Score extends Rectangle{

    static int GAME_WIDTH;
    static int GAME_HEIGHT;
    public int player1;
    public int player2;

    public Score(int GAME_WIDTH, int GAME_HEIGHT){
        Score.GAME_WIDTH = GAME_WIDTH;
        Score.GAME_HEIGHT = GAME_HEIGHT;
    }

    public void draw(Graphics g) {
        g.setColor(Color.white);
        g.setFont(new Font("Consolas", Font.PLAIN, 60));

        g.drawString(String.valueOf(player1/10) + String.valueOf(player1%10), 
            (GAME_WIDTH / 2) - 105, 50);

        g.drawString(String.valueOf(player2/10) + String.valueOf(player2%10), 
            (GAME_WIDTH / 2) + 40, 50);
    }
}
