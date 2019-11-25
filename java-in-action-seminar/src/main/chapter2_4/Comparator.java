package main.chapter2_4;

import main.chapter2_1.Apple;

import java.util.List;

public interface Comparator<T> {

  int compare(T o1, T o2);

}

