import javax.swing.*;
import java.awt.*;

public class Player {
    private ImageIcon icon;
    private int x;
    private int y;

    public Player (int x, int y){
        this.icon = new ImageIcon("image/bird.png");
        this.x = x;
        this.y = y;
    }
    public void paint (Graphics graphics, GameScene gameScene){
        this.icon.paintIcon(gameScene, graphics, this.x, this.y);
    }

    public ImageIcon getIcon() {
        return icon;
    }

    public void setIcon(ImageIcon icon) {
        this.icon = icon;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
