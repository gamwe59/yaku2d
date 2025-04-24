import java.awt.*;
import javax.swing.*;

public class Frame {
    JFrame frame;
    JPanel p;
    Camera c;
    public Frame() {
        frame = new JFrame("Yakuza 2D");
        p = new JPanel();
        c = new Camera(50, 0, 0);
        frame.setSize(1600, 900);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        drawBox(100, 100, 100, 100, Color.BLACK);
        frame.setVisible(true);
    }

    public Box drawBox(double posX, double posY, double sizeX, double sizeY, Color color) {
        int[] pos = c.worldToPixel(posX, posY);
        int[] size = c.worldToPixelSize(posX, posY);

        Box box = new Box(color, pos[0], pos[1], size[0], size[1]);
        frame.add(box);

        return box;
    }
}
