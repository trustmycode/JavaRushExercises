package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Самая длинная строка
*/

public class Solution {

  private static ArrayList<String> strings;

  public static void main(String[] args) throws IOException {
    // напишите тут ваш код
    strings = new ArrayList<String>();
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    for (int i = 0; i < 5; i++) {
      strings.add(i, reader.readLine());
    }
    int strLength = 0;
    int buf;
    for (int i = 0; i < strings.size(); i++) {
      if (strings.get(i).length() > strLength) {
        strLength = strings.get(i).length();
      }
    }
    for (int i = 0; i < strings.size(); i++) {
      if (strings.get(i).length() == strLength) {
        System.out.println(strings.get(i));
      }
    }
  }
}
