package characters;

import items.Item;
import items.Weapon;
import tiles.PositionedImage;
import tiles.Tile;

import java.awt.*;

public class Hero extends Character {
    private int positionX;
    private int positionY;
    private String move = "default";
    private PositionedImage image;
    private Invetory invetory;


    public Hero(int positionX, int positionY) {
        this.setStrikePower(1);
        this.setHP(10);
        this.positionX = positionX;
        this.positionY = positionY;
        this.invetory = new Invetory();
    }

    @Override
    public void paint(Graphics graphics) {
        switch (move) {
            case "default":
                image = new PositionedImage("resources/hero-down.png",positionX * Tile.SIZE,positionY * Tile.SIZE);
                image.draw(graphics);
                break;
            case "right":
                image = new PositionedImage("resources/hero-right.png",positionX * Tile.SIZE,positionY * Tile.SIZE);
                image.draw(graphics);
                break;
            case "left":
                image = new PositionedImage("resources/hero-left.png",positionX * Tile.SIZE,positionY * Tile.SIZE);
                image.draw(graphics);
                break;
            case "up":
                image = new PositionedImage("resources/hero-up.png",positionX * Tile.SIZE,positionY * Tile.SIZE);
                image.draw(graphics);
                break;
            case "down":
                image = new PositionedImage("resources/hero-down.png",positionX * Tile.SIZE,positionY * Tile.SIZE);
                image.draw(graphics);
                break;
        }
    }

    @Override
    public boolean isAlive() {
        return this.getHP() > 0;
    }

    public void moveRight(){
        positionX +=1;
        move = "right";
    }

    public void moveLeft() {
        positionX -=1;
        move = "left";
    }

    public void moveDown() {
        positionY += 1;
        move = "down";
    }

    public void moveUp() {
        positionY -= 1;
        move = "up";
    }

    public int getX() {
        return positionX;
    }

    public int getY() {
        return positionY;
    }

    public boolean attack(Monster monster) {
        if (this.getX() == monster.getX() && this.getY() == monster.getY()) {
            monster.gotDamage(this);
            return true;
        }
        return false;
    }

    public void gotDamage(Monster monster){
        this.setHP(this.getHP()-monster.getStrikePower());
    }

    public boolean pickUp(Item weapon) {
        if (this.getX() == weapon.getX() && this.getY() == weapon.getY()){
            this.invetory.addItem(weapon);
            this.setStrikePower(((Weapon) weapon).getDamagePoint());
            System.out.println("Fegyver felvéve");
            System.out.println(this.invetory.getItems().toString());
            return true;
        }
        return false;
    }
}
