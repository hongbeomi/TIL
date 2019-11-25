package main.chapter2_2;

import main.chapter2_1.Apple;

import static main.chapter2_1.Color.GREEN;

public class AppleGreenColorPredicate implements ApplePredicate {

  public boolean test(Apple apple) {
    return GREEN.equals(apple.getColor());
  }

}
