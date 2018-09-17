package com.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DeliveryTest {

  private Delivery underTest;

  @Before
  public void setUp() throws Exception {
    underTest = new Delivery();
  }

  @Test
  public void testAnswerIsLessThan10() {
    Assert.assertTrue(underTest.answer() < 10);
  }
}