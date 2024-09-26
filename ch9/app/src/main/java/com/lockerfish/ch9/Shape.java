package com.lockerfish.ch9;

class Shape {

  private String name;
  private String color;

  public Shape() {
    this.name = "Shape";
    this.color = "Red";
  }

  public Shape(String name, String color) {
    this.name = name;
    this.color = color;
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
    if (obj instanceof Shape) {
      // they both are Shapes
      // this instance and obj are Shapes
      Shape that = (Shape) obj;

      // assuming that EQUALITY means that the colors are the same
      if (this.color.equals(that.color)) {
        return true;
      }
    }

    return false;
  }

  @Override
  public String toString() {
    return String.format("Shape [name=%s, color=%s]", name, color);
  }

}
