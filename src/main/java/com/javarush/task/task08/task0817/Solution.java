package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
Нам повторы не нужны
*/

public class Solution {

  public static Map<String, String> createMap() {
    //напишите тут ваш код
    Map<String, String> map = new HashMap<>();
    map.put("Sadf", "Sfasd");
    map.put("Ewqr", "Sfasd");
    map.put("Xczx", "Qrwer");
    map.put("Zaswqe", "Wdasd");
    map.put("Vseda", "Sfasd");
    map.put("Erqeq", "Zxcaed");
    map.put("Gdsac", "Qeasd");
    map.put("Aszcx", "Zaqwe");
    map.put("Rfdss", "Sxccz");
    map.put("Zsads", "Whvis");
    return map;
  }

  public static void removeTheFirstNameDuplicates(Map<String, String> map) {
    Set<String> set = new HashSet<>(map.values());
    Map<String, String> stringMap = new HashMap<>(map);
    for (String string : set) {
      int count = 0;
      for (Map.Entry<String, String> entry : stringMap.entrySet()) {
        if (string.equals(entry.getValue())) {
          count++;
        }
        if (count > 1) {
          removeItemFromMapByValue(map, string);
        }
      }
    }
  }

  public static void removeItemFromMapByValue(Map<String, String> map, String value) {
    Map<String, String> copy = new HashMap<>(map);
    for (Map.Entry<String, String> pair : copy.entrySet()) {
      if (pair.getValue().equals(value)) {
        map.remove(pair.getKey());
      }
    }
  }

  public static void main(String[] args) {

  }
}