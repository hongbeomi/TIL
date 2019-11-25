package main.chapter2_1;

import java.util.ArrayList;
import java.util.List;

public class SecondColorParameterization {

  public static List<Apple> filterApplesByColor(List<Apple> inventory,
                                                Color color) {
    List<Apple> result = new ArrayList<>();
    for (Apple apple : inventory) {
      if (apple.getColor().equals(color)) {
        result.add(apple);
      }
    }
    return result;
  }

  //  List<Apple> greenApples = filterApplesByColor(inventory, GREEN);
  //  List<Apple> redApples = filterApplesByColor(inventory, RED);

  // 무게 정보 파라미터 추가하기
  public static List<Apple> filterApplesByWeight(List<Apple> inventory,
                                                 int weight) {
    List<Apple> result = new ArrayList<>();
    for (Apple apple : inventory) {
      if (apple.getWeight() > weight) {
        result.add(apple);
      }
    }
    return result;
  }

}