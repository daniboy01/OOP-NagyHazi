package items;

import java.awt.*;

public abstract class Item {
    private int HP;
    private String name;
    private int x;
    private int y;

    public Item(int HP, String name, int x, int y) {
        this.HP = HP;
        this.name = name;
        this.x = x;
        this.y = y;
    }


    public abstract void paint(Graphics graphics);

    public int getHP() {
        return HP;
    }

    public String getName() {
        return name;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public void setName(String name) {
        this.name = name;
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
}
