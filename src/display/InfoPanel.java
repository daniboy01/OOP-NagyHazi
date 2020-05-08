package display;

import javax.swing.*;

public class InfoPanel {
    private JPanel info;
    private JLabel numberOfMonsters;
    private JLabel numberOfItems;
    private JLabel herosHP;
    private JLabel herosAttackPower;

    public InfoPanel(GameBoard board) {
        this.info = new JPanel();
        info.setLayout(new BoxLayout(info,BoxLayout.Y_AXIS));
        String numOfMonsters = "Megmaradt szörnyek száma: " + board.getMonsters().size();
        String numOfItems = "Tárgyak száma a pályán: " + board.getItems().size();
        String hpOfHero = "Életerő: " + board.getHero().getHP();
        String powerOfHero = "Támadóerő: " + board.getHero().getStrikePower();
        this.numberOfMonsters = new JLabel(numOfMonsters);
        this.numberOfItems = new JLabel(numOfItems);
        this.herosHP = new JLabel(hpOfHero);
        this.herosAttackPower = new JLabel(powerOfHero);
        info.add(numberOfMonsters);
        info.add(numberOfItems);
        info.add(herosHP);
        info.add(herosAttackPower);
    }

    public JPanel getInfo() {
        return info;
    }

    public void updateLabels(GameBoard board){
        this.numberOfMonsters.setText("Megmaradt szörnyek száma: " + board.getMonsters().size());
        this.numberOfItems.setText("Tárgyak száma a pályán: " + board.getItems().size());
        this.herosHP.setText("Életerő: " + board.getHero().getHP());
        this.herosAttackPower.setText("Támadóerő: " + board.getHero().getStrikePower());
    }
}
