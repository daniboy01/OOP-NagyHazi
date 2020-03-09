package display;

import javax.swing.*;

public class GameWindow {
    private JFrame frame;
    private MainPanel mainPanel;

    public GameWindow(GameBoard gameBoard) {
        this.frame = new JFrame("Fasza játékr xD");
        this.mainPanel = new MainPanel(new BoardPanel(gameBoard),new InfoPanel(gameBoard));
        frame.add(mainPanel.getMainPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();
        frame.addKeyListener(gameBoard);
    }
}
