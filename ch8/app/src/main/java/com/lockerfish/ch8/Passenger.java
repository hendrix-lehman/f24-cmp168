// package is a Java concept. 
// It is a way to organize your classes.
// It indicates that this class is part of this package.
package com.lockerfish.ch8;

// This is a class declaration.
// All you need is just the keyword 'class' followed by the name of the class.
class Passenger /* extends Object */ {
  // what goes 'inside' or within the curly braces is the body of the class.

  // Fields or instance variables
  // These are the attributes of the class.
  // They are the characteristics of the class.
  // They are the data that the class holds.
  // for example, a passenger has a name and a seat number.
  private String name;
  private int seatNumber;

  // Constructor
  // This is how we create an instance of the class.
  // In other words, a running object of the class.
  // It is a special method that has the same name as the class.
  // It is used to initialize the fields of the class.
  public Passenger(/* no parameters here */) {
    // this a default constructor.
    // it is called default because there are no parameters.
    this.name = "John Doe";
    this.seatNumber = 0;
  }

  // an overloaded constructor
  // this is a constructor that takes parameters.
  // it is called overloaded because it has different parameters.
  public Passenger(String name, int seatNumber) {
    this.name = name;
    this.seatNumber = seatNumber;
  }

  public Passenger(String name) {
    this.name = name;
    this.seatNumber = -1;
  }

  public Passenger(int seatNumber) {
    this.name = "John Doe";
    this.seatNumber = seatNumber;
  }

  // getters and setters
  public String getName() {
    return this.name;
  }

  public int getSeatNumber() {
    return this.seatNumber;
  }

  // DO NOT WRITE ANY STATEMENTS THAT ARE NOT RELATED TO THE CLASS
  // IF YOU DO, YOU WILL GET A COMPILATION ERROR
  // ALL STATEMENTS MUST BE INSIDE A METHOD
  // OR INSIDE A BLOCK OF CODE
  // STATEMENTS ONLY GO INSIDE THE CONSTRUCTOR and METHODS

  // overloading the method changeSeatNumber
  public void changeSeatNumber() {
    this.seatNumber = 11;
  }

  public void changeSeatNumber(int newSeatNumber) {
    // 'this' in here refers to the object that is calling this method
    this.seatNumber = newSeatNumber;
  }

  @Override
  public boolean equals(Object obj) {
    // EQUALITY: means that the two objects are of the same type and also have the
    // same name and the same seat number.

    // this is how we can define equality between two objects.
    // it could be that just being of the same type or class is enough.
    // The name of the class is also the class type.

    System.out.println("equals method called");
    if (obj == null) {
      System.out.println("object is null");
      return false;
    }

    if (this == obj) {
      System.out.println("objects are the same");
      return true;
    }
    // if the code continues to the following statements, it means that obj is not
    // null
    // so we can safely check if obj is an instance of the class Passenger
    if (obj instanceof Passenger) {
      System.out.println("object is an instance of the class Passenger");
      // at this point if the condition above is true, it means that obj is an
      // instance
      // of the class Passenger
      Passenger that = (Passenger) obj; // casting the object to a Passenger object
      if (this.name.equals(that.getName()) && this.seatNumber == that.getSeatNumber()) {
        return true;
      }
    }

    System.out.println("object is of a different type: " + obj.getClass());
    return false;
  }

  @Override
  public String toString() {
    return "Passenger [name=" + name + ", seatNumber=" + seatNumber + "]";
  }

}
