package main.chapter2_1;

public class Apple {

  public Apple(int weight, Color color) {
    this.color = color;
    this.weight = weight;
  }

  private Color color;
  private int weight;

  public Color getColor() {
    return color;
  }

  public int getWeight() {
    return weight;
  }

}
