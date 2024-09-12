/*
 * This source file was generated by the Gradle 'init' task
 */
package com.lockerfish.ch8;

public class App {

  public static void main(String[] args) {

    // creating an instance of the class House
    House house = new House();

    // the toString() method is inherited from the Object class
    String stringRepresentationOfThisObject = house.toString();
    System.out.println("Representation: " + stringRepresentationOfThisObject);

    // same as the hashCode() method. It is inherited from the Object class
    System.out.println("Hash code: " + house.hashCode());

    house.paint("yellow");

    // print house color
    System.out.println("House color: " + house.getColor());


  }
}