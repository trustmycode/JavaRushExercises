package com.javarush.task.task07.task0714;

/*
Слова в обратном порядке
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
  public static void main(String[] args) throws Exception {
    // напишите тут ваш код
    ArrayList<String> strings = new ArrayList<>();
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    for (int i = 0; i < 5; i++) {
      strings.add(reader.readLine());
    }
    strings.remove(2);
    for (int i = 0; i < strings.size(); i++) {
      System.out.println(strings.get(strings.size() - 1 - i));
    }
  }
}
