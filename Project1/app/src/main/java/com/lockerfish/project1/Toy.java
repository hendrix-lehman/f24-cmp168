package com.lockerfish.project1;

public class Toy {
  private String name;
  private double price;

  public Toy(String name, double price) {
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }

  public String toString() {
    return name + " $" + price;
  }
}
