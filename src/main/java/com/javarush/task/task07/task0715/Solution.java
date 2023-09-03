package com.javarush.task.task07.task0715;

/*
Продолжаем мыть раму
*/

import java.util.ArrayList;

public class Solution {

  public static void main(String[] args) {
    // напишите тут ваш код
    ArrayList<String> strings = new ArrayList<>();
    strings.add("мама");
    strings.add("мыла");
    strings.add("раму");
    for (int i = 0; i < strings.size(); i++) {
      if (strings.get(i).equals("мама") || strings.get(i).equals("мыла") || strings.get(i)
          .equals("раму")) {
        strings.add(i + 1, "именно");
      }
    }
    for (String string : strings) {
      System.out.println(string);
    }
  }
}
