package com.lockerfish.ch10;

public abstract class ElectricVehicle extends Vehicle {

  public ElectricVehicle(int vin) {
    super(vin);
  }

  public abstract void charge();
}
