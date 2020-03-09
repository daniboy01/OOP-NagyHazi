package display;

import javax.swing.*;

public class InfoPanel {
    private JPanel info;

    public InfoPanel(GameBoard board) {
        this.info = new JPanel();
        info.setLayout(new BoxLayout(info,BoxLayout.Y_AXIS));
        String numOfMonsters = "Megmaradt szörnyek száma: " + board.getMonsters().size();
        String numOfItems = "Tárgyak száma a pályán: " + board.getItems().size();
        String hpOfHero = "Életerő: " + board.getHero().getHP();
        String powerOfHero = "Támadóerő: " + board.getHero().getStrikePower();
        JLabel label1 = new JLabel(numOfMonsters);
        JLabel label2 = new JLabel(numOfItems);
        JLabel label3 = new JLabel(hpOfHero);
        JLabel label4 = new JLabel(powerOfHero);
        info.add(label1);
        info.add(label2);
        info.add(label3);
        info.add(label4);
    }

    public JPanel getInfo() {
        return info;
    }
}
//        this.info = new JPanel();
