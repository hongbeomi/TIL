package main.chapter2_2;

import main.chapter2_1.Apple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static main.chapter2_1.Color.GREEN;
import static main.chapter2_1.Color.RED;

public class FilteringApples {

  public static void main(String... args) {
    List<Apple> inventory = Arrays.asList(new Apple(80, GREEN),
        new Apple(155, GREEN),
        new Apple(120, RED));
    List<Apple> heavyApples =
        filterApples(inventory, new AppleHeavyWeightPredicate());
    List<Apple> greenApples =
        filterApples(inventory, new AppleGreenColorPredicate());
  }

  public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate p) {
    List<Apple> result = new ArrayList<>();
    for (Apple apple : inventory) {
      if (p.test(apple)) {
        result.add(apple);
      }
    }
    return result;
  }

}
