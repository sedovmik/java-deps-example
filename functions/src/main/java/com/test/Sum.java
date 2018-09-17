package com.test;

public class Sum implements Function<Integer, Integer, Integer> {
  @Override
  public Integer apply(Integer left, Integer right) {
    return left + right;
  }
}
