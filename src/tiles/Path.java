package tiles;
import java.awt.*;

public class Path extends Tile  {

    private static final String URL = "resources/floor.gif";

    public Path(int x, int y) {
        super(x, y);
    }

    @Override
    public void paint(Graphics graphics) {
        PositionedImage image = new PositionedImage(URL,getX() * SIZE,getY() * SIZE);
        image.draw(graphics);
    }

    @Override
    public boolean canStepOn() {
        return true;
    }

}
