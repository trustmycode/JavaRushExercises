package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/*
Только для богачей
*/

public class Solution {

  public static Map<String, Integer> createMap() {
    Map<String, Integer> map = new HashMap<>();
    map.put("Asdf", 500);
    map.put("Qwer", 450);
    map.put("Zxcv", 1500);
    map.put("Qazw", 600);
    map.put("Wsxe", 700);
    map.put("Edcr", 300);
    map.put("Zaqw", 340);
    map.put("Xswe", 1000);
    map.put("Rfds", 900);
    map.put("Vcxz", 700);
    return map;
  }

  public static void removeItemFromMap(Map<String, Integer> map) {
    Map<String, Integer> copyMap = new HashMap<>();
    for (Map.Entry<String, Integer> entry : map.entrySet()) {
      if (entry.getValue() < 500) {
        copyMap.put(entry.getKey(), entry.getValue());
      }
    }
    for (Map.Entry<String, Integer> entry : copyMap.entrySet()) {
      map.remove(entry.getKey());
    }
  }

  public static void main(String[] args) {

  }
}