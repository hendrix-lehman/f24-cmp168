package com.lockerfish.ch9;

public class Box extends Shape {

  private double width;
  private double height;
  private double depth;

  public Box() {
    this.width = 1;
    this.height = 1;
    this.depth = 1;
  }

  public Box(double width, double height, double depth) {
    this.width = width;
    this.height = height;
    this.depth = depth;
  }

  public double volume() {
    return width * height * depth;
  }

  @Override
  public boolean equals(Object obj) {
    // 1. check for null
    if (obj == null) {
      return false;
    }
    // 2. check if the same
    if (this == obj) {
      return true;
    }

    // 3. check if the same class
    if (obj instanceof Box) {
      Box that = (Box) obj;
      // assuming that EQUALITY means that the Shape equals is true and the Box width
      // is the same
      if (super.equals(obj) && this.width == that.width) {
        return true;
      }

    }

    return false;
  }

  @Override
  public String toString() {
    return super.toString() + String.format(
        "Box:   Width: %4.2f, Height: %4.2f, Depth: %4.2f\n",
        width, height, depth);
  }
}
