package com.sample;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SampleTest {

  @Test
  public void testAdd() {
    assertEquals(42, Integer.sum(19, 23));
  }
}