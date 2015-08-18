import org.junit.*;
import static org.junit.Assert.*;

public class AppUnitTest {

  @Test
  public void tamagotchi_instantiatesCorrectly() {
    Tamagotchi myPet = new Tamagotchi("lil dragon",10,10,10);
    Integer level = 10;
    assertEquals("lil dragon", myPet.getName());
    assertEquals(level, myPet.getFoodLevel());
    assertEquals(level, myPet.getSleepLevel());
    assertEquals(level, myPet.getActivityLevel());
  }

  // @Test
  // public void timePasses_foodDecreasesByOne_9() {
  // Tamagotchi myPet = new Tamagotchi("lil dragon",9,9,9);
  // Integer level = 9;
  // myPet.timePasses();
  // assertEquals(level, myPet.getFoodLevel());
  // }

  @Test
  public void isAlive_foodLevelAbove0_true() {
    Tamagotchi myPet = new Tamagotchi("lil dragon",8,8,8);
    assertEquals(true, myPet.isAlive());
  }

  @Test
  public void isDead_foodLevelAbove0_true() {
    Tamagotchi myPet = new Tamagotchi("lil dragon",0,0,0);
    assertEquals(false, myPet.isAlive());
  }

  @Test
  public void addFood_foodIncreasesByOne_1() {
    Integer level = 3;
    Tamagotchi myPet = new Tamagotchi("lil dragon",2,2,2);
    assertEquals(level, myPet.addFood());
  }

  @Test
  public void addSleep_sleepIncreasesByOne_1() {
    Integer level = 3;
    Tamagotchi myPet = new Tamagotchi("lil dragon",2,2,2);
    assertEquals(level, myPet.addSleep());
  }

  @Test
  public void addActivity_activityIncreasesByOne_1() {
    Integer level = 3;
    Tamagotchi myPet = new Tamagotchi("lil dragon",2,2,2);
    assertEquals(level, myPet.addActivity());
  }

}
