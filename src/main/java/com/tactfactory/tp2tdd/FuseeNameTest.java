package com.tactfactory.tp2tdd;

import static org.junit.Assert.assertThrows;

import java.util.Random;
import org.junit.Test;

public class FuseeNameTest {
  private Random rand = new Random();
  private  String randomName = "";

  /**
   * generate a name random.
   */
  public void generateRandName() {
    for (int i = 0; i < 15; i++) {
      if (rand.nextBoolean()) {
        if (rand.nextBoolean()) {
          randomName += Character.toString((rand.nextInt(26) + 65) % 91);
        } else {
          randomName += Character.toString((rand.nextInt(25) + 97) % 122);
        }
      }
    }
    System.out.println("randname:" + randomName);
//    this.randomName = randomName;

  }

  /**
   * testNameStartWithMajOk.
   */
  @Test
  public void testNameStartWithMajOk() {
    generateRandName();
    Fusee fusee = new Fusee();
    fusee.setName(Character.toString((rand.nextInt(26) + 65) % 91));
    System.out.println(fusee.getName());
    GenericNameTest.nameStartWithMajOk(fusee.getName());

  }

  /**
   * testNameStartWithMajOk.
   */
  @Test
  public void testNameStartWithMin() {
    Fusee fusee = new Fusee();
    fusee.setName(Character.toString((rand.nextInt(25) + 97) % 122));
    System.out.println(fusee.getName());
    GenericNameTest.nameStartWithMajOk(fusee.getName());

  }

  /**
   * testNameStartWithMajKo.
   */
  @Test
  public void testNameStartWithSepcialChar() {
    Fusee fusee = new Fusee();
    fusee.setName("!");
    System.out.println(fusee.getName());
    GenericNameTest.nameStartWithMajOk(fusee.getName());
  }

  /**
   * testNameStartWithMajKo.
   */
  @Test
  public void testNameStartWithNull() {
    Fusee fusee = new Fusee();
    assertThrows(Exception.class, () -> {
      fusee.setName(null);
    });
    fusee.setName(null);

  }

  /**
   * testNameStartWithMajKo.
   */
  @Test
  public void testNameStartWithEmpty() {
    Fusee fusee = new Fusee();
    fusee.setName("");
    System.out.println(fusee.getName());
    GenericNameTest.nameStartWithMajOk(fusee.getName());
  }
}
