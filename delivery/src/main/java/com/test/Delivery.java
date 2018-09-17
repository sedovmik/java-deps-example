package com.test;

public class Delivery {

  public int answer() {
    return Functions.createFunction()
        .apply(
            Providers.createLeftProvider().provide(),
            Providers.createRightProvider().provide());
  }

}
