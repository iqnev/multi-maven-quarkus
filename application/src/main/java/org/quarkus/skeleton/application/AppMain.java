package org.quarkus.skeleton.application;

import io.quarkus.runtime.Quarkus;

public class AppMain {
  public static void main(final String... args) {
    System.out.println("Running main method");
    Quarkus.run(args);
  }
}
