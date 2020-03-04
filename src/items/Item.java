package items;

import java.awt.*;

public abstract class Item {
    private int HP;
    private String name;

    public Item(int HP, String name) {
        this.HP = HP;
        this.name = name;
    }

    public abstract void action();
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
}
