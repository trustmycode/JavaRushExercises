package com.javarush.task.task09.task0912;

/*
Исключение при работе с числами Ӏ Java Syntax: 9 уровень, 6 лекция
*/

public class Solution {
  public static void main(String[] args) {
    try { // напишите тут ваш код

      int num = Integer.parseInt("XYZ");
      System.out.println(num);

    } catch (NumberFormatException e) {
      System.out.println(e.getClass()); // напишите тут ваш код
    }
  }
}
