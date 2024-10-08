package com.lockerfish.ch9;

class Honda extends Car {

  private String model;

  public Honda() {
    super(3, false, "blue");
    this.model = "Accord";
  }

  public Honda(int numberOfDoors, boolean isElectric, String color, String model) {
    super(numberOfDoors, isElectric, color);
    this.model = model;
  }

  public String getModel() {
    return this.model;
  }

  public void honkHorn() {
    System.out.println("Honk! Honk!");
  }

  public void drive() {
    System.out.println("Driving my Honda");
  }

}
