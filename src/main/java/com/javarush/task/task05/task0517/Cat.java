package com.javarush.task.task05.task0517;

/*
Конструируем котиков
*/

public class Cat {

  // напишите тут ваш код
  private String name;
  private final int age;
  private final int weight;
  private String address;
  private final String color;

  public Cat(String name) {
    this.name = name;
    this.age = 5;
    this.weight = 10;
    this.color = "Black";
  }

  public Cat(String name, int weight, int age) {
    this.name = name;
    this.age = age;
    this.weight = weight;
    this.color = "Black";
  }

  public Cat(String name, int age) {
    this.name = name;
    this.age = age;
    this.weight = 10;
    this.color = "Black";
  }

  public Cat(int weight, String color) {
    this.age = 5;
    this.weight = weight;
    this.color = color;
  }

  public Cat(int weight, String color, String address) {
    this.age = 5;
    this.weight = weight;
    this.color = color;
    this.address = address;
  }

  public static void main(String[] args) {
  }
}
