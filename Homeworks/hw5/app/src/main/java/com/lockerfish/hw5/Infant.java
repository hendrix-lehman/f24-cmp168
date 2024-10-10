package com.lockerfish.hw5;

class Infant extends Person {

  // The Infant class is a Person which is also a Passenger

  // public boolean isHungry() {
  // return super.isPassengerHungry;
  // }

  @Override
  public boolean isFirstClass() {
    if (super.isFirstClass()) {
      return true;
    }

    return false;
  }

}
