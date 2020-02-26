package characters;

import java.awt.*;

public abstract class Character {
    private int x;
    private int y;
    private int HP;
    private int strikePower;

    public Character(int x, int y, int HP, int strikePower) {
        this.x = x;
        this.y = y;
        this.HP = HP;
        this.strikePower = strikePower;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getHP() {
        return HP;
    }

    public int getStrikePower() {
        return strikePower;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public void setStrikePower(int strikePower) {
        this.strikePower = strikePower;
    }

    public abstract void paint(Graphics graphics);
}
