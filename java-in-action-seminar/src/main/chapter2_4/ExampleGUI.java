package main.chapter2_4;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExampleGUI {

  public static void main(String[] args) {
    ExecutorService executorService = Executors.newCachedThreadPool();

    Future<String> threadName = executorService.submit(new Callable<String>() {
      @Override
      public String call() throws Exception {
        return Thread.currentThread().getName();
      }
    });

    Future<String> threadName1 = executorService.submit(
        () -> Thread.currentThread().getName());

    Button button = new Button("Send");
    button.setOnAction(new EventHandler<ActionEvent>() {
      public void handle(ActionEvent event) {
        label.setText("Sent!!");
      }
    });

    button.setOnAction((ActionEvent event) -> label.setText("Sent!!"));

  }

}
