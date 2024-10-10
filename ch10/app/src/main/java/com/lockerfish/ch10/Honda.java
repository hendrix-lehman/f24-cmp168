package com.lockerfish.ch10;

public class Honda extends Vehicle /* implements TintInterface */ {

  public Honda(int vin) {
    super(vin);
  }

  public void start() {
    System.out.println("Honda starting");
  }

  // @Override
  // public void tint() {
  // System.out.println("Light tint");
  // }
}
