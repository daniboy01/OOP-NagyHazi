package characters;

import tiles.PositionedImage;

import java.awt.*;

public class Hero extends Character {
    private static final String URL = "resources/pilászy.PNG";

    public Hero(int x, int y, int HP, int strikePower) {
        super(x, y, HP, strikePower);
    }

    @Override
    public void paint(Graphics graphics) {
        PositionedImage image = new PositionedImage(URL,getX(),getY());
        image.draw(graphics);
    }
}
