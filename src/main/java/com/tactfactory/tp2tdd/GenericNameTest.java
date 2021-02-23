package com.tactfactory.tp2tdd;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GenericNameTest {
  String string = "Zdbvuor";

  /**
   * NameStartWithMaj test function.
   * Maj are ascii 65->90
   * Min are ascii 97->122
   * Printable other elements are 32->64 91->126
   */
  @Test
  public static void nameStartWithMajOk(String cs) {
    //65->90 == MAJ
    //    if (cs.charAt(0) >= 65 && cs.charAt(0) <= 90) {
    //      assertTrue(cs.charAt(0) >= 65 && cs.charAt(0) <= 90);
    //    } else {
    //      System.out.println(cs + "don't start with a maj !!");
    //    }
    assertTrue(cs.charAt(0) >= 65 && cs.charAt(0) <= 90);
  }

  /**
   * NameStartWithMaj test function.
   * Printable other elements are 32->64 91->126
   */
  @Test
  public void nameStartWithMajKo() {

    for (int i = 32; i <= 64; i++) {
      String test = Character.toString(i);
      assertFalse(test.charAt(0) >= 65 && test.charAt(0) <= 90);
    }

    for (int i = 91; i <= 162; i++) {
      String test = Character.toString(i);
      assertFalse(test.charAt(0) >= 65 && test.charAt(0) <= 90);
    }

  }

}



