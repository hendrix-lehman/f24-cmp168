package com.lockerfish.project1;

public class ToyStore {

  // a toy store has a name and an inventory of toys
  private String name;
  // the index of the array starts at 0
  private Toy[] toys;
  // the size or length of the array is the index + 1
  private int currentSize = 0;

  // when you create a toy store, you must provide a name and an array of toys
  public ToyStore(String name) {
    this.name = name;
    this.toys = new Toy[0]; // so this array is empty. Meaning no index is available
  }

  // get the name of the toy store
  public String getName() {
    return name;
  }

  // get the inventory of toys
  public Toy[] getToys() {
    return toys;
  }

  // adding a toy to the inventory
  public void addToy(Toy toy) {

    // this is WRONG and it will FAIL because the array is empty. Out of bounds
    // exception
    // toys[currentSize] = toy;

    // so in order to add a toy, we need to resize the array
    // we need to create a new array with a size of the current size + 1
    Toy[] newToys = new Toy[currentSize + 1];
    // we need to copy the toys from the old array to the new array
    for (int i = 0; i < currentSize; i++) {
      newToys[i] = toys[i];
    }
    // we need to add the new toy to the new array
    newToys[currentSize] = toy;
    // we need to update the current size
    currentSize++;
    // we need to update the toys array
    toys = newToys;

  }

  // adding an array of toys to the inventory
  public void addToys(Toy[] toys) {
    // THIS IS WRONG
    // this.toys = toys;

    Toy[] newToys = new Toy[currentSize + toys.length];
    // we need to copy the toys from the old array to the new array
    for (int i = 0; i < currentSize; i++) {
      newToys[i] = this.toys[i];
    }
    // we need to add the new toys to the new array
    for (int i = 0; i < toys.length; i++) {
      newToys[currentSize + i] = toys[i];
    }

    // we need to update the current size
    currentSize += toys.length;
    // we need to update the toys array
    this.toys = newToys;

  }

}
