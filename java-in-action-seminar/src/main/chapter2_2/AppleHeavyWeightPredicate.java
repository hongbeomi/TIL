package main.chapter2_2;

import main.chapter2_1.Apple;

public class AppleHeavyWeightPredicate implements ApplePredicate {

  public boolean test(Apple apple) {
    return apple.getWeight() > 150;
  }

}
