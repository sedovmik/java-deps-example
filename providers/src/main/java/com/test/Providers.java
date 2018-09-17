package com.test;


public class Providers {
  public static Provider<Integer> createLeftProvider() {
    return new StaticIntProvider(4);
  }

  public static Provider<Integer> createRightProvider() {
    return new StaticIntProvider(5);
  }
}
