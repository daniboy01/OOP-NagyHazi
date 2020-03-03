package characters;

import tiles.PositionedImage;
import tiles.Tile;

import java.awt.*;

public class Monster extends Character {
    private int x;
    private int y;
    private static final String URL = "resources/skeleton.png";

    public Monster(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void paint(Graphics graphics) {
        PositionedImage image = new PositionedImage(URL,x * Tile.SIZE,y * Tile.SIZE);
        image.draw(graphics);
    }
}
