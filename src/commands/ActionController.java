package commands;
import display.GameBoard;
import display.GameWindow;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ActionController implements KeyListener {
    private GameBoard gameBoard;
    private GameWindow gameWindow;

    public ActionController(GameBoard gameBoard,GameWindow gameWindow) {
        this.gameBoard = gameBoard;
        this.gameWindow = gameWindow;
        this.gameWindow.getFrame().addKeyListener(this);
    }

    public void moveUp() {
        if (gameBoard.getTiles()[gameBoard.getHero().getPositionX()][gameBoard.getHero().getPositionY()-1].canStepOn()) {gameBoard.getHero().moveUp();}
    }

    public void moveDown() {
        if (gameBoard.getTiles()[gameBoard.getHero().getPositionX()][gameBoard.getHero().getPositionY()+1].canStepOn()) {gameBoard.getHero().moveDown();}

    }

    public void moveLeft() {
        if (gameBoard.getTiles()[gameBoard.getHero().getPositionX()-1][gameBoard.getHero().getPositionY()].canStepOn()) {gameBoard.getHero().moveLeft();}
    }

    public void moveRight() {
        if (gameBoard.getTiles()[gameBoard.getHero().getPositionX()+1][gameBoard.getHero().getPositionY()].canStepOn()) {gameBoard.getHero().moveRight();}
    }

    public void attack() {
        for (int i = 0; i < gameBoard.getMonsters().size(); i++) {
            gameBoard.getHero().attack(gameBoard.getMonsters().get(i));
        }
    }

    public void pickUp() {
        for (int i = 0; i < gameBoard.getItems().size(); i++) {
            if (gameBoard.getHero().pickUp(gameBoard.getItems().get(i))) { gameBoard.getItems().remove(gameBoard.getItems().get(i));}
        }
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {}

    @Override
    public void keyPressed(KeyEvent keyEvent) {}

    @Override
    public void keyReleased(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == KeyEvent.VK_RIGHT) {
            this.moveRight();
        }
        if (keyEvent.getKeyCode() == KeyEvent.VK_LEFT) {
            this.moveLeft();
        }
        if (keyEvent.getKeyCode() == KeyEvent.VK_UP) {
            this.moveUp();
        }
        if (keyEvent.getKeyCode() == KeyEvent.VK_DOWN) {
            this.moveDown();
        }
        if (keyEvent.getKeyCode() == KeyEvent.VK_SPACE){
            this.attack();
        }
        if (keyEvent.getKeyCode() == KeyEvent.VK_F){
            this.pickUp();
        }
        gameBoard.repaint();
    }
}
