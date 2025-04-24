
import javax.swing.*;

public class Hitbox {
    double sizeX;
    double sizeY;
    double posX;
    double posY;
    double velX;
    double velY;
    double friction;
    JFrame frame;

    boolean show;
    boolean canCollide;

    public Hitbox(double sizeX, double sizeY, double posX, double posY, double velX, double velY, double friction, boolean show, boolean canCollide) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.posX = posX;
        this.posY = posY;
        this.velX = velX;
        this.velY = velY;
        this.friction = friction;
        this.show = show;
        this.canCollide = canCollide;
    }

    public void updatePos() {
        posX += velX;
        posY += velY;
        velX *= friction;
        velY *= friction;
    }

    public void update() {
        updatePos();
    }



}
