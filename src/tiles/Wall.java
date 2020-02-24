package tiles;

import java.awt.*;

public class Wall extends Tile {
    private static final String URL = "resources/Wall.png";

    public Wall(int x, int y) {
        super(x, y);
    }

    @Override
    public void paint(Graphics graphics) {
        PositionedImage image = new PositionedImage(URL,getX() * SIZE, getY() * SIZE);
        image.draw(graphics);
    }
}
