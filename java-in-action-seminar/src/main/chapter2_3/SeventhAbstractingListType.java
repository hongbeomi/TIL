package main.chapter2_3;

import main.chapter2_1.Apple;

import java.util.ArrayList;
import java.util.List;

import static main.chapter2_1.Color.RED;

public class SeventhAbstractingListType {

  private List<Apple> inventory;
  private List<Integer> numbers;

  public static <T> List<T> filter(List<T> list, Predicate<T> p) {
    List<T> result = new ArrayList<>();
    for (T e : list) {
      if (p.test(e)) {
        result.add(e);
      }
    }
    return result;
  }

  List<Apple> redApples = filter(inventory, (Apple apple) -> RED.equals(apple.getColor()));
  List<Integer> evenNumbers = filter(numbers, (Integer i) -> i % 2 == 0);

}

interface Predicate<T> {

  boolean test(T t);

}

