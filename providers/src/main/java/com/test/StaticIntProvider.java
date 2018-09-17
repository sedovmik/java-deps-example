package com.test;

public class StaticIntProvider implements Provider<Integer> {

  private int number;

  public StaticIntProvider(int number) {
    this.number = number;
  }

  @Override
  public Integer provide() {
    return number;
  }
}
