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

  @Test
  public void timePasses_foodDecreasesByOne_9() {
  Tamagotchi myPet = new Tamagotchi("lil dragon",9,9,9);
  Integer level = 9;
  myPet.timePasses();
  assertEquals(level, myPet.getFoodLevel());
  }
}
