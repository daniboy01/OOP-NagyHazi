package display;

import javax.swing.*;

public class MainPanel {
    private JPanel mainPanel;
    private InfoPanel infoPanel;

    public MainPanel(BoardPanel boardPanel, InfoPanel infoPanel) {
        this.mainPanel = new JPanel();
        this.infoPanel = infoPanel;
        mainPanel.setLayout(new BoxLayout(mainPanel,BoxLayout.LINE_AXIS));
        mainPanel.add(boardPanel.getBoard());
        mainPanel.add(infoPanel.getInfo());
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public InfoPanel getInfoPanel() {
        return infoPanel;
    }
}
