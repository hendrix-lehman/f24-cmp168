package com.lockerfish.hw5;

abstract class Passenger implements Eater {

  private boolean isHungry = false;

  // within the body of the Passenger class
  // you should have created an abstract method called
  // metabolizeAccumulatedCalories

  public boolean isPassengerHungry() {
    return isHungry;
  }

  public abstract boolean isFirstClass();
}
