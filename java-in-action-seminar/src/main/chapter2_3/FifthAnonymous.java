package main.chapter2_3;

import main.chapter2_1.Apple;
import main.chapter2_2.ApplePredicate;

import java.awt.event.ActionEvent;
import java.beans.EventHandler;
import java.util.List;

import static main.chapter2_1.Color.RED;
import static main.chapter2_2.FourthAbstractFiltering.filterApples;

public class FifthAnonymous {

//  List<Apple> redApples = filterApples(inventory, new ApplePredicate() {
//    public boolean test(Apple apple) {
//      return RED.equals(apple.getColor());
//    }
//  });
//
//  button.setOnAction(new EventHandler<ActionEvent>() {
//    public void handle (ActionEvent event) {
//    System.out.println("Whoooo a click!!");
//    }
//  });
//
//  List<Apple> redApples = filterApples(inventory, new ApplePredicate() {
//    public boolean test(Apple a) {
//      return RED.equals(a.getColor());
//    }
//  });
//
//  button.setOnAction(new EventHandler<ActionEvent>(){
//    public void handle (ActionEvent event){
//    System.out.println("Whoooo a click!!");
//  }
//  }
}
