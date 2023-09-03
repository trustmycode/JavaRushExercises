package com.javarush.task.task07.task0703;

/*
Общение одиноких массивов
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
  public static void main(String[] args) throws Exception {
    // напишите тут ваш код
    String[] arrayStr = new String[10];
    int[] arrayInt = new int[10];
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    for (int i = 0; i < arrayStr.length; i++) {
      arrayStr[i] = reader.readLine();
    }
    for (int i = 0; i < arrayInt.length; i++) {
      arrayInt[i] = arrayStr[i].length();
      System.out.println(arrayInt[i]);
    }
  }
}
