package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Самые-самые
*/

public class Solution {

  public static void main(String[] args) throws IOException {
    // напишите тут ваш код
    ArrayList<String> strings = new ArrayList<>();
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int stSizeMax = Integer.MIN_VALUE;
    int stSizeMin = Integer.MAX_VALUE;
    for (int i = 0; i < 10; i++) {
      strings.add(i, reader.readLine());
      if (strings.get(i).length() > stSizeMax) {
        stSizeMax = strings.get(i).length();
      } else if (strings.get(i).length() < stSizeMin) {
        stSizeMin = strings.get(i).length();
      }
    }
    for (int i = 0; i < strings.size(); i++) {
      if (strings.get(i).length() == stSizeMax) {
        System.out.println(strings.get(i));
        break;
      } else if (strings.get(i).length() == stSizeMin) {
        System.out.println(strings.get(i));
        break;
      }
    }
  }
}
