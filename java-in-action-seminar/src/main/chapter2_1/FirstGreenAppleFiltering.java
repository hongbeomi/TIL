package main.chapter2_1;

import java.util.ArrayList;
import java.util.List;

import static main.chapter2_1.Color.GREEN;

public class FirstGreenAppleFiltering {

  public static List<Apple> filterGreenApples(List<Apple> inventory) {
    List<Apple> result = new ArrayList<>();
    for(Apple apple: inventory){
      if( GREEN.equals(apple.getColor())) {
        result.add(apple);
      }
    }
    return result;
  }

}

