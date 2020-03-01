import characters.Hero;
import characters.Monster;
import tiles.Tile;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameBoard extends JComponent implements KeyListener {
    int testBoxX;
    int testBoxY;
    private Tile[][] tiles;
    private Hero hero;
    private Monster m1;
    private Monster m2;
    public Tile[][] getTiles() {
        return tiles;
    }
    public static final int ROWS = 10;
    public static final int COLS = 10;

    public GameBoard() {
        testBoxX = 300;
        testBoxY = 300;
        tiles = new Tile[COLS][ROWS];
        hero = new Hero(1,1);
        m1 = new Monster(3,5);
        m2 = new Monster(7,4);
        FileReader reader = new FileReader();
        tiles = reader.getTiles("resources/board.txt");
        setPreferredSize(new Dimension(Tile.SIZE * COLS, Tile.SIZE * ROWS));
        setVisible(true);
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        for (int i = 0; i < COLS; i++) {
            for (int j = 0; j < ROWS; j++) {
                tiles[i][j].paint(graphics);
            }
        }
        m1.paint(graphics);
        m2.paint(graphics);
        hero.paint(graphics);

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("DIGIT adventure");
        GameBoard board = new GameBoard();
        frame.add(board);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();
        frame.addKeyListener(board);
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == KeyEvent.VK_RIGHT) {
            if (tiles[hero.getPositionX()+1][hero.getPositionY()].canStepOn()) {
                hero.moveRight();
            }
        }
        if (keyEvent.getKeyCode() == KeyEvent.VK_LEFT) {
            if (tiles[hero.getPositionX()-1][hero.getPositionY()].canStepOn()) {
                hero.moveLeft();
            }
        }
        if (keyEvent.getKeyCode() == KeyEvent.VK_UP) {
            if (tiles[hero.getPositionX()][hero.getPositionY()-1].canStepOn()){
                hero.moveUp();
            }
        }
        if (keyEvent.getKeyCode() == KeyEvent.VK_DOWN) {
            if (tiles[hero.getPositionX()][hero.getPositionY()+1].canStepOn()){
                hero.moveDown();
            }
        }

        repaint();
    }
}