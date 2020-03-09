package display;

import characters.Monster;
import items.Item;
import items.Weapon;
import tiles.Path;
import tiles.Tile;
import tiles.Wall;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {
    private ArrayList<Monster> monsters = new ArrayList<>();
    private ArrayList<Item> items = new ArrayList<>();
    public Tile[][] getTiles(String filename) {
        Tile[][] tiles = new Tile[GameBoard.COLS][GameBoard.ROWS];
        try {
            int rowIndex = 0;
            Scanner sc = new Scanner(new File(filename));
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                for (int i = 0; i < line.length();i++) {
                    if (line.charAt(i) == '0') {
                        tiles[rowIndex][i] = new Path(rowIndex,i);
                    } else if (line.charAt(i) == 'W') {
                        tiles[rowIndex][i] = new Wall(rowIndex,i);
                    } else if (line.charAt(i) == 'M'){
                        tiles[rowIndex][i] = new Path(rowIndex,i);
                        monsters.add(new Monster(rowIndex,i));
                    } else if(line.charAt(i) == 'S') {
                        tiles[rowIndex][i] = new Path(rowIndex,i);
                        items.add(new Weapon(rowIndex,i));
                    }
                }
                rowIndex++;
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
        return tiles;
    }

    public ArrayList<Monster> getMonsters() {
        return monsters;
    }

    public ArrayList<Item> getItems() {
        return items;
    }
}
