package com.javarush.task.task07.task0710;

/*
В начало списка
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {

  public static void main(String[] args) throws Exception {
    // напишите тут ваш код
    ArrayList<String> strings = new ArrayList<String>();
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    for (int i = 0; i < 10; i++) {
      strings.add(0, reader.readLine());
    }
    for (int i = 0; i < strings.size(); i++) {
      System.out.println(strings.get(i));
    }
  }
}
