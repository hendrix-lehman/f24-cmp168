package com.lockerfish.hw5;

class Person extends Passenger {

  @Override
  public boolean isFirstClass() {
    if (isPassengerHungry()) {
      return true;
    }
    return false;
  }
}
