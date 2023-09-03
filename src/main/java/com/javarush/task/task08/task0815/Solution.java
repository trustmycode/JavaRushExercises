package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/*
Перепись населения
*/

public class Solution {

  public static Map<String, String> createMap() {
    Map<String, String> map = new HashMap<>();
    for (int i = 0; i < 10; i++) {
      map.put("ASD" + i + (int) (Math.random() * 10 + 1),
          "ASD" + i + (int) (Math.random() * 10 + 1));
    }
    return map;
  }

  public static int getCountTheSameFirstName(Map<String, String> map, String name) {
    int count = 0;
    for (Map.Entry<String, String> entry : map.entrySet()) {
      if (name.equals(entry.getValue())) {
        count++;
      }
    }
    return count;
  }

  public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
    //напишите тут ваш код
    return map.containsKey(lastName) ? 1 : 0;

  }

  public static void main(String[] args) {
  }
}