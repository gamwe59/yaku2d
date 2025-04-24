public class Camera {
    int PPU; //Pixels per unit
    double posX;
    double posY;

    public Camera(int PPU, double posX, double posY) {
        this.PPU = PPU;
        this.posX = posX;
        this.posY = posY;
    }

    public int[] worldToPixel(double posX, double posY) {
        int[] pos = new int[2];
        pos[0] = (int)((posX-this.posX)*PPU);
        pos[1] = (int)((posY-this.posY)*PPU);
        return pos;
    }

    public int[] worldToPixelSize(double posX, double posY) {
        int[] pos = new int[2];
        pos[0] = (int)((posX)*PPU);
        pos[1] = (int)((posY)*PPU);
        return pos;
    }

    public void setPos(double posX, double posY) {
        this.posX = posX;
        this.posY = posY;
    }
    public void lerp(double posX, double posY, double factor) {
        this.posX = (this.posX+posX)/factor;
        this.posY = (this.posY+posY)/factor;
    }
}
