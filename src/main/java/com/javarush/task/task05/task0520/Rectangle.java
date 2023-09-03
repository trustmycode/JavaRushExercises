package com.javarush.task.task05.task0520;

/*
Создать класс прямоугольник (Rectangle)
*/

public class Rectangle {
  // напишите тут ваш код
  private int top;
  private int left;
  private int width;
  private int height;

  public Rectangle(int top, int left) {
    this.top = top;
    this.left = left;
  }

  public Rectangle(int top, int left, int width) {
    this.top = top;
    this.left = left;
    this.width = width;
    this.height = width;
  }

  public Rectangle(int width) {
    this.top = 10;
    this.left = 10;
    this.width = width;
    this.height = 2 * width;
  }

  public Rectangle(int top, int left, int width, int height) {
    this.top = top;
    this.left = left;
    this.width = width;
    this.height = height;
  }

  public static void main(String[] args) {}
}
