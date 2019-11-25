package main.chapter2_2;

import main.chapter2_1.Apple;

import java.util.ArrayList;
import java.util.List;

import static main.chapter2_1.Color.RED;

public class FourthAbstractFiltering {

  public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate p) {
    List<Apple> result = new ArrayList<>();
    for(Apple apple: inventory) {
      if(p.test(apple)) {
        result.add(apple);
      }
    }
    return result;
  }

  public class AppleRedAndHeavyPredicate implements ApplePredicate {

    public boolean test(Apple apple){
      return RED.equals(apple.getColor())
          && apple.getWeight() > 150;
    }

  }

//  List<Apple> redAndHeavyApples = filterApples(inventory, new AppleRedAndHeavyPredicate());
}
