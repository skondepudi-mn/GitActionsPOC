package com.sample;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SampleTest {

  @Test
  public void testAdd() {
    assertEquals(42, Integer.sum(19, 23));
  }

  @Test
  public void testAdd2() {
    assertEquals(43, Integer.sum(20, 23));
  }
}