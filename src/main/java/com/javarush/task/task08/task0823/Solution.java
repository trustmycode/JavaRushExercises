package com.javarush.task.task08.task0823;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/*
Омовение Рамы
*/

public class Solution {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String string = reader.readLine();
    StringBuilder stringBuilder = new StringBuilder();
    String[] strings = string.split(" ");
    for (int i = 0; i < strings.length; i++) {
      if (!strings[i].isEmpty()) {
        char[] chars = strings[i].toCharArray();
        chars[0] = Character.toUpperCase(chars[0]);
        if (i != strings.length - 1) {
          stringBuilder.append(String.valueOf(chars)).append(" ");
        } else {
          stringBuilder.append(String.valueOf(chars));
        }
      } else {
        stringBuilder.append(" ");
      }
    }
    System.out.println(stringBuilder);
    //напишите тут ваш код
  }
}