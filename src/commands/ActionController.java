package commands;
import characters.Hero;
import characters.Monster;
import display.GameBoard;
import display.GameWindow;
import items.Item;
import tiles.Tile;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class ActionController implements KeyListener {
    private GameBoard gameBoard;
    private GameWindow gameWindow;
    private Hero hero;
    private Tile[][] tiles;
    private ArrayList<Monster> monsters;
    private ArrayList<Item> items;


    public ActionController(GameBoard gameBoard,GameWindow gameWindow) {
        this.gameBoard = gameBoard;
        this.gameWindow = gameWindow;
        this.gameWindow.getFrame().addKeyListener(this);
        this.hero = gameBoard.getHero();
        this.tiles = gameBoard.getTiles();
        this.monsters = gameBoard.getMonsters();
        this.items = gameBoard.getItems();
    }

    public void moveUp() {
        if (tiles[hero.getX()][hero.getY()-1].canStepOn()) {
            hero.moveUp();
        }
    }

    public void moveDown() {
        if (tiles[hero.getX()][hero.getY()+1].canStepOn()) {
            hero.moveDown();
        }

    }

    public void moveLeft() {
        if (tiles[hero.getX()-1][hero.getY()].canStepOn()) {
            hero.moveLeft();
        }
    }

    public void moveRight() {
        if (tiles[hero.getX()+1][hero.getY()].canStepOn()) {
            hero.moveRight();
        }
    }

    public boolean attack() {
        for (int i = 0; i < monsters.size(); i++) {
            hero.attack(monsters.get(i));
            monsters.get(i).attack(hero);
            if (!monsters.get(i).isAlive()){
                monsters.remove(monsters.get(i));
                return true;
            }

        }
        return false;
    }

    public boolean pickUp() {
        for (int i = 0; i < items.size(); i++) {
            if (hero.pickUp(items.get(i))) {
                items.remove(items.get(i));
                return true;
            }
        }
        return false;
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {}

    @Override
    public void keyPressed(KeyEvent keyEvent) {}

    @Override
    public void keyReleased(KeyEvent keyEvent) {
        try {
            switch (keyEvent.getKeyCode()) {
                case KeyEvent.VK_RIGHT:
                    this.moveRight();
                    break;
                case KeyEvent.VK_LEFT:
                    this.moveLeft();
                    break;
                case KeyEvent.VK_UP:
                    this.moveUp();
                    break;
                case KeyEvent.VK_DOWN:
                    this.moveDown();
                    break;
                case KeyEvent.VK_SPACE:
                    this.attack();
                    break;
                case KeyEvent.VK_F:
                    this.pickUp();
                    break;
            }
            gameBoard.repaint();
            gameWindow.updateInfo(this.gameBoard);
            if (!hero.isAlive()){
                JOptionPane.showMessageDialog(gameWindow.getFrame(),"A játékos meghalt");
                hero = null;
            }
        } catch (Exception e) {}
    }
}
