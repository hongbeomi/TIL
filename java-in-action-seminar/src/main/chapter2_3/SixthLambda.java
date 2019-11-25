package main.chapter2_3;

import main.chapter2_1.Apple;

import java.util.List;

import static main.chapter2_1.Color.RED;
import static main.chapter2_2.FourthAbstractFiltering.filterApples;

public class SixthLambda {

  private List<Apple> inventory;

  List<Apple> result = filterApples(inventory, (Apple apple) -> RED.equals(apple.getColor()));

}
