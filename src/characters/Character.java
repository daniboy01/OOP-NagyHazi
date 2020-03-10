package characters;

import java.awt.*;

public abstract class Character {
    private int HP;
    private int strikePower;

    public abstract void paint(Graphics graphics);

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getStrikePower() {
        return strikePower;
    }

    public void setStrikePower(int strikePower) {
        this.strikePower = strikePower;
    }

    public abstract boolean isAlive();
}
