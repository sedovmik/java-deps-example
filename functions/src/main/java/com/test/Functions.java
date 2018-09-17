package com.test;

public class Functions {
  public static Function<Integer, Integer, Integer> createFunction() {
    return new Sum();
  }
}
