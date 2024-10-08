package com.lockerfish.ch10;

public class Food {

  private String name;
  private int calories;
  private int portionSizeInOunces;

  public Food(String name, int calories, int portionSizeInOunces) {
    this.name = name;
    this.calories = calories;
    this.portionSizeInOunces = portionSizeInOunces;
  }

  public String getName() {
    return name;
  }

  public int getCalories() {
    return calories;
  }

  public int getPortionSizeInOunces() {
    return portionSizeInOunces;
  }

  public String toString() {
    return "Food: " + name + ", " + calories + " calories, " + portionSizeInOunces + " ounces";
  }

  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (obj == this) {
      return true;
    }
    if (obj instanceof Food) {
      Food food = (Food) obj;
      return name.equals(food.getName()) && calories == food.getCalories()
          && portionSizeInOunces == food.getPortionSizeInOunces();
    }
    return false;
  }

}
