package com.lockerfish.ch9;

public class Dog extends Pet {
  private String name;
  private double weight;
  private double height;
  private boolean isVaccinated;
  private int ageInDogYears;

  public Dog() {
    super();
    this.name = "unknown";
    this.weight = 0.0;
    this.height = 0.0;
    this.isVaccinated = false;
    this.ageInDogYears = 0;
  }

  public Dog(String name) {
    super();
    this.name = name;
    this.weight = 0.0;
    this.height = 0.0;
    this.isVaccinated = false;
    this.ageInDogYears = 0;
  }

  public Dog(String name, double weight, double height) {
    super();
    this.name = name;
    this.weight = weight;
    this.height = height;
    this.isVaccinated = false;
    this.ageInDogYears = 0;
  }

  public Dog(String name, boolean isVaccinated, int age) {
    super();
    this.name = name;
    this.weight = 0.0;
    this.height = 0.0;
    this.isVaccinated = isVaccinated;
    this.ageInDogYears = age;
  }

  public Dog(String name, double weight, double height, boolean isVaccinated, int ageInDogYears) {
    super();
    this.name = name;
    this.weight = weight;
    this.height = height;
    this.isVaccinated = isVaccinated;
    this.ageInDogYears = ageInDogYears;
  }

  public Dog(
    String name, 
    double weight, 
    double height, 
    boolean isVaccinated, 
    int ageInDogYears,
    String favoriteFood,
    String favoriteToy,
    int maintenanceLevel,
    boolean goesOutside
  ) {
    super(favoriteFood, favoriteToy, maintenanceLevel, goesOutside);
    this.name = name;
    this.weight = weight;
    this.height = height;
    this.isVaccinated = isVaccinated;
    this.ageInDogYears = ageInDogYears;
  }

  public void play() {
    System.out.println("Dog is playing");
  }

  public String getName() {
    return name;
  }

  public double getWeight() {
    return weight;
  }

  public double getHeight() {
    return height;
  }

  public boolean getIsVaccinated() {
    return isVaccinated;
  }

  public int getAgeInDogYears() {
    return ageInDogYears;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public void setIsVaccinated(boolean isVacc) {
    isVaccinated = isVacc;
  }

  public void setAgeInDogYears(int age) {
    ageInDogYears = age;
  }

  @Override
  public String toString() {
    String petString = super.toString();
    return petString + "\nDog: " + name + ", " + weight + ", " + height + ", " + isVaccinated + ", " + ageInDogYears;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null) {
      return false;
    }
    if (o == this) {
      return true;
    }
    if (o instanceof Dog) {
      Dog otherDog = (Dog) o;
      return super.equals(o) &&
             name.equals(otherDog.name) &&
             weight == otherDog.weight &&
             height == otherDog.height &&
             isVaccinated == otherDog.isVaccinated &&
             ageInDogYears == otherDog.ageInDogYears;
    }
    return false;
  }
}
