package com.lockerfish.ch10;

public interface FoodEater {

  public static final double METABOLISM_RATING_FAST = 0.75;
  public static final double METABOLISM_RATING_MEDIUM = 0.5;
  public static final double METABOLISM_RATING_SLOW = 0.25;

  public void eat();

  public void eat(Food food);

  public double metabolizeFood(Food food);

}
