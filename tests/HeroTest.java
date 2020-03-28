import characters.Hero;
import characters.Monster;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HeroTest {
    Hero hero;
    Monster monster;

    @Before
    public void setUp(){
        hero = new Hero(1,1);
        monster = new Monster(1,1);
    }

    @Test
    public void moveUpTest(){
        this.hero.moveUp();
        assertEquals("up",this.hero.getMove());
    }

    @Test
    public void moveDownsTest(){
        this.hero.moveDown();
        assertEquals("down",this.hero.getMove());
    }

    @Test
    public void moveRightTest(){
        this.hero.moveRight();
        assertEquals("right",this.hero.getMove());
    }

    @Test
    public void moveLeftTest(){
        this.hero.moveLeft();
        assertEquals("left",this.hero.getMove());
    }

    @Test
    public void isAliveTest(){
        assertEquals(true,this.hero.isAlive());
    }

    @Test
    public void isNotAliveTest(){
        this.hero.setHP(0);
        assertEquals(false,this.hero.isAlive());
    }

    @Test
    public void attackTest(){
        assertEquals(true,this.hero.attack(this.monster));
    }
}
