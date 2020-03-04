package items;

import tiles.PositionedImage;
import tiles.Tile;

import java.awt.*;

public class Weapon extends Item {
    private int damagePoint;
    private PositionedImage image;

    public Weapon(int x, int y) {
        super(10,"FrostMourne",x,y);
        this.damagePoint = 2;
    }

    @Override
    public void action() {

    }

    @Override
    public void paint(Graphics graphics) {
        image = new PositionedImage("resources/sword.png",this.getX() * Tile.SIZE,this.getY() * Tile.SIZE);
        image.draw(graphics);
    }

    public int getDamagePoint() {
        return damagePoint;
    }

    public void setDamagePoint(int damagePoint) {
        this.damagePoint = damagePoint;
    }

    @Override
    public String toString() {
        return this.getName() + " " + "elhasználtásga: " + this.getHP();
    }
}
