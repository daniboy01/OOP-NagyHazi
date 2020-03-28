import characters.Hero;
import characters.Monster;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MonsterTest {
    Hero hero;
    Monster monster;

    @Before
    public void setUp(){
        hero = new Hero(1,1);
        monster = new Monster(1,1);
    }

    @Test
    public void isAliveTest(){
        assertEquals(true,this.monster.isAlive());
    }

    @Test
    public void isNotAliveTest(){
        this.monster.setHP(0);
        assertEquals(false,this.monster.isAlive());
    }

    @Test
    public void attackTest(){
        assertEquals(true,this.monster.attack(this.hero));
    }
}
