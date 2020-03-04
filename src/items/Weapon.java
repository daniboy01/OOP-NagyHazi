package items;

import tiles.PositionedImage;
import tiles.Tile;

import java.awt.*;

public class Weapon extends Item {
    private int x;
    private int y;
    private int damagePoint;
    private PositionedImage image;

    public Weapon(int x, int y) {
        super(10,"FrostMourne");
        this.x = x;
        this.y = y;
        this.damagePoint = 2;
    }

    @Override
    public void action() {

    }

    @Override
    public void paint(Graphics graphics) {
        image = new PositionedImage("resources/sword.png",x * Tile.SIZE,y * Tile.SIZE);
        image.draw(graphics);
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

    public int getDamagePoint() {
        return damagePoint;
    }

    public void setDamagePoint(int damagePoint) {
        this.damagePoint = damagePoint;
    }

}
