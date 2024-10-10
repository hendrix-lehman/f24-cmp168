package com.lockerfish.ch10;

public class MyCoolHonda extends Honda implements WheelsInterface, TintInterface {

  public MyCoolHonda(int vin) {
    super(vin);
  }

  @Override
  public void start() {
    System.out.println("MyCoolHonda starting");
  }

  @Override
  public void tint() {
    System.out.println("Dark tint");
  }

  @Override
  public void inflate() {
    System.out.println("Inflating tires");
  }

  @Override
  public void rims(int size) {
    System.out.println("Rims size: " + size);
  }
}
