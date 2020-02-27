import tiles.Path;
import tiles.Tile;
import tiles.Wall;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileReader {
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
                    }
                }
                rowIndex++;
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
        return tiles;
    }

}
