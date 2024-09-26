package com.lockerfish.ch9;

public class MyArrayList {

  private Object[] elements;
  private int size; // number of elements added to the list

  public MyArrayList() {
    this(10);
  }

  public MyArrayList(int initialCapacity) {
    if (initialCapacity < 0) {
      throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
    }
    this.elements = new Object[initialCapacity];
    System.out.println("MyArrayList elements.length: " + elements.length);
  }

  public void add(Object element) {
    if (size == elements.length) {
      increaseCapacity();
      System.out.println("MyArrayList elements.length: " + elements.length);
    }
    elements[size++] = element;
  }

  public void addAll(MyArrayList list) {
    for (int i = 0; i < list.size(); i++) {
      add(list.get(i));
    }
  }

  public void remove(int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }
    for (int i = index; i < size - 1; i++) {
      elements[i] = elements[i + 1];
    }
    size--;
  }

  public void removeAll() {
    for (int i = 0; i < size; i++) {
      elements[i] = null;
    }
    size = 0;
  }

  public Object get(int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }
    return elements[index];
  }

  public int size() {
    return size;
  }

  private void increaseCapacity() {
    int newCapacity = elements.length * 2;
    Object[] newElements = new Object[newCapacity];
    for (int i = 0; i < elements.length; i++) {
      newElements[i] = elements[i];
    }
    elements = newElements;
  }
}
