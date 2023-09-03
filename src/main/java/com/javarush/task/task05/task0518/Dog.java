package com.javarush.task.task05.task0518;

/*
Регистрируем собачек
*/

public class Dog {

  // напишите тут ваш код
  private final String name;
  private int age;
  private String color;

  public Dog(String name) {
    this.name = name;
  }

  public Dog(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public Dog(String name, int age, String color) {
    this.name = name;
    this.age = age;
    this.color = color;
  }

  public static void main(String[] args) {
    try {
      System.out.print("Try ");
      throw new Exception();
    } catch (Exception e) {
      System.out.print("Catch ");
    } finally {
      System.out.print("Finally ");
    }
    System.out.print("Done");
  }
}
