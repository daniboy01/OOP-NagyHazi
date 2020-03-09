package commands;
import display.GameBoard;

public class ActionController {
    private GameBoard gameBoard;

    public ActionController(GameBoard gameBoard) {
        this.gameBoard = gameBoard;
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
}
