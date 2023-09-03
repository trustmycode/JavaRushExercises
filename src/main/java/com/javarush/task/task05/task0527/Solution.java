package com.javarush.task.task05.task0527;

/*
Том и Джерри
*/

public class Solution {
  public static void main(String[] args) {
    Mouse jerryMouse = new Mouse("Jerry", 12, 5);
    Cat tomCat = new Cat("Tom", 10, 5);
    Dog spikeDog = new Dog("Spike", 5, 10);
  }

  public static class Mouse {
    String name;
    int height;
    int tail;

    public Mouse(String name, int height, int tail) {
      this.name = name;
      this.height = height;
      this.tail = tail;
    }
  }

  public static class Cat {
    private String name;
    private int maxSpeed;
    private int strength;

    public Cat(String name, int maxSpeed, int strength) {
      this.name = name;
      this.maxSpeed = maxSpeed;
      this.strength = strength;
    }
  }

  public static class Dog {
    private String name;
    private int maxSpeed;
    private int strength;

    public Dog(String name, int maxSpeed, int strength) {
      this.name = name;
      this.maxSpeed = maxSpeed;
      this.strength = strength;
    }
  }
}
