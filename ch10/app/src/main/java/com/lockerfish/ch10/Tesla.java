package com.lockerfish.ch10;

public class Tesla extends ElectricVehicle {

  public Tesla(int vin) {
    super(vin);
  }

  public void start() {
    System.out.println("Tesla starting");
  }

  public void charge() {
    System.out.println("Charging Tesla");
  }
}
