package com.javarush.task.task05.task0513;

/*
Собираем прямоугольник
*/

public class Rectangle {

  // напишите тут ваш код
  public int top;
  public int left;
  public int width;
  public int height;

  public static void main(String[] args) {
  }

  public void initialize(int top, int left) {
    this.top = top;
    this.left = left;
  }

  public void initialize(int top, int left, int width, int height) {
    this.top = top;
    this.left = left;
    this.width = width;
    this.height = height;
  }

  public void initialize(int top) {
    this.top = top;
    this.left = 10;
    this.width = 15;
    this.height = 20;
  }

  public void initialize(int top, int left, int width) {
    this.top = top;
    this.left = left;
    this.width = width;
    this.height = width;
  }
}
