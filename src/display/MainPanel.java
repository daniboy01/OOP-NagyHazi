package display;

import javax.swing.*;

public class MainPanel {
    private JPanel mainPanel;

    public MainPanel(BoardPanel boardPanel, InfoPanel infoPanel) {
        this.mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel,BoxLayout.LINE_AXIS));
        mainPanel.add(boardPanel.getBoard());
        mainPanel.add(infoPanel.getInfo());
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }
}
