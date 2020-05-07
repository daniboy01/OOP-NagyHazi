import characters.Hero;
import characters.Monster;
import commands.ActionController;
import display.GameBoard;
import display.GameWindow;
import org.junit.Before;
import org.junit.Test;
import java.awt.*;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ActionControllerTest {
    ActionController controller;
    GameBoard gameBoard;
    GameWindow window;
    Robot robot;
    Hero hero;
    ArrayList<Monster> monsters;

    @Before
    public void setUp(){
        gameBoard = new GameBoard();
        window = new GameWindow(gameBoard);
        controller = new ActionController(gameBoard,window);
        hero = gameBoard.getHero();
        monsters = gameBoard.getMonsters();
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void moveUpTest(){
        controller.moveUp();
        assertEquals("up",this.hero.getMove());
    }

    @Test
    public void moveDownTest(){
        controller.moveDown();
        assertEquals("default",this.hero.getMove());
    }

    @Test
    public void moveRightTest(){
        controller.moveRight();
        assertEquals("right",this.hero.getMove());
    }

    @Test
    public void moveLestTest(){
        controller.moveLeft();
        assertEquals("left",this.hero.getMove());
    }

    @Test
    public void attackTest(){
        assertEquals(false,this.controller.attack());
    }

    @Test
    public void pickUpTest(){
        assertEquals(false,this.controller.pickUp());
    }

}
