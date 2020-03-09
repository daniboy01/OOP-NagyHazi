package display;

import characters.Hero;
import characters.Monster;
import commands.ActionController;
import items.Item;
import tiles.Tile;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class GameBoard extends JComponent implements KeyListener {
    int testBoxX;
    int testBoxY;
    private Tile[][] tiles;
    private Hero hero;
    public Tile[][] getTiles() {
        return tiles;
    }
    public static final int ROWS = 10;
    public static final int COLS = 15;
    private ArrayList<Monster> monsters;
    private ArrayList<Item> items;
    private ActionController cmp;

    public GameBoard() {
        testBoxX = 300;
        testBoxY = 300;
        tiles = new Tile[COLS][ROWS];
        hero = new Hero(1, 1);
        FileReader reader = new FileReader();
        tiles = reader.getTiles("resources/board.txt");
        monsters = reader.getMonsters();
        items = reader.getItems();
        setPreferredSize(new Dimension(Tile.SIZE * COLS, Tile.SIZE * ROWS));
        setVisible(true);
        cmp = new ActionController(this);
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        for (int i = 0; i < COLS; i++) {
            for (int j = 0; j < ROWS; j++) {
                tiles[i][j].paint(graphics);
            }
        }
        if (monsters.size() != 0){
            for (Monster m : monsters) {
                m.paint(graphics);
            }
        }

        if (items.size() != 0) {
            for (Item i : items){
                i.paint(graphics);
            }
        }
        hero.paint(graphics);

    }

//    public static void main(String[] args) {
//        GameBoard gameBoard = new GameBoard();
//        GameWindow gameWindow = new GameWindow(gameBoard);
//    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == KeyEvent.VK_RIGHT) {
            cmp.moveRight();
        }
        if (keyEvent.getKeyCode() == KeyEvent.VK_LEFT) {
            cmp.moveLeft();
        }
        if (keyEvent.getKeyCode() == KeyEvent.VK_UP) {
            cmp.moveUp();
        }
        if (keyEvent.getKeyCode() == KeyEvent.VK_DOWN) {
            cmp.moveDown();
        }
        if (keyEvent.getKeyCode() == KeyEvent.VK_SPACE){
            cmp.attack();
        }
        if (keyEvent.getKeyCode() == KeyEvent.VK_F){
            cmp.pickUp();
        }
        repaint();
    }

    public Hero getHero() {
        return hero;
    }

    public ArrayList<Monster> getMonsters() {
        return monsters;
    }

    public ArrayList<Item> getItems() {
        return items;
    }
}