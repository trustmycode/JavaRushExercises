package com.javarush.task.task10.task1011;

/*
Большая зарплата
*/

public class Solution {
  public static void main(String[] args) {
    String text = "Я не хочу изучать Java, я хочу большую зарплату";

    for (int i = 0; i < 40; i++) {
      System.out.println(text); // напишите тут ваш код
      text = text.substring(1);
    }
  }
}
