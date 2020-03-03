package characters;

import tiles.PositionedImage;
import tiles.Tile;

import java.awt.*;

public class Hero extends Character {
    private int positionX;
    private int positionY;
    private String move = "default";
    private PositionedImage image;


    public Hero(int positionX, int positionY) {
        this.setStrikePower(2);
        this.setHP(10);
        this.positionX = positionX;
        this.positionY = positionY;
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

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void attack(Monster monster) {
        if (this.getPositionX() == monster.getX() && this.getPositionY() == monster.getY()) {
            monster.gotDamage(this.getStrikePower());
        }
    }
}
