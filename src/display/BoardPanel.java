package display;

import javax.swing.*;

public class BoardPanel {
    private JPanel board;

    public BoardPanel(GameBoard gameBoard){
        this.board = new JPanel();
        this.board.add(gameBoard);
    }

    public JPanel getBoard() {
        return board;
    }
}
