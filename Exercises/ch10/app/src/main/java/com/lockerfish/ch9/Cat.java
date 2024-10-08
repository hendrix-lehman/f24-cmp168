package com.lockerfish.ch9;

public class Cat extends Pet {
  private int numWhiskers;
  private double whiskerLength;
  private int age;
  private boolean isVaccinated;
  private String name;

  public Cat() {
    super();
    this.numWhiskers = 0;
    this.whiskerLength = 0.0;
    this.age = 0;
    this.isVaccinated = false;
    this.name = "unknown";
  }

  public Cat(int numWhiskers, double whiskerLength, int age, boolean isVaccinated, String name) {
    super();
    this.numWhiskers = numWhiskers;
    this.whiskerLength = whiskerLength;
    this.age = age;
    this.isVaccinated = isVaccinated;
    this.name = name;
  }

  public Cat(
    int numWhiskers, 
    double whiskerLength, 
    int age, 
    boolean isVaccinated, 
    String name,
    String favoriteFood,
    String favoriteToy,
    int maintenanceLevel,
    boolean goesOutside
  ) {
    super(favoriteFood, favoriteToy, maintenanceLevel, goesOutside);
    this.numWhiskers = numWhiskers;
    this.whiskerLength = whiskerLength;
    this.age = age;
    this.isVaccinated = isVaccinated;
    this.name = name;
  }

  @Override
  public void play() {
    System.out.println("Cat is playing");
  }

  // Getters
  public int getNumWhiskers() {
    return numWhiskers;
  }

  public double getWhiskerLength() {
    return whiskerLength;
  }

  public int getAge() {
    return age;
  }

  public boolean getIsVaccinated() {
    return isVaccinated;
  }

  public String getName() {
    return name;
  }

  // Setters
  public void setNumWhiskers(int whiskers) {
    numWhiskers = whiskers;
  }

  public void setWhiskerLength(double length) {
    whiskerLength = length;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setIsVaccinated(boolean isVaccinated) {
    this.isVaccinated = isVaccinated;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    String petString = super.toString();
    return petString + "\nCat: " + numWhiskers + ", " + whiskerLength + ", " + age + ", " + isVaccinated + ", " + name;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null) {
      return false;
    }
    if (o == this) {
      return true;
    }
    if (o instanceof Cat) {
      Cat otherCat = (Cat) o;
      return super.equals(o) &&
             numWhiskers == otherCat.numWhiskers &&
             whiskerLength == otherCat.whiskerLength &&
             age == otherCat.age &&
             isVaccinated == otherCat.isVaccinated &&
             name.equals(otherCat.name);
    }
    return false;
  }

}
