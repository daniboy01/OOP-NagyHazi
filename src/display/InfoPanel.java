package display;

import javax.swing.*;

public class InfoPanel {
    private JPanel info;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;

    public InfoPanel(GameBoard board) {
        this.info = new JPanel();
        info.setLayout(new BoxLayout(info,BoxLayout.Y_AXIS));
        String numOfMonsters = "Megmaradt szörnyek száma: " + board.getMonsters().size();
        String numOfItems = "Tárgyak száma a pályán: " + board.getItems().size();
        String hpOfHero = "Életerő: " + board.getHero().getHP();
        String powerOfHero = "Támadóerő: " + board.getHero().getStrikePower();
        this.label1 = new JLabel(numOfMonsters);
        this.label2 = new JLabel(numOfItems);
        this.label3 = new JLabel(hpOfHero);
        this.label4 = new JLabel(powerOfHero);
        info.add(label1);
        info.add(label2);
        info.add(label3);
        info.add(label4);
    }

    public JPanel getInfo() {
        return info;
    }

    public void updateLabels(GameBoard board){
        this.label1.setText("Megmaradt szörnyek száma: " + board.getMonsters().size());
        this.label2.setText("Tárgyak száma a pályán: " + board.getItems().size());
        this.label3.setText("Életerő: " + board.getHero().getHP());
        this.label4.setText("Támadóerő: " + board.getHero().getStrikePower());
    }
}
