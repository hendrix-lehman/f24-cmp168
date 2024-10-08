package com.lockerfish.ch9;

// this class is abstract, so it cannot be instantiated
// It's used to guide the creation of other classes
// It describe what a car is without defining a specific car
abstract class Car {

  private int numberOfDoors;
  private boolean isElectric;
  private String color;

  public Car() {
    this.numberOfDoors = 4;
    this.isElectric = false;
    this.color = "red";
  }

  public Car(int numberOfDoors, boolean isElectric, String color) {
    this.numberOfDoors = numberOfDoors;
    this.isElectric = isElectric;
    this.color = color;
  }

  public int getNumberOfDoors() {
    return this.numberOfDoors;
  }

  public boolean getIsElectric() {
    return this.isElectric;
  }

  public String getColor() {
    return this.color;
  }

  public void setNumberOfDoors(int numberOfDoors) {
    // this a business rule that we want to enforce for every car
    // it must have at least 2 doors and no more than 5 doors
    if (numberOfDoors < 2 || numberOfDoors > 5) {
      // let the program that called this method that it did something wrong
      throw new IllegalArgumentException("Number of doors must be between 2 and 5");
    }

    this.numberOfDoors = numberOfDoors;
  }

  public void setIsElectric(boolean isElectric) {
    this.isElectric = isElectric;
  }

  public void setColor(String color) {
    // this a business rule that we want to enforce for every car
    if (color == null || color.trim().equals("")) {
      throw new IllegalArgumentException("Color must not be null or empty");
    }
    if (color.equalsIgnoreCase("orange")) {
      throw new IllegalArgumentException("Orange is not a valid color");
    }
    this.color = color;
  }

  // this is an abstract method
  public abstract void honkHorn();

  public abstract void drive();

}
