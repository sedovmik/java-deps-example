package com.test;

public interface Function<T, R, K> {
  K apply(T t, R r);
}
