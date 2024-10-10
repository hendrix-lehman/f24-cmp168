package com.lockerfish.ch10;

public abstract class Vehicle implements Comparable<Vehicle> {
  private int vin;

  public Vehicle(int vin) {
    this.vin = vin;
  }

  public int getVin() {
    return vin;
  }

  public abstract void start();

  @Override
  public int compareTo(Vehicle other) {
    if (this.vin < other.vin) {
      return -1;
    }
    if (this.vin > other.vin) {
      return 1;
    }

    return 0;
  }

}
