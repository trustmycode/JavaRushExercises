package com.javarush.task.task10.task1019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/*
Функциональности маловато!
*/

public class Solution {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String name;
    int id;
    HashMap<String, Integer> pair = new HashMap<>();
    while (true) {
      String read = reader.readLine();
      if (read.isEmpty()) {
        break;
      }
      id = Integer.parseInt(read);
      name = reader.readLine();

      pair.put(name, id);
    }
    for (Map.Entry<String, Integer> entry : pair.entrySet()) {
      System.out.println(entry.getValue() + " " + entry.getKey());
    }
  }
}
