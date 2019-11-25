package main.chapter2_4;

public class ExampleRunnable {

  public static void main(String[] args) {
    Thread t = new Thread(String.valueOf(new Runnable() {
      public void run() {
        System.out.println("Hello world");
      }
    }));

    Thread t1 = new Thread(() -> System.out.println("Hello world"));
  }

}
