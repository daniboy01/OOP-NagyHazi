package tiles;

import javax.swing.*;
import java.awt.*;

public abstract class Tile extends JComponent {
    private int x;
    private int y;
    public static final int SIZE = 72;

    public Tile(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public int getX() {
        return x;
    }
    @Override
    public int getY() {
        return y;
    }
    public abstract void paint(Graphics graphics);
}
