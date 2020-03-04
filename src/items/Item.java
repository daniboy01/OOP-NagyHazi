package items;

public abstract class Item {
    private int HP;
    private String name;

    public Item(int HP, String name) {
        this.HP = HP;
        this.name = name;
    }

    public abstract void action();

    public int getHP() {
        return HP;
    }

    public String getName() {
        return name;
    }
}
