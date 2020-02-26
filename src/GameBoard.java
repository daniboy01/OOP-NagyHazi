import characters.Hero;
import tiles.Path;
import tiles.Tile;
import tiles.Wall;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameBoard extends JComponent implements KeyListener {

    int testBoxX;
    int testBoxY;

    private Tile[][] tiles;
    private Hero hero;

    public Tile[][] getTiles() {
        return tiles;
    }

    private static final int ROWS = 10;
    private static final int COLUMNS = 10;

    public GameBoard() {
        testBoxX = 300;
        testBoxY = 300;
        tiles = new Tile[ROWS][COLUMNS];
        hero = new Hero(1,1,10,5);

//        for (int i = 0; i < ROWS; i++) {
//////            for (int j = 0; j < COLUMNS; j++) {
//////                tiles[i][j] = new Path(i, j);
//////            }
//////
//////            tiles[1][1] = new Wall(1,1);
//////            tiles[1][2] = new Wall(1,2);
//////            tiles[1][3] = new Wall(1,3);
//////            tiles[1][4] = new Wall(1,4);
//////
//////            // set the size of your draw board
//////            setPreferredSize(new Dimension(720, 720));
//////            setVisible(true);
//////        }
        FileReader reader = new FileReader();
        tiles = reader.getTiles("resources/board.txt");
        setPreferredSize(new Dimension(720, 720));
        setVisible(true);
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        // here you have a 720x720 canvas
        // you can create and draw an image using the class below e.g.
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                tiles[i][j].paint(graphics);
            }
        }
        hero.paint(graphics);

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("DIGIT adventure");
        GameBoard board = new GameBoard();
        frame.add(board);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();

    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {

    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == KeyEvent.VK_LEFT) {
            tiles[hero.getX()][hero.getY()] = tiles
        }

    }

}