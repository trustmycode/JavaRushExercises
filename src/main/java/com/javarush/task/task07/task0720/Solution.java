package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Перестановочка подоспела
*/

public class Solution {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    // напишите тут ваш код
    int n = Integer.parseInt(reader.readLine());
    int m = Integer.parseInt(reader.readLine());
    ArrayList<String> list = new ArrayList<>();
    while (list.size() < n) {
      list.add(reader.readLine());
    }
    int buf = 0;
    for (int i = 0; i < list.size(); i++) {
      if (i < m) {
        list.add(list.get(buf));
        list.remove(buf);
      }
    }
    for (String s : list) {
      System.out.println(s);
    }
  }
}
