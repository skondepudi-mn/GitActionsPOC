package com.sample;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SampleTest {

  @Test
  public void testAdd() {
    assertEquals(42, Integer.sum(19, 23));
  }
  
  @Test
  public void testAdd4() {
    assertEquals(42, Integer.sum(19, 25));
  }

  @Test
  public void testAdd1() {
    assertEquals(42, Integer.sum(19, 23));
  }
  @Test
  public void testAdd3() {
    assertEquals(42, Integer.sum(19, 23));
  }
}
