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

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    public abstract void paint(Graphics graphics);

    public abstract boolean canStepOn();
}
