import commands.ActionController;
import display.GameBoard;
import display.GameWindow;

public class Main  {
    public static void main(String[] args) {
        GameBoard gameBoard = new GameBoard();
        GameWindow gameWindow = new GameWindow(gameBoard);
        ActionController cmp = new ActionController(gameBoard,gameWindow);
    }
}
