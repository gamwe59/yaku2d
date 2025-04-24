
import java.awt.*;
import javax.swing.*;

public class Box extends JPanel {
    Color color;
    int posX;
    int posY;
    int sizeX;
    int sizeY;

    @Override
    protected void paint(Graphics g) {
        super.paintComponent(g);
        g.setColor(color);
        g.drawRect(posX, posY, sizeX, sizeY);
    }

    public Box(Color color, int posX, int posY, int sizeX, int sizeY) {
        this.color = color;
        this.posX = posX;
        this.posY = posY;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }
    public Box(int posX, int posY, int sizeX, int sizeY) {
        this.color = Color.CYAN;
        this.posX = posX;
        this.posY = posY;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }
    public Box(int posX, int posY) {
        this.color = Color.CYAN;
        this.posX = posX;
        this.posY = posY;
        this.sizeX = 50;
        this.sizeY = 50;
    }
}
