package com.lockerfish.ch8;

class House {

  // attributes
  private String color;
  private int numberOfRooms;

  // default constructor
  public House() {
    System.out.println("House constructor called");

    // setting the default values for all the attributes
    color = "blue";
    numberOfRooms = 3;
  }

  // accessor methods or getter methods
  public String getColor() {
    return color;
  }

  public int getNumberOfRooms() {
    return numberOfRooms;
  }

  // mutator methods or setter methods
  // public void setColor(String color) {
  // this.color = color;
  // }
  //
  // public void setNumberOfRooms(int numberOfRooms) {
  // this.numberOfRooms = numberOfRooms;
  // }

  // behavior
  public void lightsUpForTheNight() {
    System.out.println("Lights up for the night");
  }

  // operation
  public void paint(String color) {
    if (color.equals("red")) {
      System.out.println("Sorry, we don't paint houses red");
      return;
    }
    System.out.println("Painting the house " + color);
    // setColor(color);
    this.color = color;
  }

}
