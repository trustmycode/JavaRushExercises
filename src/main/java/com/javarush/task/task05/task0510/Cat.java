package com.javarush.task.task05.task0510;

/*
Кошкоинициация
*/

public class Cat {
  // напишите тут ваш код
  public String name;
  public int weight;
  public int age;
  public String color;
  public String address;

  public void initialize(String name) {
    this.name = name;
    this.weight = 10;
    this.age = 7;
    this.color = "Red";
  }

  public void initialize(String name, int weight, int age) {
    this.name = name;
    this.weight = weight;
    this.age = age;
    this.color = "Red";
  }

  public void initialize(String name, int age) {
    this.name = name;
    this.weight = 10;
    this.age = age;
    this.color = "Red";
  }

  public void initialize(int weight, String color) {
    this.weight = weight;
    this.age = 7;
    this.color = color;
  }

  public void initialize(int weight, String color, String address) {
    this.weight = weight;
    this.age = 7;
    this.color = color;
    this.address = address;
  }
}
