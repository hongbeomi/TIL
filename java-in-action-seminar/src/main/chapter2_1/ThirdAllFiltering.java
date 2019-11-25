package main.chapter2_1;

import java.util.ArrayList;
import java.util.List;

public class ThirdAllFiltering {

  public static List<Apple> filterApples(List<Apple> inventory, Color color, int weight, boolean flag) {
    List<Apple> result = new ArrayList<>();
    for (Apple apple : inventory) {
      if ((flag && apple.getColor().equals(color)) ||
          (!flag && apple.getWeight() > weight)) {
        result.add(apple);
      }
    }
    return result;
  }

  // 이렇게 사용할 수 있다 (이 방법은 사용하지 말아야 한다..)
  //  List<Apple> greenApples = filterApples(inventory, GREEN, 0, true);
  //  List<Apple> heavyApples = filterApples(inventory, null, 150, false);

}
